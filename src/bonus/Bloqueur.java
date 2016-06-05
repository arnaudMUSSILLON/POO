/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus;

import iut.Game;
import iut.Objet;

/**
 *
 * @author Arno
 */
public class Bloqueur extends BonusMalus{

    private int duree;

    public Bloqueur(Game g, int x, int y) {
        super(g, "bloqueur", x, y);
    }
    

    
    @Override
    public void effect(Objet objet) {
        if (objet.isFriend()){   //si l'objet est le joueur
            
        }
    }

    @Override
    public void move(long l) {
        
    }
    
}
