
import javax.swing.JOptionPane;
public class Lt01_Rep35 
{
    public static void main(String args[])
    {
        int x,y,r,n,s=0;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor "));
        if (x>y)
        {
            r = y%2;
            if (r==0)
            {
                n = y +1;
                while (n<x)
                {
                    s = s+n;
                    n = n+2;
                }
                System.out.println("A somatoria dos numeros impares sera : " +s);
            }
            else 
            {
                n=y+2;
                while(n<x)
                {
                    s=s+n;
                    n=n+2;
                }
                System.out.println("A somatoria dos numeros impares sera : " +s);
            }
        }
        else
        {
            r = x%2;
            if(r==0)
            {
                n=x+1;
                while(n<y)
                {
                    s=s+n;
                    n=n+2;
                }
                System.out.println("A somatoria dos numeros impares sera : " +s);
            }
            else
            {
                n=x+2;
                while(n<y)
                {
                    s=s+n;
                    n=n+2;
                }
                System.out.println("A somatoria dos numeros impares sera : " +s);
            }
        }
    }
    
}
