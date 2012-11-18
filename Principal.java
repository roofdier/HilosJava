/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClienteServidor;

/**
 *
 * @author Roofdier
 */


import java.util.*;
public class Principal {
    


    
    public static void main(String args[])
    {
        
        ArrayList<Empleado> empleados = new ArrayList();
        
        Banco bank = new Banco();
        
        Empleado e1 = new Empleado(bank,"Juan Avellan");
        Empleado e2 = new Empleado(bank,"Juan Avellan--2");
        Empleado e3 = new Empleado(bank,"Juan Avellan--3");
        
       // Thread banco = new Thread(bank);
        Clientes clientes = new Clientes(bank);
        clientes.setPriority(Thread.MIN_PRIORITY);
        
        //banco.start();
        clientes.start();

        e1.start();
        e2.start();
       // e3.start();
        
        
        
        
        //clientes.setPriority(1);
        //banco.setPriority(1);
        
        
        
    }
    
    
    
    
}
