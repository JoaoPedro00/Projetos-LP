/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João
 */
public class Lt01_Fun41 
{
    public static void main(String args[])
    {
        int d1,d2;
        for (d1=1;d1<=6;d1++)
        {
            for (d2=1;d2<=6;d2++)
            {
                if((d1+d2)==7)
                {
                System.out.print(FuncaoDado(d1, d2)+" ");
                System.out.println(FuncaoDado2(d1, d2));
                }
           }
        }
    }
    
    
    
    static int FuncaoDado(int d1, int d2)
    {
     return d1;           
    }
    
    static int FuncaoDado2(int d1, int d2)
    {
        return d2;
    }
    
}
