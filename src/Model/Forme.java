/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ilyas
 */
public abstract class Forme {
    
    protected float surface;
    protected float x;
    protected float y;
    
    abstract public void translation(float x,float y);
    abstract public void suppression(Forme forme);
    abstract public void redimension(Forme forme);
    abstract public float calculSurface();
}
