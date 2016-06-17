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
public class Alien3 extends Vaisseau{

    public Alien3(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

    @Override
    public void move(long dt){
        
    }
    
    @Override
    public void specialMove(long dt){
        
    }
    
    @Override
    public boolean isDestructible(){
        if (indestrucible == true){
            return true;
        }else{
            return false;
        }
    }
}
