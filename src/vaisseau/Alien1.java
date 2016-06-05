/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vaisseau;

/**
 *
 * @author vm497823
 */
public class Alien1 extends Vaisseau{

    public void move(long dt){
        
    }
    
    public void specialMove(long dt){
        
    }
    
    public boolean isDestructible(){
         if (indestrucible == true){
            return true;// retourne vrais si il est destructible
        }else{
            return false;// retourne faux si il n'est pas destructible
        }
    }
}
