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
        super(g, "missile", cartouches.size()*10, 20);
        cartouches.add(this);
        g.add(this);
    }
       
    @Override
    public void move(long dt){
        //inutile pour l'affichage
    }
   
    public ArrayList<Cartouches> getCartouches(){
        return cartouches;
    }
}
