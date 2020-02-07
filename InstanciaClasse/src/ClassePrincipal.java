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
public class ClassePrincipal 
{
    public void main (String args[]) {
        ClasseMetodos m = new ClasseMetodos();
        int v[] = new  int[5];
        int opc = 0;
      do {
        opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar vetor\n2 - Classificar      vetor \n 3 - Mostrar vetor\n9 - Finalizar"));
            
            switch (opc)
            {
                  case 1: v = m.FunçãoCarrega(v);
                               break;
                  case 2: v = m.FunçãoClassifica(v);
                               break;
                  case 3: m.ProcedimentoMostra(v);
                               break;
                  case 9: JOptionPane.showMessageDialog(null,"finaliza");
                               break;
                  default: JOptionPane.showMessageDialog(null,"opc inválida");
            }
      }
      while(opc != 9);
     
    }}
    
    