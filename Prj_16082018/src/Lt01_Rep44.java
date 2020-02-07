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
public class Lt01_Rep44 
{
    public static void main(String args[])
    {
        int b,e;
        b =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base "));
        e =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente "));
        System.out.println(FuncaoExp(b,e));
        
    }
    
    static int FuncaoExp(int b, int e)
    {
        int n,i;
        n = b;
        i=1;
        while (i<e)
        {
            n =n*b;
            i++;
        }
        return n;
    }
    
}
