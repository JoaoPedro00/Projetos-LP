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
public class Lt01_Dec19 
{
    public static void main(String args[])
    {
        Double a,b;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b"));
        if (a>b)
        {
           System.out.println("O maior numero eh: " + a);
           
        }
        else if (a<b)
        {
            System.out.println("O maior nuemro eh: " + b);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "OS NUMEROS SAO IGUAIS");
        }
        
        
    }
    
}
