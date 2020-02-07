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
public class Lt01_Seq17 
{
    public static void main(String args[])
    {
        Double l,v,t;
        t = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo do percuso em horas " ));
        v = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade media em km/h " ));
        l = (t * v)/12;
        System.out.println("A quantidade de litros gastos sera : " + l);
        
    }
    
}
