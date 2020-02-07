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
        int Celsius , F ;
        Celsius = Integer.parseInt(JOptionPane.showInputDialog("Digite uma temperatura em graus celsius "));
        F = (9*Celsius+160)/5;
        System.out.print("A temperatura em fahrenheit é : " +F);
    }
    
}
