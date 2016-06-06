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
    private Joueur j;
    
    public BonusMalus(Game g, String nom, int x, int y, Joueur joueur) {
        super(g, nom, x, y);
        j = joueur;
    }

    @Override
    public boolean isEnnemy() {
        return true;
    }

    @Override
    public boolean isFriend() {
        return false;
    }
    
    public Joueur getJoueur(){
        return j;
    }
}
