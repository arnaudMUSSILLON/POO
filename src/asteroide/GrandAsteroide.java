/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asteroide;

import iut.Game;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import projetpoo.Jeu;

/**
 *
 * @author cp071232
 */
public class GrandAsteroide extends Asteroide {
    
    private URL u1;
    private AudioClip a1;
    
    public GrandAsteroide(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

    @Override
    protected void Split() {
        
        this.Detruit();
        u1 = this.getClass().getClassLoader().getResource("asteroideExplosion.wav");
        a1 = Applet.newAudioClip(u1);
        a1.play();
        AsteroideMoyen a2 = new AsteroideMoyen (game(), "asteroide2",this.getMiddleX(),this.getMiddleY());
        AsteroideMoyen a3 = new AsteroideMoyen (game(), "asteroide2",this.getMiddleX(),this.getMiddleY()-110);
        game().add(a2);
        game().add(a3);
        
    }
    
}
