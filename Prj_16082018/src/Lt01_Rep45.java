/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João
 */

public class Lt01_Rep45 
{
    public static void main(String args[])
    {
        int x,y,r;
        x = 1;
        System.out.println(x);
        while(x<15)
        {
            x++;
            y=x*x;
            r=x%2;
            if(r==0)
            {
                System.out.println(-x+"/"+y);
            }
            else
            {
                System.out.println(x+"/"+y);
            }
        }
    }
    
}
