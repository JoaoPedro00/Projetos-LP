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
       int nasc,atual,idade,i;
       nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento " ));
       atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual " ));
       idade = atual - nasc;
       i = idade + 17;
       System.out.println("A idade dps de 17 anos sera : " + i );
     
    }
}
