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
public class Lt01_Vet02 
{
    public static void main(String args[])
    {
        int vetor[] = new int[100];
        vetor = CarregaVetor(vetor);
        MaiorMenor(vetor);
        Media(vetor);
    }
    
    
    public static int[] CarregaVetor(int vt[])
    {
        int cta;
               for ( cta = 0 ; cta < 100 ; cta++ ){
	       //vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
               vt[cta] =(int)(Math.random()*300);
                System.out.println ("vetor carregado " +vt[cta]); 
               }
      return vt;
    }
    
    public static void MaiorMenor(int vt[])
    {
        int ma,me,cta=0;
        ma=vt[cta];
        me=vt[cta];
                 for (cta=1; cta <100 ; cta++)
                 {
                    if(vt[cta]>ma)
                    {
                        ma = vt[cta];
                    }
                    if (vt[cta]<me)
                    {
                        me = vt[cta];
                    }
                 }
                 System.out.println(" o maior é " +ma+ "\n o menor é " +me);
    }
    
    
    
    public static void Media(int vt[])
    {
      int cta,soma=0,n=0,m; 
                for (cta=0; cta <100 ; cta++)
                {
                     n = n + 1;
                     soma = soma + vt[cta];
                }
                m = soma/n;
                System.out.println(" A media dos valores é  " +m);
    }
}
