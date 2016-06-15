/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus;

import iut.Game;
import iut.Objet;
import java.util.ArrayList;
import projetpoo.Joueur;

/**
 *
 * @author Arno
 */
public class Pack extends BonusMalus{

    private ArrayList<Missile> missiles;
    private Joueur j;
    private double vitesseX = -2;
    
    public Pack(Game g, String nom, int x, int y) {
        super(g, nom, x, y);                        //nom = "pack"
        missiles = new ArrayList();
    }

    @Override
    public void effect(Objet objet) {
        if (objet.isFriend()){
            int nbMissileAjout = (int) (Math.random() * 2+1);
            for (int i=0; i<nbMissileAjout; i++){
                Missile missileAjout = new Missile(this.game(), "missile",j.getMiddleX(),j.getMiddleY());
                missiles.add(missileAjout);
            }
        }
    }
    
    public int getNbMissile(){
        return missiles.size();
    }

    @Override
    public void move(long l) {
        this.moveX(this.vitesseX);
    }
    
}
