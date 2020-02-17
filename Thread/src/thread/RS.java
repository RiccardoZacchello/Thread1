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
    public RS(Contatore cont, String ThreadName){
        T=new Thread(this);
        T.start();
        this.ThreadName=ThreadName;
        this.cont=cont;
    }
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
