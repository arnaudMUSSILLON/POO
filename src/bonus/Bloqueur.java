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
public class Bloqueur extends BonusMalus{

    private Joueur j;
    private double vitesseX = -2;
    
    public Bloqueur(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }
    
    @Override
    public void effect(Objet objet) {
        if(objet.isFriend()){
            j.bloque();
            this.game().remove(this);
        }
    }            
    @Override
    public void move(long l) {
        this.moveX(this.vitesseX);
    }
    
}
