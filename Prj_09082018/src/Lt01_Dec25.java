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
public class Lt01_Dec25 
{
    public static void main(String args[])
    {
       int HI,HF,H,MI,MF,M;
       HI = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial do jogo "));
       MI = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial do jogo "));
       HF = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final do jogo "));
       MF = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final do jogo"));
       if (MF > MI)
               {
                  M = MF - MI;
                  if (HF>HI)
                  {
                      H=HF-HI;
                      System.out.println( + H + " HORAS E " + M + "MINUTOS");
                  }
                  else
                  {
                      H=HF+23-HI;
                      System.out.println( + H + " HORAS E " + M + "MINUTOS");
                  }
               }
       else
       {
           M = MF + 60 - MI;
                  if(HF>HI)
                  {
                     H=HF-HI;
                     System.out.println( + H + " HORAS E " + M + "MINUTOS"); 
                  }
                  else
                  {
                      H=HF+23-HI;
                      System.out.println( + H + " HORAS E " + M + " MINUTOS ");
                  }
       }
    }
}
