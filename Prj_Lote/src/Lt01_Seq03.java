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
public class Lt01_Seq03 
{
  public static void main(String args[])
  {
    Double B,H,area;
    B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base "));
    H = Double.parseDouble(JOptionPane.showInputDialog("Digie o valor da altura"));
    area = (B * H)/2;
    System.out.println (" A area eh : " + area );
            
  }
}
