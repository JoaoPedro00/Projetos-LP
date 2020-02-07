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
public class Lt01_Seq08 
{
    public static void main(String args[])
    {
       Double X;
       X = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da poupanca "));
       X = ( X * 1.013 );
       System.out.println("O valor novo eh : " + X );
       
    }
    
}
