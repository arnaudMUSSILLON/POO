/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asteroide;

import iut.Game;
import projetpoo.Jeu;

/**
 *
 * @author cp071232
 */
public class GrandAsteroide extends Asteroide {

    public GrandAsteroide(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

    @Override
    protected void Split() {
        
        this.Detruit();
        AsteroideMoyen a2 = new AsteroideMoyen (game(), "asteroide3",this.getLeft(),this.getTop()+200);
        AsteroideMoyen a3 = new AsteroideMoyen (game(), "asteroide3",this.getLeft(),this.getTop()-200);
        game().add(a2);
        game().add(a3);
        
    }
    
}
