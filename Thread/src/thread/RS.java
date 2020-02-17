/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author zacchello.riccardo
 */
public class RS implements Runnable {
Thread T;
String ThreadName;
Contatore cont;
    public RS( String ThreadName,Contatore cont ){
        T=new Thread(this);
        T.start();
        this.ThreadName=ThreadName;
        this.cont=cont;
    }
    @Override
    public void run() {
        System.out.println("Starting " + ThreadName);
 //       synchronized(cont){  //mettere "" in un blocco al posto che al metodo
        cont.stampaCOnatatore();
     //   }
        System.out.println("Thread "+ThreadName+" exiting");
    }
    
}
