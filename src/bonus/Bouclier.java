/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus;

import afficheur.JaugeBouclier;
import iut.Game;
import iut.Objet;
import projetpoo.Joueur;

/**
 *
 * @author Arno
 */
public class Bouclier extends BonusMalus{
    
    private Joueur j;
    private double vitesseX = -2;

    public Bouclier(Game g,String nom, int x, int y) {
        super(g, nom, x, y);                                //nom = "bouclier"
        
    }
    
    @Override
    public void effect(Objet o) {
        if (o.isFriend()){
            JaugeBouclier bouclierAffichage = new JaugeBouclier(this.game());
            this.game().remove(this);
            Joueur.setBoolBouclier(true);
        }
    }

    @Override
    public void move(long dt) {
        this.moveX(this.vitesseX);
    }
    
}
