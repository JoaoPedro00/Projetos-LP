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
public class Lt01_Rep32 
{
    public static void main(String args[])
    {
        int N,Y;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero "));
        Y = N;
        do
        {
            N = N -1;
            Y = Y * N;
            
        } while (N!=1);
        System.out.println(" fatorial é " +Y);
                
    }
    
}
