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
public class Lt01_Seq13 
{
    public static void main(String args[])
    {
        Double Kg,D;
        Kg = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade em Kg "));
        D = Kg / 0.05;
        System.out.println("O numero de dias sera : " + D );
        
        
    }
}
