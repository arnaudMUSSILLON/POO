/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetpoo;

import iut.Game;
import iut.Objet;
import iut.ObjetTouchable;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

/**
 *
 * @author cp071232
 */
public abstract class Ennemi extends ObjetTouchable{

    protected double vitesseX;
    protected double vitesseY;
    private URL u1;
    private AudioClip a1;

    public Ennemi(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
        this.vitesseX=-0.1;
        this.vitesseY=0;
    }
    

    
    public void effect(Objet o){
        if (o.isFriend())
        {
            this.Detruit();
        }
        if ((o.isFriend())&&(isDestructible() == true)){
            game().remove(this);
            u1 = this.getClass().getClassLoader().getResource("vaisseauEnnemiDestruction.wav");
            a1 = Applet.newAudioClip(u1);
            a1.play();
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
        if (this.getLeft() < -500){
            game().remove(this);
        }
                
    }
    
    protected abstract void specialMove(long dt);
    protected abstract boolean isDestructible();
    
    protected void Detruit(){
        
    }

}
