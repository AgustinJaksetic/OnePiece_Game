package com.pium.mapa;

import java.util.ArrayList;
import static com.pium.mapa.Villa_Foosha1.villa_foosha;
import static com.pium.mapa.Alvida_Ship2.alvida_ship;
import static com.pium.mapa.Shells_Town3.shells_town;

public class Loader {
    public static ArrayList<int[][]> mapa = new ArrayList<>();
    public Loader(){
        System.out.println(loadMaps());
    }

    private String loadMaps(){
        mapa.add(villa_foosha);
        mapa.add(alvida_ship);
        mapa.add(shells_town);
        return "Loaded Maps";

    }

}
