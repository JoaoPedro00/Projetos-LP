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
public class Lt01_Rep34 
{
    public static void main(String args[])
    {
        int N,Y,X;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        Y = 0;
        while (Y<10)
        {
            Y = Y+1;
            X = Y*N;
            System.out.println(+N+" vezes "+Y+" é : " + X);
        }
    }
    
}
