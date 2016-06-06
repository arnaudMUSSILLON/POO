/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package afficheur;

import iut.Game;
import projetpoo.Joueur;

/**
 *
 * @author ap775722
 */
public class JaugeVie extends Afficheurs {
    private Joueur j;

    public JaugeVie(Game g, String nom, int _x, int _y, Joueur joueur) {
        super(g, nom, _x, _y);
        this.j = joueur;
    }
    
    @Override
    public void move(long dt){
        
    }
    
}
