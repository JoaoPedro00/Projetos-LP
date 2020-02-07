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
        int comp , larg, alt, volume;
        comp = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do paralelepipedo"));
        alt = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura  do paralelepipedo"));
        larg = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura  do paralelepipedo"));
        volume = comp*alt*larg;
        System.out.println(" o volume é : " +volume);
        
    }
    
    
}
