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
    public static void main(String args[])
    {
        Double ht,vh,pd,nd,s,sl;
        ht = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas " ));
        vh = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora " ));
        pd = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto " ));
        nd = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de descendentes " ));
        s = ht * vh;
        sl = (s - pd)+(nd*100);
        System.out.println("O valor do salario liquido eh : " + sl);
                
        
    }    
    
}
