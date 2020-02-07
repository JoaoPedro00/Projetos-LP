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
public class Lt01_Fun36 
{
    public static void main (String args[])
    {
        int x,n;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor "));
        for (n=0;n<=x;n++)
        {
            System.out.print("1/"+FuncaoFat(n)+"   ");
        }
        
    }
    
    
    
    static int FuncaoFat(int num)
    {
        int fat,cta;
        fat = 1;
            for (cta=num;cta>1;cta--)
            {
                fat = fat*cta;
            }
            return fat;
    }
    
}
