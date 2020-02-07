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
public class Lt01_Fun39 
{
    static long q;
    public static void main (String args[])
    {
        long c;
        for ( c=1;c<=64;c++)
        {
            System.out.println("Casa : " +c+ "  Quantidade: " +FuncaoQuant(c));
        }
    }
    
    
    static long FuncaoQuant(long c)
    {
        if(c==1)
        {
            q = 1;
            return q;
        }
        else
        {
            q = q * 2;
            return q;
        }
    }
    
}
