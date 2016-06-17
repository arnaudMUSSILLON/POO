/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package afficheur;

import iut.Game;
import java.util.ArrayList;

/**
 *
 * @author ap775722
 */
public class JaugeBouclier extends Afficheurs {

    // Le joueur ne peut avoir qu'un seul bouclier
    private static ArrayList<JaugeBouclier> jauge = new ArrayList();
    
    public JaugeBouclier(Game g) {
        super(g, "bouclierAffichage", g.width()-70, g.height()-70); 
        jauge.add(this);
        g.add(this);
    }
    
    public static void retireBouclier(Game g){
        JaugeBouclier bouclierActuelle = jauge.get(jauge.size()-1);
        jauge.remove(bouclierActuelle);
        bouclierActuelle.game().remove(bouclierActuelle);
    }
    
    @Override
    public void move(long dt){
    // non utilisé ici
    }
}
