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
public class Lt01_Fun34 
{
    static int n;
    public static void main(String args[])
    {
        int y;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero "));
        for ( y=1;y<=10;y++)
        {
            System.out.println(+n+" vezes "+y+" é : "+FuncaoTab(y));
        }
    }
    
    
    
    static int FuncaoTab(int pos)
    {
        int x;
        x = pos*n;
        return x;
    }
    
}
