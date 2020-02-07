/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab 102
 */
import javax.swing.JOptionPane;
public class Lt01_Mat08 
{
    //static int M[ ][ ] = new int [4][3];
    //static int s,p;
    public static void main(String args[])
    {
        int M[][] = new int [4][3];
        int s=0,p=0;
        CarregaMat(s,p,M);
        QuantPro(s,p,M);
        QuantSem(s,p,M);
        
    }
    
    
    static void CarregaMat(int s, int p,int M[][])
    {
        for ( s = 0 ; s < 4 ; s++ )  
        {
	     for ( p = 0 ; p < 3 ; p++)  
             {
                     M[s][p] = (int)(Math.random()*10);
                }  
        } 
    }
    
    
    static void QuantPro(int s, int p,int M[][])
    {
        int q=0,v;
        for (p=0;p<3;p++)
        {
            for(s=0;s<4;s++)
            {
                v = M[s][p];
                q = q + v;
            }
            System.out.println("produto "+p+" vendido no mes : " +q);
            
        }
        System.out.println ("******************************");
    }
    
    static void QuantSem(int s , int p, int M[][])
    {
        int qs=0,v,total=0;
                for(s=0;s<4;s++)
                {
                    for(p=0;p<3;p++)
                    {
                        v = M[s][p];
                        qs = qs + v;
                    }
                    System.out.println(" Vendidos na semana "+s+" : " +qs);
                    total = total + qs;
                }
                System.out.println ("******************************");
                System.out.print("total de produtos vendidos eh :" +total);
    }
}
    

