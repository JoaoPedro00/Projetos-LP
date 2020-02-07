/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab 102
 */
public class Lt01_Mat12
{
    static int xadrez [][] = new int [8][8];
    static int x,y;

 public static void main(String args [ ]) 
 {
     CarregaXadrez();
     System.out.print("\n" ); 
     Soma();
 }
 
 
 
 static void CarregaXadrez()
 {
     for ( x = 0 ; x < 8 ; x++ )  
        {
	     for ( y = 0 ; y < 8 ; y++)  
             {
                     xadrez[x][y] = (int)(Math.random()*8);
                     System.out.print(" " +xadrez[x][y]); 
             }
           System.out.print("\n" ); 

        }  
  } 
 
 
 static void Soma()
 {
     //int vetor[ ] = new int[64];
     int ata,soma=0;
     for ( x = 0 ; x < 8 ; x++ )  
        {
	     for ( y = 0 ; y < 8 ; y++)  
             { 
	     ata = xadrez[x][y];
             soma = soma + ata;
        }
             
        }
     System.out.println(" a soma sera : " +soma);
 }
 }
 
 
 
 