/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JeuForm;

import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class ConteneurFormes {
    ArrayList<Forme> formes;

    public ConteneurFormes() {
        this.formes = new ArrayList<>();
    }
    
    void add(Forme forme){
        this.formes.add(forme);
    }
    
}
