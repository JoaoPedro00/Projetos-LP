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
public class Lt01_Seq11 
{
    public static void main(String args[])
    {
        Double raio,comprimento;
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunferencia "));
        comprimento = 2 * 3.14 * raio;
        System.out.println(" O comprimento é " +comprimento);
    }
    
}
