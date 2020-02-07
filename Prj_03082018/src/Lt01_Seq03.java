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
public class Lt01_Seq03 
{
    public static void main(String args[])
    {
        int base , altura , area;
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do triangulo "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triangulo"));
        area = (base * altura) / 2;
        System.out.println("a area do triangulo é : " +area);
    }
    
}
