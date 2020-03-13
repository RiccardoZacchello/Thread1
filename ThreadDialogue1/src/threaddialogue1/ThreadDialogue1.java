/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddialogue1;

/**
 *
 * @author rikyz
 */
public class ThreadDialogue1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
       
        Thread T1=new Thread(new Dialogo(1));
        Thread T2=new Thread(new Dialogo(2));
              T1.start();
              T2.start();
    }
    
}
