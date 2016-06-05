/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetpoo;

import bonus.BonusMalus;
import iut.Objet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


/**
 *
 * @author cm391743
 */
public class Joueur extends iut.ObjetTouchable implements MouseListener, MouseMotionListener{
    private static int vie;
    private double vitesse;
    private String nom =null;
    private boolean bloque;

    public Joueur(iut.Game jeu){
        super(jeu,"vaisseau", 100, 500);
        this.vie = 3;
        this.vitesse = 1;
        this.bloque = false;
  
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
            
        }
    }
    
    @Override
    public boolean isFriend(){
        return false;
    }
    
    @Override
    public boolean isEnnemy(){
        return true;
    }
    
    @Override
    public void move (long dt){
        
    }
    
    public void ajouteBonus (BonusMalus b){
        
    }
    
    public void enleveBonus (BonusMalus b){
        
    }
    
    public void debloque(){
        
    }
    
    public void bloque(){
        
    }
    
    public static int getVie(){
        return vie;
    }

    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
