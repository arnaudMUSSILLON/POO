/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetpoo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;



/**
 *
 * @author cm391743
 */
public class Jeu extends iut.Game{

    public Jeu() {
        super(1000, 500, "jeu");
    }
    
    @Override
    protected void drawBackground(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
    
    @Override
    public void createObjects(){
        Joueur joueur = new Joueur(this);
        this.add(joueur);
        this.addMouseInteractiveObject(joueur);
        
    }
    
    @Override
    public void gagne( ){
        JOptionPane.showMessageDialog(this, "Gagné !");
    }
    
    @Override
    public void perdu (){
        JOptionPane.showMessageDialog(this, "Perdu !");
    }
    
    public boolean aGagne(){
        return true;
    }
    
    public boolean aPerdu(){
        return Joueur.getVie()<=0;
    }


}
