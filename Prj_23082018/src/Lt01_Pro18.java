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
public class Lt01_Pro18 
{
    static int d;
    public static void main(String args[])
    {
        ProcedureDiferença();
        JOptionPane.showMessageDialog(null, "\n A Diferença é = " + d);
    }
    
    static void ProcedureDiferença()
    {
        int a,b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b "));
        if (a>b)
            {
            d = a - b;
            
                    
            }
        else
            {
             d = b - a;
             
                     
            }
    }
}
