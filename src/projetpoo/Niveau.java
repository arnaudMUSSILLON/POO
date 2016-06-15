/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetpoo;

import bonus.BonusMalus;
import bonus.Pack;
import iut.Objet;
import java.util.ArrayList;

/**
 *
 * @author cp071232
 */
public class Niveau {
    private ArrayList<Ennemi> ennemis = new ArrayList();
    private static ArrayList<BonusMalus> bonus = new ArrayList();
    private ArrayList<Niveau> niveaux = new ArrayList();
    private static int nbNiveau=0;
    private static Jeu jeu;
    
    public Niveau(int numero){
        niveaux.add(this);
        ++nbNiveau;
    }
    
    public static Objet nouvelObjet(long time){    //time = temps écoulé depuis le début du niveau
        if(time<1000){
            Pack pack = new Pack(jeu, "bonus",jeu.getWidth(),100);
            jeu.add(pack);
            bonus.add(pack);
        }
        Objet pack=null;

        return pack;
    }
    
    public static int getNbNiveau(){
        return nbNiveau;
    }
    
}
