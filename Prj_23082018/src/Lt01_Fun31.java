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
public class Lt01_Fun31 
{
  //static int Q;
  public static void main(String args [ ] )  
  {     int N;
        for(N=10;N<=150;N++)
        {
          //JOptionPane.showMessageDialog(null,"o quadrado eh " + FunçãoArea(N));
          System.out.println("o quadrado eh " +FunçãoArea(N));
   }

        
  }
  static int FunçãoArea (int N) 
  {
        int Q;
        //for(N=10;N<=150;N++)
        //{
           Q = N * N;
           return Q;
       // }
       
  }
}

