/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asteroide;

import projetpoo.Ennemi;

/**
 *
 * @author cp071232
 */
public abstract class Asteroide extends Ennemi{

    @Override
    protected void specialMove(long dt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean isDestructible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    protected void Detruit(){
        
    }
    
    protected abstract void Split();
    

    
}

