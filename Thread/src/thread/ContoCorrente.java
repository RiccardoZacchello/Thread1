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
public class ContoCorrente {
    private float saldo;

    public ContoCorrente(){
        
    }
    public ContoCorrente(float saldo) {
        this.saldo = saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void prelievo(float soldi){
        saldo-=soldi;
    }

    public float getSaldo() {
        return saldo;
    }
    public void deposito(float soldi){
        saldo+=soldi;
    }
}
