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
public class Lt01_Seq10 
{
    public static void main(String args[])
    {
        Double x,y;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y "));
        x = x - y;
        System.out.println("A diferença eh : " + x);
    }
    
}
