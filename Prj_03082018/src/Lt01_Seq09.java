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
public class Lt01_Seq09 
{
    public static void main(String args[])
    {
        int x,y,soma;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor "));
        soma = (x*x)+(y*y);
        System.out.println(" o valor da soma dos quadrados é : " +soma);
    }
    
}
