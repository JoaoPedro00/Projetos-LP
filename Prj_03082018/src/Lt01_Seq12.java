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
public class Lt01_Seq12 
{
    public static void main(String args[])
    {
        int ano_nasc,ano_atual,idade;
        ano_nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do nascimento "));
        ano_atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
        idade = ano_atual - ano_nasc;
        idade = idade + 17;
        System.out.println(" Sua idade depois de 17 anos sera : " +idade );
    }
    
}
