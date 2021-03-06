/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetpoo;

import asteroide.GrandAsteroide;
import bonus.Bloqueur;
import bonus.Bouclier;
import bonus.Pack;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import vaisseau.Alien1;
import vaisseau.Alien2;



/**
 *
 * @author cm391743
 */
public class Jeu extends iut.Game{
    
    private Image img;

    public Jeu() {
        super(1200, 700, "jeu");
        try {
            img = ImageIO.read(new File("sprites/map.png"));
        }
        catch (IOException ex) {
        Logger.getLogger(Jeu.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    
    @Override
    protected void drawBackground(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
    
    @Override
    public void createObjects(){    //initialisation du niveau
        Alien1 alien = new Alien1(this,"vaisseauEnnemi", this.getWidth(),200);
        this.add(alien);
        Alien2 alien2 = new Alien2(this,"vaisseauEnnemi", this.getWidth(),400);
        this.add(alien);
        //Bouclier bouclier = new Bouclier(this,"bonus", this.getWidth()-200, 100);
        //this.add(bouclier);
        //Bloqueur bloqueur =new Bloqueur(this,"bonus", this.getWidth(),100);
        //this.add(bloqueur);
        //Pack pack = new Pack(this, "bonus",this.getWidth(),100);
        //this.add(pack);
        Niveau niveau = new Niveau(1);
        GrandAsteroide a1 = new GrandAsteroide (this , "asteroide1" , this.getWidth(), 200) ;       
        this.add(a1);
        Joueur joueur = new Joueur(this,"vaisseau", 20, 100);
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
        return Niveau.getNbNiveau()>=10;

    }
    
    public boolean aPerdu(){
        System.out.println("perdu");
        return !(Joueur.nbVie()<=0);
    }


}
