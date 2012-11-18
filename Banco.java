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
public class Banco {
    
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Cliente> clientesPref;
    
    public Banco()
    {
        this.clientes = new ArrayList();
        this.clientesPref = new ArrayList();
    }
    

    
    public Cliente atiende()
    {
        
        Cliente toReturn = null;
        if(clientesPref.size() > 0){
            toReturn = clientesPref.remove(0);
        }else if(clientes.size()>0){
            toReturn = clientes.remove(0);
        }
        

        return toReturn;
    }
    
    public void atendido(Cliente c)
    {
        System.out.println("*****************************************");
        System.out.println("Se ha atendido al cliente: "+c.getNum());
         System.out.println("\tSe tienen "+clientes.size()+" clientes normales en espera");
          System.out.println("\tSe tienen "+clientesPref.size()+" clientes especiales en espera");
          System.out.println("*****************************************");
    }
    
    public void setClientes(Cliente c,int tipo)
    {               

        if(tipo > 9)
        {
            clientesPref.add(c);
        }else
        {
            clientes.add(c);
        }
        /*
        System.out.println("##############################");
        System.out.println("\tSe tienen "+clientes.size()+" clientes normales en espera");
          System.out.println("\tSe tienen "+clientesPref.size()+" clientes especiales en espera");
          System.out.println("##############################\n");*/
    }
}
