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
import jeuform.Model.Rectangle;
import util.FormeListener;

/**
 *
 * @author ilyas
 */
public class VueRectangle extends VueForme{
    
    protected Rectangle rec;

    public VueRectangle(Rectangle rec) {
        this.rec = rec;
    }

    @Override
    public void paint(Graphics2D g) {
        //g.drawRect(this.rec.getX(), this.rec.getY(), this.rec.getLargeur(), this.rec.getLongeur());
        g.drawRect((int)this.rec.getX(), (int)this.rec.getY(),(int) this.rec.getLargeur(), (int)this.rec.getLongeur());
        g.setColor(Color.BLUE);
        g.fillRect((int)this.rec.getX(), (int)this.rec.getY(),(int) this.rec.getLargeur(), (int)this.rec.getLongeur());
    }
    
}
