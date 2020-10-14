/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import jeuform.Model.Forme;

/**
 *
 * @author ilyas
 */
public interface ContenerListener {
    abstract public void formeAjoutee(Forme forme);
    abstract public void formeRetiree(Forme forme);

}
