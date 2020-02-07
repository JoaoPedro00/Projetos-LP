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
public class Lt01_Seq04 
{
  public static void main(String args[])
    {
        Double F, C;
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da temperatura "));
        F = ((9 * C + 160)/5);
        System.out.println (" A temperatura em  fahrenheit eh : " + F );
               
    }
}
