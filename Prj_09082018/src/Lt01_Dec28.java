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
public class Lt01_Dec28 
{
    public static void main(String args[])
    {
        Double p,m,pn;
        p = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual "));
        m = Double.parseDouble(JOptionPane.showInputDialog("Digite a media mensal "));
        if (p<30 && m<500)
        {
            pn = p*1.10;
            System.out.println("O novo preço sera : " + pn);
        }
        else if(p>=30 && p<80 && m>=500 && m<1000)
             {
            pn = p*1.15;
            System.out.println("O novo preço sera : " + pn);
             }
            else if (p>=80 && m>=1000)
                    {
                     pn= p -(p*0.05);
                    System.out.println("O novo preço sera : " + pn);
                     }
                    else
                    {
                     pn = p;
                    System.out.println("O novo preço sera : " + pn);
            }
           
    }
}
