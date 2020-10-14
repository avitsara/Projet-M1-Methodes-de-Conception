/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeuform.Model;

import Model.*;

/**
 *
 * @author ilyas
 */
public class Rectangle extends Forme{
    
    private float largeur;
    private float longeur;
    // position, dimension 
    
    public Rectangle(float x,float y,float lr,float lg) {
       super.x=x;
       super.y=y;
       super.surface = lr*lg;
       this.largeur= lr;
       this.longeur = lg;
       
    }
    
    @Override
    public void translation(float dx, float dy) {
        this.x += dx;
        this.y += dy;
        fireChangement();
    }

    @Override
    public void suppression(Forme forme) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void redimension(Forme forme) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float calculSurface() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public float getLongeur() {
        return longeur;
    }

    public void setLongeur(float longeur) {
        this.longeur = longeur;
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

   
}
