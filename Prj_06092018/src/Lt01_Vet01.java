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
public class Lt01_Vet01 
{
    public static void main(String args[])
    {
     int opc = 0;
     int vetor[ ] = new int[50];
     while (opc != 9){
      opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Média Vetor  \n 3 - Soma dos impares \n 9 - Fim"));
      switch (opc)
         {
            case 1:
            	vetor = CarregaVetor(vetor);
                break;
         
            case 2:
               	MédiaVetor(vetor);
                break;
            case 3:
                SomaImpar(vetor);
                break;
            case 9:
                 JOptionPane.showMessageDialog(null,"FIM");
                 System.exit(0);
                 break;
            default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
         }
   }
 }
    
    
    public static int[] CarregaVetor(int vt[])
    {
        int cta;
               for ( cta = 0 ; cta < 50 ; cta++ ){
	       //vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
               vt[cta] =(int)(Math.random()*300);
                 System.out.println ("vetor carregado " +vt[cta]); 
               }
      return vt;
    }
    
    public static void MédiaVetor(int vt[])
    {
        int cta,valor,n=0,soma=0,media;
            for (cta = 0 ; cta < 50 ; cta++ )
            {
                if (vt[cta]>10 && vt[cta]<200)
                {
                    n = n+1;
                    valor = vt[cta];
                    soma = soma + valor;
                }
            }
            media = soma/n;
            System.out.println ("a média dos valores eh " +media); 
    }
    
   public static void SomaImpar(int vt[])
   {
       int cta,r,s=0,valor;
       for (cta = 0 ; cta < 50 ; cta++ )
       {
           r = vt[cta]%2;
           if (r!=0)
           {
              valor = vt[cta];
              s = s + valor;
           }
       }
       System.out.println("a soma dos numeros impares eh " +s);
       
   }
    
}
