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
public class Lt01_Mat09 
{
    static int M[ ][ ] = new int [4][4];
    static int x,y;
    public static void main(String args[])
    {
        CarregaMat();
        MostraMat();
    }
 
    
    
    static void CarregaMat()
    {
        int i=0;
         for ( x = 0 ; x < 4 ; x++ )  
        {
	     for ( y = 0 ; y < 4 ; y++)  
                {
                    if (x==0 && y==0)
                    {
                        M[x][y]= 1;
                        i++;
                    }
                    else if(x==y && x!=0)
                    {
                     M[x][y]= 4 * i;  
                     i = M[x][y];
                    }
                    else
                    {
                        M[x][y] = (int)(Math.random()*10);    
                    }
                }  
        } 
    }
    
    
    
    
    
    static void MostraMat()
    {
      for ( x = 0 ; x < 4 ; x++ )
            {
            for(y = 0 ; y < 4 ; y++)
                {
                System.out.print(" " +M[x][y]); 
                }
           System.out.print("\n" ); 
             
           }
    }
}
