/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus;

import iut.Game;
import iut.Objet;

/**
 *
 * @author Arno
 */
public class Bouclier extends BonusMalus{
    
    private int duree;
    private int energie;

    public Bouclier(Game g, int x, int y) {
        super(g, "bouclier", x, y);
        duree = 20;
        energie = 500;
    }
    
    @Override
    public void effect(Objet o) {
        if (o.isEnnemy()){
            energie -= 300;
        }
    }

    @Override
    public void move(long dt) {
        
    }
    
}
