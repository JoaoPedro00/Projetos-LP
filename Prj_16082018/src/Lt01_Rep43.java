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
public class Lt01_Rep43 
{
    public static void main(String args[])
    {
        Double a,m,x=0.0;
        a = 1.1;
        m = 1.5;
        while(m>=a)
        {
            a = a+0.03;
            m = m+0.02;
            x++;
        }
        System.out.println("serao necessarios " + x + " anos ");
    }
    
}
