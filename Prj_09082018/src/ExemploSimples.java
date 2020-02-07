/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*




*/

import javax.swing.JOptionPane;
public class ExemploSimples 
{
   public static void main(String args[])
   {
      int Idade;
      Idade = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A IDADE"));
      if ( Idade < 18)
      {
          JOptionPane.showMessageDialog(null, "MENOR DE IDADE " + Idade);
          
      }
   }
    
}
