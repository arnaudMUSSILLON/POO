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
    private ArrayList<Ennemi> ennemis = new ArrayList();
    private ArrayList<BonusMalus> bonus = new ArrayList();
    private ArrayList<Niveau> niveaux = new ArrayList();
    private static int nbNiveau=0;
    
    public Niveau(int numero){
        niveaux.get(numero);
        ++nbNiveau;
    }
    
    public Objet NouvelObjet(long time){
        Objet o = null;
        
        return o;
    }
    
    public static int getNbNiveau(){
        return nbNiveau;
    }
    
}
