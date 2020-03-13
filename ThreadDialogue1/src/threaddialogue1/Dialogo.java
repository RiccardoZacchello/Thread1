package threaddialogue1;

// Zacchello

import java.util.logging.Level;
import java.util.logging.Logger;


public class Dialogo implements Runnable {
    
     private int cost;
   

    public Dialogo(int x) {
      
       this.cost=x;
       
    }
    
    public void StampaDialogo1() throws InterruptedException{
        System.out.println("Ciao1");
        Thread.sleep(5000);
        System.out.println("Come va?");
         Thread.sleep(3500);
         System.out.println("Tutto bene");
          Thread.sleep(5000);
         System.out.println("Tutto bene1");
    }
    public void StampaDialogo2() throws InterruptedException{     
         Thread.sleep(3000);
        System.out.println("Ciao");
         Thread.sleep(5000);
        System.out.println("Tutto bene tu?");
         Thread.sleep(3000);
         System.out.println("Tutto bene");
        
    }

    @Override
    public void run() {
         try {
             if(this.cost==1){
                 StampaDialogo1();
                 
             }else if (this.cost==2){
                 StampaDialogo2();
             }
             
         } catch (InterruptedException ex) {
             Logger.getLogger(Dialogo.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    }
    
  
    

