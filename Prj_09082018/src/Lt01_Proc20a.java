/**
 *
 * @author Lab 102
 */
import javax.swing.JOptionPane;
public class Lt01_Proc20a 
{
    static  Double a,b,c,d,x,x1;
       
    public static void main(String args[])
    {
        ProcedureColetar();
        ProcedureRaiz();
    }
    
    static void ProcedureColetar()
    {
        a = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do coeficiente a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do coeficiente b"));
        c = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do coeficiente c"));
    }
    
    static void ProcedureRaiz()
    {
        d = ((b * b) - 4 * a * c);
        if (d>0)
        {
            x = ((- b + java.lang.Math.sqrt(d))/2 * a);
            x1 = ((- b - java.lang.Math.sqrt(d))/2 * a);
            System.out.println (" As raizes sao : " + x + " e " + x1);
        }
        else if(d==0)
        {
            x = ((- b + java.lang.Math.sqrt(d))/2 * a);
            System.out.println (" A raiz eh: " + x);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nao existe raizes reais");
        }
    }
    
}
