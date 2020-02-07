import javax.swing.JOptionPane;
public class Lt01_Seq01
{
 public static void main(String args[])
  {
   int Lado,Area;
   Lado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor em Lado"));
   Area = (Lado * Lado);
   System.out.println ("A area eh : " + Area);
   
  }      
}
