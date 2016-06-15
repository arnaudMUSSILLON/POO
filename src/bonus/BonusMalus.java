/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus;

import iut.Game;
import projetpoo.Joueur;

/**
 *
 * @author Arno
 */
public abstract class BonusMalus extends iut.ObjetTouchable {
    
    public BonusMalus(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

    @Override
    public boolean isEnnemy() {
        return false;
    }

    @Override
    public boolean isFriend() {
        return true;
    }
    
}
