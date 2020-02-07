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
    public static void main (String args[])
    {
        int litros, tempo, velocidade,total;
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de percurso horas"));
        velocidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade media em km/h"));  
        total = velocidade * tempo;
        litros = total/12;
        System.out.println("A qnt de litros gastos é : "+litros);
    }
    
}
