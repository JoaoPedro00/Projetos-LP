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
public class Lt01_Rep41 
{
    public static void main(String args[])
    {
        int d1,d2;
        d1=1;
        while(d1<=6)
        {
            d2=1;
            while(d2<=6)
            {
                if((d1+d2)==7)
                {
                    System.out.println(d1+ " e " +d2);
                }
                d2++;                  
            }
            d1++;
        }
    }
    
}
