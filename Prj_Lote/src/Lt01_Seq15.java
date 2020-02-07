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
public class Lt01_Seq15 
{
    public static void main(String args[])
    {
        Double ca,co,hip;
        ca = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto adjacente " ));
        co = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto oposto " ));
        hip = (ca * ca)+ (co * co);
        hip = java.lang.Math.sqrt(hip);
        System.out.println("O valor da hipotenusa eh : " + hip);
        
    }
    
}
