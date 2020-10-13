/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JeuForm;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author mac
 */
public class VueConteneur extends JPanel{
    ArrayList<Vue> vues;

    public VueConteneur() {
        this.vues = new ArrayList<>();
    }
    
    void addVue(Vue vue){
        vues.add(vue);
    }

    @Override
    protected void paintComponent(Graphics g) { 
        Graphics2D gr=(Graphics2D) g;
        for (Vue vue : vues) {
            vue.paint(gr);
        }
    }
    
    
    
    
    
}
