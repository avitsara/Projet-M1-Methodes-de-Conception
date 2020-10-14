/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuform.Vue;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;
import jeuform.Model.ConteneurForme;
import jeuform.Model.Forme;
import util.ContenerListener;
import util.FormeListener;

/**
 *
 * @author ilyas
 */
public class VueJeu2D extends JPanel implements ContenerListener,FormeListener{
    
    private ArrayList<VueForme> vueFormes;
    private ConteneurForme conteneurFormes;

    public VueJeu2D(ArrayList<VueForme> vueFormes ,ConteneurForme conteneurFormes) {
        this.vueFormes = vueFormes;
        this.conteneurFormes = conteneurFormes;
    }
    
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        for( VueForme vueForme : vueFormes ) {
            vueForme.paint(g2);
        }
    }   
    
    @Override
    public void formeAjoutee(Forme forme) {
        forme.ajoutEcouteur(this);
        this.conteneurFormes.add(forme);
    }

    @Override
    public void formeRetiree(Forme forme) {
        this.conteneurFormes.remove(forme);
    }

    @Override
    public void FormeMiseAJour(Object ob) {
        repaint();
    }
    
}
