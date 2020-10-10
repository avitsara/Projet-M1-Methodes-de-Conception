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
public class Rectangle extends Forme{
    
    private float largeur;
    private float longeur;
    // position, dimension 
    
    public Rectangle(float x,float y,float lr,float lg  ) {
       super.x=x;
       super.y=y;
       this.largeur= lr;
       this.longeur = lg;
       
    }
    
    @Override
    public void translation(float x, float y) {
        
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
    
}
