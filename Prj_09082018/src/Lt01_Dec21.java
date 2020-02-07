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
public class Lt01_Dec21 
{
    public static void main(String args[])
    {
        Double a,b,c,d,m;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota b"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota c"));
        d = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota d"));
        m = (a+b+c+d)/4;
        if (m<3)
        {
            JOptionPane.showMessageDialog(null, "RETIDO");
        }
        else if(m>=6)
        {
            JOptionPane.showMessageDialog(null, "APROVADO");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "EXAME");
        }
        
    }
    
}
