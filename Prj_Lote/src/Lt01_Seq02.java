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
public class Lt01_Seq02 
{
  public static void main(String args[])
   {
    Double S;
    S = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do sálario "));
    S = S * 1.15;
    System.out.println (" O salario ajustado eh : " + S );
    
   }    
}