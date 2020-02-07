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
public class Lt01_Pro24 
{
    public static void main(String args[])
    {
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        ProcedureDiv(a);
        
    }
    
    
    static void ProcedureDiv(int a1)
    {
       int d,d3;
       d = a1%2;
        if (d==0)
        {
            d3 = a1%3;    
            if(d3==0)
            {
                JOptionPane.showMessageDialog(null, "O numero é divisivel por 2 e 3");
            }
            
            else
                JOptionPane.showMessageDialog(null, "O numero nao é divisivel por 2 e 3");
        }
        else 
            JOptionPane.showMessageDialog(null, "O numero nao é divisivel por 2 e 3");
    }
}
