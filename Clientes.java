/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClienteServidor;

/**
 *
 * @author Roofdier
 */
public class Clientes extends Thread{
    
    
    //Thread me;
    private int timeout;
    private Banco b;
    
    
    
    public Clientes(Banco b)
    {
        this.b = b;
    }
    
    @Override
    public void run()
    {
        int i = 0;
        
        while(true){
            i++;
            b.setClientes(new Cliente(i),((int)Math.round(Math.random()*10))+1);
            
            timeout = (int)(Math.random()*2000);
            
            // System.out.println("Se crea nuevo cliente. Espera "+timeout+" milis por el siguiente cliente");
            
            try
            {
                sleep(timeout);
            }catch(InterruptedException e)
            {}
            
        }
}
}
