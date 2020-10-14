/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuform.Model;

import java.util.ArrayList;

/**
 *
 * @author ilyas
 */
public class ConteneurForme {
    private ArrayList<Forme> formes;

    public ConteneurForme() {
        this.formes = new ArrayList<>();
    }
    
    public void add(Forme forme){
        formes.add(forme);
    }
    
    public void remove(Forme forme){
        formes.remove(forme);
    }
    
    public ArrayList<Forme> getForme() {
        return formes;
    }

    public void setForme(ArrayList<Forme> forme) {
        this.formes = forme;
    }
    
    

    
    
}
