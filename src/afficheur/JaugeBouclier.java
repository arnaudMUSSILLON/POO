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

    public JaugeBouclier(Game g) {
        super(g, "bouclier", g.width()-70, g.height()-70); 
    }
    
    @Override
    public void move(long dt){
    // non utilisé ici
    }
}
