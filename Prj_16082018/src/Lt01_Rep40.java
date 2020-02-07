
import javax.swing.JOptionPane;
public class Lt01_Rep40 
{
    public static void main(String args[])
    {
        int x,y,p,d,r,nope;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        if (x>y)
        {
            p=y+1;
            while (p<x)
            {
                d=2;
                nope=0;
                while(p>d)
                {
                    r=p%d;
                    d=d+1;
                    if(r==0)
                    {
                        nope = 1;
                    }
                    
                }
                if (nope<1)
                {
                    System.out.println(+p);
                    p=p+1;
                }
                else
                {
                    p=p+1;
                }
            }
        }
        else
        {
            p=x+1;
            while (p<y)
            {
                d=2;
                nope=0;
                while(p>d)
                {
                    r=p%d;
                    d=d+1;
                    if(r==0)
                    {
                        nope = 1;
                    }
                    
                }
                if (nope<1)
                {
                    System.out.println(+p);
                    p=p+1;
                }
                else
                {
                    p=p+1;
                }
            }
        }
    }
    
}
