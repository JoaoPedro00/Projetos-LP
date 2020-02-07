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
public class Lt01_Vet06 
{
    public static void main(String args[])
    {
        int vetor[] = new int[20];
        vetor = CarregaVetor(vetor);
        ClassificaVetor(vetor);
        MostraVetor(vetor);
    }
    
    
     public static int[] CarregaVetor(int vt[])
    {
        int cta;
               for ( cta = 0 ; cta < 20 ; cta++ ){
	       //vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
               vt[cta] =(int) (Math.random() * 101);
               
               }
               JOptionPane.showMessageDialog(null,"Vetor Carregado");
      return vt;
    }
   
     
     public static int[] ClassificaVetor(int vt[])
     {
          int i,j, aux;
          for ( i = 0 ; i < 19 ; i++ ){
              for ( j = i+1 ; j < 20 ; j++ ){
	    if ((vt[i] > vt[j])) {
                          aux = vt[i];
                          vt[i] = vt[j];
                         vt[j] = aux; }
                     }   }
          JOptionPane.showMessageDialog(null,"Vetor Classificado");
       return vt; 
     }
     
     
     public static void MostraVetor(int vt[])
     {
         int cta;
                  for ( cta = 0 ; cta < 4 ; cta++ )
          {
	     System.out.println ("Vet[" + cta + "] = " +vt[cta]); 
	  }
            System.out.println ("******************************");
     }
}
