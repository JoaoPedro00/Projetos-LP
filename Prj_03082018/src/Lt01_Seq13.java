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
public class Lt01_Seq13 
{
    public static void main(String args[])
    {
        int qnt,dias;
        qnt = Integer.parseInt(JOptionPane.showInputDialog(" Digite a quantidade de alimentos em quilos "));
        qnt = qnt*1000;
        dias = qnt/50;
        System.out.println(" A quantidade de dias que a comida durará é : "+dias);
        
    }
    
}
