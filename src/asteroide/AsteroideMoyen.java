/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asteroide;

import iut.Game;

/**
 *
 * @author cp071232
 */
public class AsteroideMoyen extends Asteroide {

    public AsteroideMoyen(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

    @Override
    protected void Split() {
        this.Detruit();
        PetitAsteroide a2 = new PetitAsteroide (game(), "asteroide3",this.getLeft(),this.getTop()+100);
        PetitAsteroide a3 = new PetitAsteroide (game(), "asteroide3",this.getLeft(),this.getTop()-100);
        game().add(a2);
        game().add(a3);
    }
    
}
