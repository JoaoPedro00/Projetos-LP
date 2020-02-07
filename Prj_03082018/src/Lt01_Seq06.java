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
public class Lt01_Seq06 
{
    public static void main(String args[])
    {
        int x, y, aux;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y"));
        aux = x;
        x = y;
        y = aux;
        System.out.println("o valor x ficara :" +x+ " e o valor y ficara :" +y);
    }
    
}
