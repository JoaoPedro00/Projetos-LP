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
public class Lt01_Pro23 
{
    static Double n1,n2,n3,n4;
    public static void main(String args[])
    {
        ProcedureColetar();
        ProcedureSeq();
        
    }
    
    static void ProcedureColetar()
    {
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de n1"));
        do
            n2 = Double.parseDouble(JOptionPane.showInputDialog("digite um valor de n2"));
        while(n2<=n1);
        do
            n3 = Double.parseDouble(JOptionPane.showInputDialog("digite um valor de n3"));
        while(n3<=n2);
        
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
    }
    
    static void ProcedureSeq()
    {
        if(n1<n4)
        {
         if(n2<n4)
         {
             if(n3<n4)
             {
               System.out.println("os valors em ordem crescente " + n1 +" "+ n2 + " " + n3 + " " + n4);
             }
             else
             {
               System.out.println("os valors em ordem crescente " + n1 +" "+ n2 + " " + n4 + " " + n3);
             }
          }
         else
         {
             System.out.println("os valors em ordem crescente " + n1 +" "+ n4 + " " + n2 + " " + n3);
         }
        }
         else
        {
            System.out.println("os valors em ordem crescente " + n4 +" "+ n1 + " " + n2 + " " + n3);
        }
    }
}
