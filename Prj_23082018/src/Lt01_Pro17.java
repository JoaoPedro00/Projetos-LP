/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab 102
 */
import javax.swing.JOptionPane;
public class Lt01_Pro17 
 {
    static double l;
    public static void main(String args[])
    {
        
        ProcedureLitros();
        JOptionPane.showMessageDialog(null, "\n litros gastos sera = " + l);
    }
    
    static void ProcedureLitros()
    {
        Double v,t;
        t = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo do percuso em horas " ));
        v = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade media em km/h " ));
        l = (t * v)/12;
        
    }
}
