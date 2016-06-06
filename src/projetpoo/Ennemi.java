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
        this.vitesseX=-0.10;
        this.vitesseY=0;
    }
    

    
    public void effect(Objet o){
        if (o.isFriend())
        {
            this.Detruit();
        }
    }
    
    @Override
    public boolean isFriend(){
        return false;
        
    }
    
    @Override
    public boolean isEnnemy(){
        return true;
    }
    
    @Override
    public void move(long dt){
        move(dt*vitesseX,dt*vitesseY);
                
    }
    
    protected abstract void specialMove(long dt);
    protected abstract boolean isDestructible();
    
    protected void Detruit(){
        
    }

}
