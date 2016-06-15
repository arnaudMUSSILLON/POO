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
public class Bouclier extends BonusMalus{
    
    private int duree;
    private int energie;
    private Joueur j;

    public Bouclier(Game g,String nom, int x, int y) {
        super(g, nom, x, y);                                //nom = "bouclier"
        duree = 200;
        energie = 500;
    }
    
    @Override
    public void effect(Objet o) {
        if (o.isEnnemy()){
            energie -= 300;
            if (energie <=0){
                j.enleveBonus(this);
            }
        }
    }

    @Override
    public void move(long dt) {
        if(duree>0)
            duree -= dt;
        else if(duree<0)
            duree = 0;
    }
    
}
