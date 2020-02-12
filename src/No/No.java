/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No;

/**
 *
 * @author adria
 */
public class No<X> {
    
  public   No prox;
  public   X info;
    
   
  
  public No (X i)
  {
      this.info=i;
  }
  public No (X i,No p )
  {
      this.info=i;
      this.prox=p;
  }
  
    public void setProx(No p)
    {
        this.prox=p;
    }
    
    public void setInfo(X i)
    {
        this.info=i;
    }
    
    public No getProx()
    {
        return this.prox;
    }
    
    public X getInfo()
    {
        return this.info;
    }
}