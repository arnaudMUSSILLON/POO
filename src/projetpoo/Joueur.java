/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetpoo;

import afficheur.Cartouches;
import afficheur.JaugeVie;
import bonus.BonusMalus;
import bonus.Missile;
import iut.Objet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;


/**
 *
 * @author cm391743
 */
public class Joueur extends iut.ObjetTouchable implements MouseListener, MouseMotionListener{
    private Jeu jeu;
    private static int vie =3;
    private int missiles =5;
    private String nom =null;
    private ArrayList<BonusMalus> bonus = new ArrayList();
    private long delai =0;

    public Joueur(iut.Game jeu, String nom, int x, int y){
        super(jeu,nom, x,y);
        for (int i=1; i<=vie; i++){
                JaugeVie jaugevie = new JaugeVie(this.game());
        }
        for (int j =1; j<=missiles;j++){
            Cartouches cartouche = new Cartouches(this.game());
        }    
    }

    
    public String setNom(String nom){
        return this.nom = nom;
    }
    
    public String getNom(){
        return (nom);
    }
    
    @Override
    public void effect(Objet o){
        if (o.isEnnemy()){
            if(delai==0){ 
                vie -= 1;
                System.out.println(vie);
                JaugeVie.perdreVie();                     
                delai = 100;
            }
        }
    }
    
    @Override
    public boolean isFriend(){
        return true;
    }
    
    @Override
    public boolean isEnnemy(){
        return false;
    }
    
    @Override
    public void move (long dt){
        if(delai>0)
            delai -= dt;
        else if(delai<0)
            delai = 0;
    }
    
    
    public void ajouteBonus (BonusMalus b){
        bonus.add(b);
    }
    
    public void enleveBonus (BonusMalus b){
        bonus.remove(b);
    }
    
    public void debloque(){
        
    }
    
    public void bloque(){
        
    }
    

    
    public static int nbVie(){
        return vie;
    }
    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {           
        if (missiles >=1) {
            Missile m1 = new Missile (this.game() , "missile" ,this.getMiddleX(),this.getMiddleY() ,this) ;
            this.game().add(m1);
            this.missiles -=1;
            Cartouches.avoirTire();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //non utilisé ici
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //non utilisé ici
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //non utilisé ici
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //non utilisé ici
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //non utilisé ici
    }

    @Override
    public void mouseMoved(MouseEvent e) {        
            this.moveY(e.getY()-this.getMiddleY());
        
    }


}
