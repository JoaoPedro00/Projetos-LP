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
public class Lt01_Fun37 
{
    static int N,i,i2=0,i3=1, SF;
    public static void main(String args[])
    {
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor "));
        
        
        for (i=1; i<=N; i++)
        {
            System.out.println(+FuncaoFibo(i));
        }
    }
    
    
    static int FuncaoFibo(int i)
    {
            SF = i2+i3;
            i2 = i3;
            i3 = SF;
            return SF;
    }
    
    
    
}
