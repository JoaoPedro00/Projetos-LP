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
public class Lt01_Vet05 
{
    public static void main (String args[])
    {
        int vetor [ ] = new int [20];
        vetor = CarregaVetor(vetor);
        Somatoria(vetor);
    }
    
    
    
    public static int [] CarregaVetor(int vt[])
    {
        int cta;
        for (cta=0;cta<20;cta++)
        {
             vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        }
        return vt;
    }
    
    
     public static void Somatoria(int vt[])
    {
        int cta,soma;
        for (cta=0;cta<20;cta++)
        {
            soma = vt[cta] - vt[(20-cta)];
            System.out.println("vetor " +cta+" vetor " +(20-cta)+" é igual a " +soma);
            
        }
    }
    
}
