/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vaisseau;

import iut.Game;

/**
 *
 * @author vm497823
 */
public class Alien2 extends Vaisseau{

    public Alien2(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
        this.vitesseY=-0.5;
        this.vitesseX=-0.5;
    }

    @Override
    public void move(long dt){
        if (this.getTop()<=300){
            this.vitesseY=-vitesseY;
            move(dt*vitesseX,dt*vitesseY);
        }
        else if (this.getBottom()>=500){
            this.vitesseY=-vitesseY;
            move(dt*vitesseX,dt*vitesseY);
        }
        else {
            move(dt*vitesseX,dt*vitesseY);
        }
        if (this.getLeft()<-500){
            game().remove(this);
        }
    }
    
    @Override
    public void specialMove(long dt){
        
    }
    
    @Override
    public boolean isDestructible(){

            return true;
    }
}
