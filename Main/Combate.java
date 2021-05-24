package Main;
import FabricaEnemigos.*;
import java.util.Random;

public class Combate {

    public int combatir(Jugador jugador,int mundo,int num_enemigo){
        GestorEnemigos gestor=new GestorEnemigos(mundo,num_enemigo);
        Random rd = new Random();
        gestor.getEnemigo().getDescripcion();
        boolean b=rd.nextBoolean();
        int decisionj=0,decisione=0;
        while(jugador.getMuerte()==false&&gestor.getEnemigo().getMuerte()==false){
            //Accion jugador
            //Primero se comprueba el estado del jugador y despues se llama al metodo decidirAccion del propio jugador
            //Si bloquea , la variable defensa del jugador cambiara a true
            System.out.println("Turno Jugador");                                         
            if(!jugador.getEstado().getDescrString().equals("Normal")){                
                System.out.println("Tu personaje esta "+jugador.getEstado().getDescrString()+"!");
                decisionj=-1;
            }
            else{
                decisionj=jugador.decidirAccion();
                if(decisionj==0)
                    jugador.cambiarDefensa();
            }//


            //Accion enemigo
            //Primerp se comprueba el estado del enemigo y depues se llama a su estrategia para la decision
            //Si bloquea , la variable defensa del enemigo cambiara a true
            
            System.out.println("Turno Enemigo");                                          
            if(!gestor.getEnemigo().getEstado().getDescrString().equals("Normal")){        
                System.out.println("El enemigo esta "+gestor.getEnemigo().getEstado().getDescrString()+"!");
                decisione=-1;
            }
            else{
                decisione=gestor.getEnemigo().getEstrategia().decidirAccion();
                if(decisione==0){
                    gestor.getEnemigo().cambiarDefensa();
                }
            }//


            System.out.println(decisione);
            System.out.println(decisionj);


            //Calculo de daños
            //Primero se comprueba el orden de prioridad. Si b==true se calculan primero los daños del jugador y despues del enemigo, 
            //si b==false se calculan primero los del enemigo
           if(b==true){
                if(decisionj<0){
                    System.out.println("Como estas "+jugador.getEstado().getDescrString()+" no tomas accion!");
                    jugador.getEstado().nextEstado();
                }
                else if(decisionj==0){
                    System.out.println("Te has defendido!");
                }
                else{
                    if(decisione==0){
                        System.out.println("El enemigo ha bloqueado tu ataque!"); //Si el enemigo ha bloqueado ,el jugador pasara a estado confuso, y el siguiente turno se quedara paralizado
                        jugador.getEstado().nextEstado();
                    }
                    else{
                        System.out.println("Tu ataque ha surgido efecto!");
                        gestor.getEnemigo().perderVida(decisionj);
                        if(gestor.getEnemigo().getMuerte()==true){
                            System.out.println("Has ganado!");
                            return 1;
                        }
                    }
                }
                


                if(decisione<0){
                    System.out.println("Como el enemigo esta "+gestor.getEnemigo().getEstado().getDescrString()+" no toma accion!");
                    gestor.getEnemigo().getEstado().nextEstado();
                }
                else if(decisione==0){
                    System.out.println("El enemigo se ha defendido!");
                }
                else{
                    if(decisionj==0){
                        System.out.println("Bloqueas el ataque del enemigo!");//Si el jugador ha bloqueado ,el enemigo pasara a estado confuso, y el siguiente turno se quedara paralizado
                        gestor.getEnemigo().getEstado().nextEstado();
                    }
                    else{
                        System.out.println("Su ataque ha surgido efecto!");
                        jugador.perderVida(decisionj);
                        if(jugador.getResistencia()<0){
                            System.out.println("Has perdido!");
                            return 0;
                        }
                    }
                }
                gestor.getEnemigo().quitarDefensa();
                jugador.quitarDefensa();
            }
            //Lo mismo pero con el orden de prioridad cambiado
            //El enemigo calculara los daños primero
            else{
                if(decisione<0){
                    System.out.println("Como el enemigo esta "+gestor.getEnemigo().getEstado().getDescrString()+" no toma accion!");
                    gestor.getEnemigo().getEstado().nextEstado();
                }
                else if(decisione==0){
                    System.out.println("El enemigo se ha defendido!");
                }
                else{
                    if(decisionj==0){
                        System.out.println("Bloqueas el ataque del enemigo!");
                        gestor.getEnemigo().getEstado().nextEstado();
                    }
                    else{
                        System.out.println("Su ataque ha surgido efecto!");
                        jugador.perderVida(decisionj);
                        if(jugador.getResistencia()<0){
                            System.out.println("Has perdido!");
                            return 0;
                        }
                    }
                }


                if(decisionj<0){
                    System.out.println("Como estas "+jugador.getEstado().getDescrString()+" no tomas accion!");
                    jugador.getEstado().nextEstado();
                }
                else if(decisionj==0){
                    System.out.println("Te has defendido!");
                }
                else{
                    if(decisione==0){
                        System.out.println("El enemigo ha bloqueado tu ataque!");
                        jugador.getEstado().nextEstado();
                    }
                    else{
                        System.out.println("Tu ataque ha surgido efecto!");
                        gestor.getEnemigo().perderVida(decisionj);
                        if(gestor.getEnemigo().getMuerte()==true){
                            System.out.println("Has ganado!");
                            return 1;
                        }
                    }
                }

                gestor.getEnemigo().quitarDefensa();//Una vez termine cada turno se quitara la variable de defensa de cada personaje,
                jugador.quitarDefensa();            //dando a entender que esta dejando de bloquear
            }
            b=!b;
        }
        return 1;
    }
    
}
