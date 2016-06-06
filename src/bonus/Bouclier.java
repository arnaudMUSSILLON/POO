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

    public Bouclier(Game g,String nom, int x, int y,Joueur j) {
        super(g, nom, x, y,j);                                //nom = "bouclier"
        duree = 20;
        energie = 500;
    }
    
    @Override
    public void effect(Objet o) {
        if (o.isEnnemy()){
            energie -= 300;
            if (energie <=0){
                getJoueur().enleveBonus(this);
            }
        }
    }

    @Override
    public void move(long dt) {
        
    }
    
}
