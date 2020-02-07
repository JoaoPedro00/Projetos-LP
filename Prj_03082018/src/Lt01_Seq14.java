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
        int angulo1, angulo2, angulo;
        angulo1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de um angulo"));
        angulo2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de um angulo"));
        angulo = 180 - (angulo1 + angulo2);
        System.out.println(" o valor do 3 angulo é : " +angulo);
    }
    
}
