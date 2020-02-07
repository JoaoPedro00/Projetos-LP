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
public class Lt01_Dec18 
{
    public static void main(String args[])
    {
        int a,b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b "));
        if (a>b)
            {
            a = a - b;
            System.out.println("A diferenca eh: " + a );
                    
            }
        else
            {
             b = b - a;
             System.out.println("A diferenca eh: " + b);
                     
            }
    }
    
}
