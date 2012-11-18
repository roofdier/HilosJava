/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClienteServidor;

/**
 *
 * @author Roofdier
 */
public class Empleado extends Thread{
    
    public Banco b;
    private Cliente c;
    private String nombre;
    
    public Empleado(Banco banco,String nombre)
    {
        this.b = banco;
        this.nombre = nombre;
    }
    
    public boolean atenderCliente(Cliente c)
    {
        if(this.c != null)
            return false;

        this.c = c;
        return true;
        
    }
    
    public void run()
    {
        boolean paused = false;
        
        while(true)
        {
            /*if(paused)
                continue;
            */
           this.c = b.atiende();
            
           if(c==null){
               
               //Permitir otros procesos
               try{ sleep((int)(Math.random()*2000)); }
               catch(InterruptedException e){}
               paused = true;
               continue;
           }
           
           paused = false;
           System.out.println("/////////////////"+this.nombre+" dice: Estoy atendiendo al cliente: "+c.getNum());
           
           try
           {
               sleep((int)(Math.random()*5000));
           }catch(InterruptedException e){}
           
           b.atendido(this.c);
           c = null; 
        }
    }
}
