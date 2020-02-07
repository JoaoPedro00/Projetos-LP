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
public class Lt01_Rep36 
{
    public static void main(String args[])
    {
        int x,n=0,fat,cta;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        while (n<x)
        {
            n = n+1;
            fat = 1;
            for (cta=n;cta>1;cta--)
            {
                fat = fat*cta;
            }
            System.out.print("1/"+fat+"   ");
        }
    }
    
}
