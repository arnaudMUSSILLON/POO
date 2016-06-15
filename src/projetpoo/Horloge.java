/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetpoo;

import iut.Game;
import iut.Objet;

/**
 *
 * @author cp071232
 */
public class Horloge extends Objet {
    
    private long heureDebut = 0;
    private Niveau niveau;
    
    public Horloge(Game g, Niveau n) {
        super(g, "horloge", 0, 0);
        
    }
    

    @Override
    public boolean collision(Objet objet) {
        return false;
    }

    @Override
    public void effect(Objet objet) {
        //inutile ici
    }

    @Override
    public boolean isFriend() {
        return false;
    }

    @Override
    public boolean isEnnemy() {
        return false;
    }

    @Override
    public void move(long l) {
        if(heureDebut>0){
               heureDebut -= l;
               Niveau.nouvelObjet(heureDebut);
        }
           else if(heureDebut<0)
        heureDebut = 0;
    }
    
    
    public void ChangeNiveau(Niveau n){
        this.niveau = n;
    }
    
}
