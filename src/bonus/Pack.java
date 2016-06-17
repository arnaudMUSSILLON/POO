/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus;

import afficheur.Cartouches;
import iut.Game;
import iut.Objet;
import java.util.ArrayList;
import projetpoo.Joueur;

/**
 *
 * @author Arno
 */
public class Pack extends BonusMalus{

    private Joueur j;
    private double vitesseX = -2;
    
    public Pack(Game g, String nom, int x, int y) {
        super(g, nom, x, y);                        //nom = "pack"
    }

    @Override
    public void effect(Objet objet) {
        if (objet.isFriend()){
            int nbMissileAjout = (int) (Math.random() * 2+1);
            for (int i=0; i<nbMissileAjout; i++){
                Cartouches missileAjout = new Cartouches(this.game());
                j.ajouterMissile(nbMissileAjout);
                this.game().remove(this);
            }

        }
    }

    @Override
    public void move(long l) {
        this.moveX(this.vitesseX);
    }
    
}
