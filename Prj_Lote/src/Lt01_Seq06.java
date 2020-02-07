/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João
 */
import javax.swing.JOptionPane;
public class Lt01_Seq06 
{
   public static void main(String args[])
    {
        int X,Y,T;
          X = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X "));
          Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y "));
          T = X;
          X = Y;
          Y = T;
          System.out.println (" o valor de X trocado eh : " + X );
          System.out.println (" o valor de Y trocado eh : " + Y );
        
                
    }
}
