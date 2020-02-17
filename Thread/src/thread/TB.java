
package thread;

/**
 *
 * @author zacchello.riccardo
 */
public class TB implements Runnable{
   private Thread ThreadBanca;
     float soldi=0;
   ContoCorrente c;
    public TB(float soldi,ContoCorrente c ){
        ThreadBanca=new Thread(this);
         ThreadBanca.start(); 
        this.c=c;
        this.soldi=soldi;
    }
    @Override
    public void run() {
      c.deposito(soldi);
                    System.out.println("saldo:"+c.getSaldo());
 //       synchronized(cont){
        
     //   }
        c.prelievo(soldi);
                    System.out.println("saldo:"+c.getSaldo());
    }
    


    
}
