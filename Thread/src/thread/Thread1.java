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
public class Thread1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        Contatore cont=new Contatore();
        RS r1= new RS("Thread111",cont);
        RS r2= new RS("Thread222",cont);
    }

    
}
