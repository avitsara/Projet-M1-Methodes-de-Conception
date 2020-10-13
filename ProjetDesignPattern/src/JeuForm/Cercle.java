/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JeuForm;

/**
 *
 * @author mac
 */
public class Cercle extends Point implements Forme{
    private double rayon;
    
    public Cercle(Point point,double rayon) {
        super(point.getX(), point.getY());
        this.rayon=rayon;
    }

    @Override
    public double calculSurface() {
        return Math.sqrt(rayon)*Math.PI;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    
    
}
