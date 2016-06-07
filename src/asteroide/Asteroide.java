/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asteroide;

import iut.Game;
import iut.Objet;
import projetpoo.Ennemi;

/**
 *
 * @author cp071232
 */
public abstract class Asteroide extends Ennemi{

    public Asteroide(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

    @Override
    protected void specialMove(long dt) {
    move(dt);
    if (this.getLeft() < 0) {
        game().remove(this);
    }
    }

    @Override
    protected boolean isDestructible() {
    return true;
    }
    
    @Override
    protected void Detruit(){
        game().remove(this);
    }
    
    @Override
    public void effect(Objet o){
        if(o.isFriend()) 
        {
            
            this.Detruit();
            this.Split();
            
        }
    }
    
    protected abstract void Split();
    
    
    
}

