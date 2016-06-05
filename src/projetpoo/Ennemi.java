/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetpoo;

import iut.Objet;

/**
 *
 * @author cp071232
 */
public abstract class Ennemi {

    double vitesseX;
    double vitesseY;
    
    public Ennemi(){
        this.vitesseX=0;
        this.vitesseY=0;
    }
    
    public void effect(Objet o){
        
    }
    
    public boolean isFriend(){
        return true;
        
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
