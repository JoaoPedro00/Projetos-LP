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
public class Lt01_Seq16 
{
    public static void main (String args[])
    {
        int ht,vh,pd,nd,sl;
        ht = Integer.parseInt(JOptionPane.showInputDialog("Digite a qnt de horas trabalhadas"));
        vh = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor por hora "));
        pd = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do percentual de desconto"));
        nd = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de descendentes "));
        sl = ht*vh;
        sl = sl - pd;
        sl = sl + (nd*100);
        System.out.println(" O salario liquido é : " +sl);
        
    
    }
    
}
