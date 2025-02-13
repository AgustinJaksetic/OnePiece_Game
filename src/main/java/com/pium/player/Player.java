package com.pium.player;

import java.util.List;

public class Player {
    private List<Inventory> inventory;
    private int posy;
    private int posx;
    private int posm = 0;

    public Player(int posm){
        this.posy = 0;
        this.posx = 0;
        this.posm = posm;

    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public List<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(List<Inventory> inventory) {
        this.inventory = inventory;
    }

    public int getPosm() {
        return posm;
    }

    public void setPosm(int posm) {
        this.posm = posm;
    }
}
