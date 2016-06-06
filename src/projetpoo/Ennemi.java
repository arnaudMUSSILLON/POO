/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetpoo;

import iut.Game;
import iut.Objet;
import iut.ObjetTouchable;

/**
 *
 * @author cp071232
 */
public abstract class Ennemi extends ObjetTouchable{

    double vitesseX;
    double vitesseY;

    public Ennemi(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
        this.vitesseX=1;
        this.vitesseY=0;
    }
    

    
    public void effect(Objet o){
      /*  if (o.isFriend())
        {
            
        }*/
    }
    
    public boolean isFriend(){
        return false;
        
    }
    
    public boolean isEnnemy(){
        return true;
    }
    
    public void move(long dt){
        
        
    }
    
    protected abstract void specialMove(long dt);
    protected abstract boolean isDestructible();
    
    protected void Detruit(){
        
    }

}
