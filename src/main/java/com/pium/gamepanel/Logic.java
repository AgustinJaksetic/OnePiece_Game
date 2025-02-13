package com.pium.gamepanel;

import com.pium.player.Player;

import static com.pium.mapa.Loader.mapa;

public class Logic{
    static Player luffy = new Player(0);

    public void movRight(){
        luffy.setPosx(luffy.getPosx() + 1);
        if(posCheck()){
            System.out.println("*Se mueve a la Derecha*");
            //logica mover Derecha
        }
    }

    public void movLeft(){
        luffy.setPosx(luffy.getPosx() - 1);
        if(posCheck()){
            System.out.println("*Se mueve a la Izquierda*");
            //logica mover Izquierda
        }
    }

    public void movUp(){
        luffy.setPosy(luffy.getPosy() - 1);
        if(posCheck()){
            System.out.println("*Se mueve Arriba*");
            //logica mover Arriba
        }
    }

    public void movDown(){
        luffy.setPosy(luffy.getPosy() + 1);
        if(posCheck()){
            System.out.println("*Se mueve Abajo*");
            //logica mover Abajo
        }

    }

    public boolean posCheck(){
        if(mapa.get(luffy.getPosm())[luffy.getPosy()][luffy.getPosx()] == 1) {
            System.out.println("BATALLA INICIADA");
            //llamamos a la funcion que inicie la batalla
            return false;
        }else if(mapa.get(luffy.getPosm())[luffy.getPosy()][luffy.getPosx()] == 2){

            if(luffy.getPosm() <= mapa.size()){
                System.out.println("Cambio de mapa");
                luffy.setPosm(luffy.getPosm() + 1);
            }else{
                System.out.println("Fin del juego");
            }
            return false;

        }else{
            return true;
        }
    }
}