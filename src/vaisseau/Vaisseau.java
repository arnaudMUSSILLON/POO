/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vaisseau;

import iut.Game;
import projetpoo.Ennemi;

/**
 *
 * @author vm497823
 */
public abstract class Vaisseau extends Ennemi {

    protected boolean indestrucible;

    public Vaisseau(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }
    
}
