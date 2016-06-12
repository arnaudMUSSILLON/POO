/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package afficheur;

import iut.Game;
import java.util.ArrayList;
import projetpoo.Joueur;

/**
 *
 * @author ap775722
 */
public class JaugeVie extends Afficheurs {
    private Joueur j;
    private static ArrayList<JaugeVie> jauge = new ArrayList();

    public JaugeVie(Game g) {
        super(g, "vaisseauAffichage", jauge.size()*100, 20);
        jauge.add(this);
        g.add(this);
    }
    
    @Override
    public void move(long dt){
        //pas utile ici
    }
    
    public static void perdreVie(){
        JaugeVie vieActuelle = jauge.get(jauge.size()-1);
        jauge.remove(vieActuelle);
        vieActuelle.game().remove(vieActuelle);
    }
    
}
