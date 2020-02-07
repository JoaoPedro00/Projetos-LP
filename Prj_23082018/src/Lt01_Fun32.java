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
public class Lt01_Fun32 
{
    static int n;
    public static void main(String args[])
    {
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        JOptionPane.showMessageDialog(null,"o fatorial eh " + FunçãoFat(n));
    }
    
     static int FunçãoFat (int num)
     {
         int x,cta;
         x = 1;
         for (cta=num;cta>=1;cta--)
         {
             x = (x * cta);
         }
         return x;
         
     }
}