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
public class Lt01_Seq05 
{
    public static void main(String args[])
        {
          Double A,B,C,D,X,X1;
            A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A "));
            B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da B "));
            C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da C "));
            D = (B * B - 4 * A * C);
            X = ((- B + java.lang.Math.sqrt(D))/2 * A);
            X1 = ((-B - java.lang.Math.sqrt(D))/2 * A);
            System.out.println (" A primeira raiz eh : " + X );
            System.out.println (" A segunda raiz eh : " + X1 );
     
        }
}
