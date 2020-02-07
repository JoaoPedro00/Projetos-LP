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
public class Lt01_Pro22 
{
    static String o;
    public static void main(String args[])
    {
        ProcedureOrdem();
        JOptionPane.showMessageDialog(null, o);
    }
    
    static void ProcedureOrdem()
    {
        int a,b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um  valor "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro  valor "));
        if (a>b)
        {
            o = "os valores em ordem crescente " + b + " , " +a ;
        }
        else
        {
            o = "os valors em ordem crescente " + a + " , " + b;
        }
    }
    
}
