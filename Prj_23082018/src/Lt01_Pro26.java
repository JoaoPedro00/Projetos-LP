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
public class Lt01_Pro26 
{
    public static void main(String args[])
    {
        int x,y;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor "));
        ProcedureMult(x,y);
        
    }
    
    static void ProcedureMult(int x1, int y1)
    {
        int r;
        if (x1 > y1)
        {
            r = x1%y1;
            if ( r == 0)
            {
                JOptionPane.showMessageDialog(null, + x1 + " é multiplo de " + y1 +"");
            }
            else
            {
                JOptionPane.showMessageDialog(null, + x1 + " nao é multiplo de " + y1 + "");
            }
        }
        else
        {
            r = y1%x1;
            if ( r == 0)
            {
                JOptionPane.showMessageDialog(null, + y1 + " é multiplo de " + x1 +"");
            }
            else
            {
                JOptionPane.showMessageDialog(null, + y1 + " nao é multiplo de " + x1 +"");
            }
        }
        
    }
    
}

    

