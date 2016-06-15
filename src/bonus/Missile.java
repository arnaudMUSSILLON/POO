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
public class Missile extends BonusMalus{

    private double vitesseX = 20;
    public Missile(Game g, String nom, int x, int y) {
        super(g, nom, x, y);                        // nom = "missile"
    }

    @Override
    public void effect(Objet objet) {
        if(objet.isEnnemy()){
            game().remove(this);            
        }
    }

    @Override
    public void move(long l) {
        {
            this.moveX (this.vitesseX);
        }
    }
    
}
