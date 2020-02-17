/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.Scanner;

/**
 *
 * @author zacchello.riccardo
 */
public class Thread1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        /* T t = new T('a');
         t.start();
        
         T t2 = new T('b');
         t2.start();
        
         R r = new R('c');
         Thread t3 = new Thread(r);
         t3.start();
        
         R r2 = new R('d');
         Thread t4 = new Thread(r);
         t4.start();*/
        // TODO code application logic here
        Float saldo;
        int decisione;
        /*Contatore cont = new Contatore();
        
        RS r1 = new RS("Thread111", cont);
        RS r2 = new RS("Thread222", cont);
        */
        ContoCorrente c = new ContoCorrente();
        
        
        System.out.println("Quale è il tuo saldo?");
        saldo = input.nextFloat();
        c.setSaldo(saldo);
        TB tb1=new TB (saldo,c);
        while (true) {
            System.out.println("Cosa vuoi fare?\n1-Deposito\n2-Prelievo");
            decisione = input.nextInt();
            
            switch (decisione) {
                case 1:
                    System.out.println("Quanto vuoi depositsre?");
                    int soldi = input.nextInt();
                    
                    
                    break;
                    
                case 2:
                    System.out.println("Quanto vuoi prelevare?");
                    soldi = input.nextInt();
                   tb1
                    
                    break;
            }
        }

    }

}
