/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetpoo;

import asteroide.AsteroideMoyen;
import asteroide.GrandAsteroide;
import bonus.BonusMalus;
import bonus.Pack;
import iut.Objet;
import java.util.ArrayList;

/**
 *
 * @author cp071232
 */
public class Niveau {
    private static ArrayList<Ennemi> ennemis = new ArrayList();
    private static ArrayList<BonusMalus> bonus = new ArrayList();
    private static ArrayList<Niveau> niveaux = new ArrayList();
    private static int nbNiveau=0;
    private static Jeu jeu;
    
    public Niveau(int numero){
        niveaux.add(this);
        ++nbNiveau;
        Horloge horloge = new Horloge(jeu, this);
    }
    
    public static Objet nouvelObjet(long time){    //time = temps écoulé depuis le début du niveau
        if(time>=0){
            GrandAsteroide a1 = new GrandAsteroide (jeu, "asteroide1" , jeu.getWidth(), 200) ;       
            jeu.add(a1);
            ennemis.add(a1);
        }
        switch((int) time){
            case 100:
                Pack pack = new Pack(jeu, "bonus",jeu.getWidth(),100);
                jeu.add(pack);
                bonus.add(pack);
                break;
            case 200:
                GrandAsteroide a1 = new GrandAsteroide (jeu, "asteroide1" , jeu.getWidth(), 200) ;       
                jeu.add(a1);
                ennemis.add(a1);
            case 300:
                AsteroideMoyen a = new AsteroideMoyen(jeu, "asteroide2", jeu.getWidth(), 200);
                jeu.add(a);
                ennemis.add(a);
        }
        Objet pack=null;

        return pack;
    }
    
    public static int getNbNiveau(){
        return nbNiveau;
    }
    
}
