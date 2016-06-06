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
    
    public Pack(Game g, String nom, int x, int y, Joueur j) {
        super(g, nom, x, y, j);                        //nom = "pack"
        missiles = new ArrayList();
    }

    @Override
    public void effect(Objet objet) {
        
    }

    @Override
    public void move(long l) {
        
    }
    
}
