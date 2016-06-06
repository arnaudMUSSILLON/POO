/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus;

import iut.Game;
import iut.Objet;
import projetpoo.Joueur;

/**
 *
 * @author Arno
 */
public class Missile extends BonusMalus{

    public Missile(Game g, String nom, int x, int y, Joueur j) {
        super(g, nom, x, y,j);                        // nom = "missile"
    }

    @Override
    public void effect(Objet objet) {
        
    }

    @Override
    public void move(long l) {
        
    }
    
}
