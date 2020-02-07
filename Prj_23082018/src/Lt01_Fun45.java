/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João
 */
public class Lt01_Fun45 
{
    public static void main(String args[])
    {
        int x,y,r;
        x = 1;
        System.out.println(x);
        //while(x<15)
        for (x=2;x<=15;x++)
        {
            y=x*x;
            r=x%2;
            if(r==0)
            {
                System.out.print(FuncaoPar(x)+"/");
                System.out.println(FuncaoDen(y));
            }
            else
            {
                System.out.print(FuncaoImpar(x)+"/");
                System.out.println(FuncaoDen(y));
            }
        }
    }
    
    
    
    static int FuncaoPar(int x)
    {
        return -x;
    }
    
    static int FuncaoImpar(int x)
    {
        return x;
    }
    
    static int FuncaoDen(int y)
    {
        return y;
    }
    
    
}
