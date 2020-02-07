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
public class Lt01_Seq14 
{
    public static void main(String args[])
    {
        Double x,y,z;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do angulo x " ));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do angulo y " ));
        z = 180 -(x + y);
        System.out.println("O valor do terceiro angulo do triangulo eh : " + z );
        
    }
}
