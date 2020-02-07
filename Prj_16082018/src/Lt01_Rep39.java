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
public class Lt01_Rep39 
{
    public static void main(String args[])
    {
        long C,Q;
        Q = 1;
        for (C=1;C<=64;C++)
        {
            System.out.println("Casa : " +C+ "  Quantidade: " +Q);
            Q = Q*2;
        }
    }
    
}
