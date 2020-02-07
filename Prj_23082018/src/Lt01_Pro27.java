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
public class Lt01_Pro27 
{
    public static void main(String args[])
    {
        ProcedureV();
        
    }
    
    static void ProcedureV()
    {
        Double n,m,t,v;
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de voltas "));
        m = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão em metros "));
        t = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo em minutos "));
        v = ((n *m)/t*60)*3.6;
        System.out.println("a velocidade em km/h é : " + v);
    }
    
}
