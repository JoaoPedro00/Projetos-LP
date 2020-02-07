/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab 102
 */
import java.util.Random;
import javax.swing.JOptionPane;
public class Lt01_Rep38 
{
    public static void main(String args[])
    {
        int N,N1,MA,ME,I;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        MA = N;
        ME = N;
        I = 1;
        while (I<100)
        {
            Random random = new Random();
            N1 = random.nextInt(200);
            if (N1>MA)
            {
                MA = N1;
                I++;
            }
            else if (N1<ME)
            {
                ME=N1;
                I++;
            }
            else 
                I++;
        }
        System.out.println("o maior numero é : " +MA+ " e o menor é " +ME);
    }
    
}
