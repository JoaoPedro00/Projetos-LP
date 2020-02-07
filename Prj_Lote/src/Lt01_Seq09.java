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
public class Lt01_Seq09 
{
    public static void main(String args[])
    {
      int X,Y,S;
      X = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x " ));
      Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y " ));
      X = ( X * X);
      Y = ( Y * Y);
      S = ( X + Y);
      System.out.println("A soma dos quadrados eh : " + S );
      
      
      
    }
    
}
