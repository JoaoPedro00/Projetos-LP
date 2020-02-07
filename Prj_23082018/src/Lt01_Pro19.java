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
public class Lt01_Pro19 
{
   static double m;
    public static void main(String args[])
    {
        ProcedureMaior();
        JOptionPane.showMessageDialog(null, "\n O maior  é = " + m);
    }
    
    static void ProcedureMaior()
    {
         Double a,b;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b"));
        if (a>b)
        {
           m = a;
           
        }
        else if (a<b)
        {
            m = b;
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "OS NUMEROS SAO IGUAIS");
        }
    }
    
}
