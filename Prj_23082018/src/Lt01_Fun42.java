/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João
 */
public class Lt01_Fun42 
{
  static  int x,y;
    public static void main (String args[])
    {

        y = 1;
        System.out.println(y);
        for (x=2;x<=50;x++)
        {
            System.out.print(FuncaoSeq(x, y)+"/");
            y = y + 2 ;
            System.out.println(FuncaoDen(x,y));
        }
    }
    
    static int FuncaoSeq(int x , int y)
    {
       return x;
               
    }
    
    static int FuncaoDen(int x , int y)
    {
        return y;
    }
    
   
}
