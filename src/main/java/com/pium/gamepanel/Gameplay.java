package com.pium.gamepanel;

public class Gameplay {
    static Logic logic = new Logic();

    public Gameplay(){
        initGame();
    }

    public void initGame(){
        while(true){
            logic.movDown();
            logic.movRight();
            logic.movRight();
            logic.movRight();

            break;

       }
    }
}
