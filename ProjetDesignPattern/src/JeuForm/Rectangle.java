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
public class Rectangle extends Point implements Forme{
    private double largeur;
    private double hauteur;
    
    public Rectangle(Point point,double largeur,double hauteur) {
        super(point.getX(), point.getY());
        this.hauteur=hauteur;
        this.largeur=largeur;
    }

    @Override
    public double calculSurface() {
        return this.largeur*this.hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }
    
    
}
