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
public class Lt01_Seq10 
{
    public static void main(String args[])
    {
        Double x,y,dif; //dif = diferença
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        if ( x > y)
        {
            dif = x - y;
        }
        else 
        {
            dif = y - x;
        }
        System.out.println(" A diferença é : " +dif);
    }
    
}
