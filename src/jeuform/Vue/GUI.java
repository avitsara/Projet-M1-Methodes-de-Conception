/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuform.Vue;

import Model.Cercle;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import jeuform.Model.ConteneurForme;
import jeuform.Model.Forme;
import jeuform.Model.Rectangle;

/**
 *
 * @author ilyas
 */
public class GUI extends JFrame implements MouseListener  {
    
    private VueRectangle vueRec;
    private ArrayList<VueForme> vueFormes;
    
    public GUI(){
        
        vueFormes = new ArrayList();
        ConteneurForme conteneurFormes = new ConteneurForme();
        Rectangle rec = new Rectangle(50,50,100,100);
        VueRectangle vueRec = new VueRectangle(rec);
        vueFormes.add(vueRec);
        conteneurFormes.add(rec);
        VueJeu2D vue = new VueJeu2D(vueFormes,conteneurFormes);
        
        this.add(vue);
        this.setSize(1000, 700);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
