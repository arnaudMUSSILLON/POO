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
public class Cartouches extends Afficheurs {

    private static ArrayList<Cartouches> cartouches = new ArrayList();
    private Joueur j;
    private Game jeu;
    
    public Cartouches(Game g) {
        super(g, "missileAffichage", cartouches.size()*100, g.height()-35);
        cartouches.add(this);
        g.add(this);
    }
    
    public static void avoirTire(){
        Cartouches cartoucheActuelle = cartouches.get(cartouches.size()-1);
        cartouches.remove(cartoucheActuelle);
        cartoucheActuelle.game().remove(cartoucheActuelle);
    }
        
    @Override
    public void move(long dt){
        //inutile pour l'affichage
    }
}
