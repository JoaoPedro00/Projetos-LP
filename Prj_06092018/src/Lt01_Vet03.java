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
public class Lt01_Vet03 
{
 public static void main(String args[])
 {
     int vt1[] = {1,2,3}, vt2[] = {4,5,6}, vt3[] = new int[6];
     JOptionPane.showMessageDialog(null, "o vetor concartenado " + Concatenar(vt1,vt2,vt3));
 }
    public static String Concatenar(int vt1[], int vt2[], int vt3[])
        {
            int x;
            String mens = "";
            String b,a;
            for (x=0; x<=2;x++)
            {
                vt3[x] = vt1[x];
                b = vt3[x]+ "|";
                mens = mens + b;
            }
            
            for(x=3;x<=5;x++)
            {
                vt3[x]=vt2[x-3];
                a = vt3[x]+"|";
                mens = mens + a;
            }
            return mens;
        }
}
