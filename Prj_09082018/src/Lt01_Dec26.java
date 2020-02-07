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
public class Lt01_Dec26 
{
    public static void main(String args[])
    {
        int x,y,r;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor "));
        if (x > y)
        {
            r = x%y;
            if ( r == 0)
            {
                JOptionPane.showMessageDialog(null, + x + " é multiplo de " + y +"");
            }
            else
            {
                JOptionPane.showMessageDialog(null, + x + " nao é multiplo de " + y + "");
            }
        }
        else
        {
            r = y%x;
            if ( r == 0)
            {
                JOptionPane.showMessageDialog(null, + y + " é multiplo de " + x +"");
            }
            else
            {
                JOptionPane.showMessageDialog(null, + y + " nao é multiplo de " + x +"");
            }
        }
        
    }
    
}
