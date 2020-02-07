/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João
 */
import java.util.Random;
import javax.swing.JOptionPane;
public class Lt01_Fun38 
{
    static int N,ME;
    public static void main(String args[])
    {
        int N1,MA,I;
       N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
       System.out.println("o maior numero é " +FuncaoMaiorMenor());
       System.out.println("o menor numero é " +FuncaoMenor());
    }
    
    static int FuncaoMaiorMenor()
    {
     int N1,MA,I;   
        
        
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
        return MA;
        
    
    }
    
    static int FuncaoMenor()
    {
        return ME;
    }
    
}
