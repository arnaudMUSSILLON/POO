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
public abstract class Afficheurs extends iut.Objet{

    public Afficheurs(Game g, String nom, double _x, double _y) {
        super(g, nom, _x, _y);
    }
    
    @Override
    public boolean collision(Objet objet) {
        return false;
    }
    
    @Override
    public void effect(Objet objet) {
        
    }
    
    @Override
    public boolean isFriend(){
        boolean res = false;
        return res;
    }
    
    @Override
    public boolean isEnnemy(){
        boolean res=false;
        return res;
    }
    
    @Override
    public abstract void move(long l);
}
