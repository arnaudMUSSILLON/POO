/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetpoo;

import bonus.BonusMalus;
import iut.Objet;
import java.util.ArrayList;

/**
 *
 * @author cp071232
 */
public class Niveau {
    private ArrayList<Ennemi> ennemis;
    private ArrayList<BonusMalus> bonus;
    private int niveau = 0;
    
    public void Niveau(int numero){
        this.niveau = numero;
    }
    
    public Objet NouvelObjet(long time){
        Objet o = null;
        
        return o;
    }
    
}
