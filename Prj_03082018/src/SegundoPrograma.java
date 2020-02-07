/* Objetivo: Segundo programa em Java 
             Coleta lado, calcula area e mostra resultado
Programador: Ricardo Satoshi
Data       : 02/08/2018
*/
import javax.swing.JOptionPane;
public class SegundoPrograma
{
 public static void main(String args[])
  {
   int Lado,Area;
   Lado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor em Lado"));
   Area = (Lado * Lado);
   System.out.println ("A area eh : " + Area);
   
  }      
}
