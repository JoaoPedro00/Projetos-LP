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
public class Lt01_Mat10 
{
    static int M[][] = new int[2][8];
    static int x,y;
    public static void main(String args[])
    {
        CarregaMat();
        MostraMat();
    }
    
    
    static void CarregaMat()
    {
        int i=0;
        for(x = 0 ; x < 2 ; x++)
        {
            for ( y = 0 ; y < 8 ; y++)
            {
                if(x==0 && y==0)
                {
                    M[x][y]=1;
                    i = M[x][y];
                }
                else if(x==0 && y!=0)
                {
                   M[x][y] = i + 1; 
                   i = M[x][y];
                }
                else if (x==1 && y==0)
                {
                    M[x][y]= 1;
                    i = M[x][y];
                }
                else if (x==1 && y!=0)
                {
                    M[x][y] = i * 2; 
                    i = M[x][y];
                }
            }
        }
    }
    
    static void MostraMat()
    {
        for ( x = 0 ; x < 2 ; x++ )
            {
            for(y = 0 ; y < 8 ; y++)
                {
                System.out.print("  " +M[x][y]); 
                }
           System.out.print("\n" ); 
             
           }
    }
   
}
