/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuform.Vue;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import jeuform.Model.Cercle;
import util.FormeListener;

/**
 *
 * @author ilyas
 */
public class VueCercle extends VueForme{
    
    
    protected Cercle cercle;

    public VueCercle(Cercle cercle) {
        this.cercle = cercle;
        //cercle.ajoutEcouteur(this);
    }
    
    @Override
    public void paint(Graphics2D g) {
        Graphics2D g2 = (Graphics2D)g;
        Ellipse2D e = new Ellipse2D.Float(40, 40, 120, 120);
        GradientPaint graphic_p = new GradientPaint(75, 75, Color.WHITE,95, 95, Color.GRAY, true);
        g2.setPaint(graphic_p);
        g2.fill(e);
    }
    
    public void FormeMiseAJour(Object ob) {
        repaint();
    }
}
