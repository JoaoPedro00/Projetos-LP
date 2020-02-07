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
public class Lt01_Pro28 
{
    static double pn ;
    public static void main(String args[])
    {
        Double p,m;
        p = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual "));
        m = Double.parseDouble(JOptionPane.showInputDialog("Digite a media mensal "));
        ProcedurePreco(p,m);
        JOptionPane.showMessageDialog(null," O novo preço sera : " + pn);
    }
    
    
    static void ProcedurePreco(double p, double m)
    {
        if (p<30 && m<500)
        {
            pn = p*1.10;
            
        }
        else if(p>=30 && p<80 && m>=500 && m<1000)
             {
            pn = p*1.15;
            
             }
            else if (p>=80 && m>=1000)
                    {
                     pn= p -(p*0.05);
                                         }
                    else
                    {
                     pn = p;
                    
            }
           
    }
}
