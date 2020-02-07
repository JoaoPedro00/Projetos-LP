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
public class Lt01_Rep33 
{
    public static void main(String args[])
    {
        int X,N;
        X = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero "));
        N = 0;
        do
        {
            N=N+1;
            System.out.print("1/"+N+"   ");
        } while (N<X);
    }
    
}
