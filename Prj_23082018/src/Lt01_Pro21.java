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
public class Lt01_Pro21 
{
    static String msg;
    public static void main(String args[])
    {
        ProcedureNota();
        JOptionPane.showMessageDialog(null, msg);
 
    }
    
    static void ProcedureNota()
    {
        Double a,b,c,d,m;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota b"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota c"));
        d = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota d"));
        m = (a+b+c+d)/4;
        if (m<3)
        {
             msg = "REPROVADO";
        }
        else if(m>=6)
        {
             msg = "APROVADO";
        }
        else 
        {
           msg = "EXAME";
        }
    }
    
}
