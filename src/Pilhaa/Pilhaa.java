/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilhaa;
import No.*;

/**
 *
 * @author adria
 */
public class Pilhaa<X> {
    
    No primeiro, ultimo;
    
    public void insira(X a)throws Exception
    {
        No nozin=new No(a);
        
        if(a==null)
            throw new Exception("Informação Ausente");
        if(primeiro==null)
        {
            primeiro=nozin;
           
        }
        else
        {
            nozin.prox=primeiro;
            nozin=primeiro;
             
        }
    }
    
}
