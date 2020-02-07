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
public class Lt01_Rep37 
{
    public static void main(String args[])
    {
        int N,i,i2,i3,SF;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor "));
        i = 1;
        i2 = 0;
        i3 = 1;
        while (i<=N)
        {
            SF = i2+i3;
            i2 = i3;
            i3 = SF;
            System.out.println(+SF);
            i++;
        }
    }
    
}
