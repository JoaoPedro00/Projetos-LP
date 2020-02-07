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
public class Lt01_Pro16
{
   static Double sl;
      public static void main ( String args[ ] ) 
  {
      ProcedureSalario();
     JOptionPane.showMessageDialog(null, "\n Salario Liquido = " + sl);
  } 

static void ProcedureSalario ( )
{
    Double ht,vh,pd,nd,s;
        s = Double.parseDouble(JOptionPane.showInputDialog("Digite o SALÁRIO BRUTO"));
        ht = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas " ));
        vh = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora " ));
        pd = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto " ));
        nd = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de descendentes " ));
        s = ht * vh;
        sl = (s - pd)+(nd*100);
}      
}
