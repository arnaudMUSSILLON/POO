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
public class Bloqueur extends BonusMalus{

    private int duree=2;
    private Joueur j;
    
    public Bloqueur(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
        if(duree>0){
            j.bloque();
        } else if(duree<=0){
            j.debloque();
        }
    }
    
    @Override
    public void effect(Objet objet) {
        //inutile ici
    }            
    @Override
    public void move(long l) {
        //inutile ici
    }
    
}
