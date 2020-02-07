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
public class Lt01_Vet04 
{
    static int m;
    public static void main(String args[ ])
    {
        int vetor[ ] = new int[30];
        vetor = CarregaVetor(vetor);
        Media(vetor);
        Quantidade(vetor);
        //Posição(vetor;
    }
    
    
     public static int[] CarregaVetor(int vt[])
    {
        int cta;
               for ( cta = 0 ; cta < 30 ; cta++ ){
	       //vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
               vt[cta] =(int)(Math.random()*10);
                //System.out.println ("vetor carregado " +vt[cta]); 
               }
      return vt;
    }
    
    
    
    public static void Media(int vt[])
    {
        int cta,soma=0,n=0; 
                for (cta=0; cta <30 ; cta++)
                {
                     n = n + 1;
                     soma = soma + vt[cta];
                }
                m = soma/n;
                System.out.println(" A media do grupo eh :  " +m);
    }
     
    
    public static void Quantidade(int vt[])
    {
        int i,qnt=0; 
        for (i= 1 ; i<30; i++)
            {
                if(vt[i]>m)
                {
                    qnt=qnt+1;
                }
                else if(vt[i]<m)
                {
                    System.out.println ("posição " +i+"  esta abaixo da media ");
                }
            }
            
            System.out.println("Existem "+qnt+" notas acima da media");
    }
    
}