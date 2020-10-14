/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ilyas
 */
abstract public class AbstractFormeListener {
    private List<FormeListener> ecouteurs;
    
    public AbstractFormeListener(){
        this.ecouteurs = new ArrayList<FormeListener>();
    }
    public void ajoutEcouteur(FormeListener e){
    
        this.ecouteurs.add(e);
    }
    
    public void retraitEcouteur(FormeListener e){
        this.ecouteurs.remove(e);
    }
    
    protected void fireChangement(){
        for(FormeListener e: this.ecouteurs){
            e.FormeMiseAJour(this);
        }
    }
}
