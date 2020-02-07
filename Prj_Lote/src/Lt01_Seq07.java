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
public class Lt01_Seq07 
{
    public static void main(String args[])
    {
        Double C,L,H,V;
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento "));
        L = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura "));
        H = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura "));
        V = ( C * L * H);
        System.out.println("O volume do paralelepido eh : " + V );
    }
    
}
