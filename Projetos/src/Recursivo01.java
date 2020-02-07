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
public class Recursivo01
{
    //static int n;
    public static void main (String args[])
    {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        System.out.println(Recursivo01(n));
    }
    
    
    static int Recursivo01(int num)
    {
        int x;
        if (num==1)
        {
            return 1;
        }
        else
        {
            x = num * Recursivo01(num-1);
            return x;
        }
    }
    
}
