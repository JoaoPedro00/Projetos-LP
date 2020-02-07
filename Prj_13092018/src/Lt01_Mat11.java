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
public class Lt01_Mat11 
{
    static int M[ ][ ] = new int [8][8];
    static int x,y,z;

 public static void main(String args [ ]) 
 {
     CarregaMat();
     MostraMatriz();
     System.exit(0);
 }
 
 
 
 static void CarregaMat()
 {
     
     for (z=1;z<=4;z++)
     {
         for(x=(z-1);x<=(8-z);x++)
         {
             for(y=(z-1);y<=(8-z);y++)
             {
                 M[x][y]= z;
             }
         }
     }
     
 }



  static void MostraMatriz() 
 {
   
   for ( x = 0 ; x < 8 ; x++ )
   {
       
       for(y = 0 ; y < 8 ; y++)
       
          {
	  //   System.out.println ("MAT[" + x + "][ " +y+ "] = " +M[x][y]); 
	    System.out.print(" " +M[x][y]); 
          }
           System.out.print("\n" ); 
             
     }
   
          
 }

   
}