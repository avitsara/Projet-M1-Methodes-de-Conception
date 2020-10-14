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
public class Cercle extends Forme{

    private float rayon;
    public Cercle(float x,float y, float rayon) {
        super.x = x;
        super.y = y;
        super.surface = (float) (Math.PI * Math.pow(2, rayon));
        this.rayon = rayon;
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

    public float getRayon() {
        return rayon;
    }

    public void setRayon(float rayon) {
        this.rayon = rayon;
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
