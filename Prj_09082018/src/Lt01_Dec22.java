/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab 102
 */
import javax.swing.JOptionPane;
public class Lt01_Dec22 
{
    public static void main(String args[])
    {
        int a,b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um  valor "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro  valor "));
        if (a>b)
        {
            System.out.println("os valores em ordem crescente " + b + "  " +a);
        }
        else
        {
            System.out.println("os valors em ordem crescente " + a + "  " + b);
        }
        
    }
    
}
