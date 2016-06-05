/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package afficheur;

import iut.Game;
import iut.Objet;

/**
 *
 * @author ap775722
 */
public class Afficheurs extends iut.Objet{

    public Afficheurs(Game g, String nom, double _x, double _y) {
        super(g, nom, _x, _y);
    }
    
    @Override
    public boolean collision(Objet objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void effect(Objet objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean isFriend(){
        boolean res = false;
        return res;
    }
    
    public boolean isEnnemy(){
        boolean res=false;
        return res;
    }

    @Override
    public void move(long l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
