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
public class Flamme extends Vaisseau{

    public void move (long dt){
        
    }
    
 
    public void specialMove(long dt){ 
       
    }
    
    public boolean isDestrucible(){
        if (indestrucible == true){
            return true;
        }else{
            return false;
        }
    }
}
