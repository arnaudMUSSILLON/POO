/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package afficheur;

import iut.Game;

/**
 *
 * @author ap775722
 */
public class JaugeBouclier extends Afficheurs {

    // Le joueur ne peut avoir qu'un seul bouclier
    
    public JaugeBouclier(Game g) {
        super(g, "bouclierAffichage", g.width()-70, g.height()-70); 
        g.add(this);
    }
    
    public void retireBouclier(Game g){
        g.remove(this);
    }
    
    @Override
    public void move(long dt){
    // non utilisé ici
    }
}
