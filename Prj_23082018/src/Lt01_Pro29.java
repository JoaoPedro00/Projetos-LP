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
public class Lt01_Pro29 
{
    static double v;
    public static void main(String args[])
    {
        double t;
        t = Double.parseDouble(JOptionPane.showInputDialog("Digite o tipo de investimento (1 = poupança e 2 = renda fixa)"));
        v = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do investimento"));
        ProcedureValor(t);
        JOptionPane.showMessageDialog(null," valor corrigido : " + v);
    }
    
    static void ProcedureValor(double t1)
    {
       if(t1==1)
       {
           v = v*1.003;
       }
       else
       {
           v = v*1.005;
       }
    }
    
}
