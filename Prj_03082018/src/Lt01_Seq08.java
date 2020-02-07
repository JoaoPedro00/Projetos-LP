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
public class Lt01_Seq08 
{
    public static void main(String args[])
    {
        Double valor;
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da poupança"));
        valor = valor * 1.3;
        System.out.print(" o valor corrigido sera : " +valor);
        
    }
    
}
