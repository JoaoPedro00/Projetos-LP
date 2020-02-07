/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab 102
 */
import java.io.IOException;
import javax.swing.JOptionPane;

public class ClassePrincipal {
    public static void main(String[] args) throws IOException 
    {
        int opc=10;
        Aluno[] aluno = new Aluno[3];
        ClasseMetodos a = new ClasseMetodos();
        for(int i=0;i<3;i++)
        {
            aluno[i] = new Aluno();
        }
        while(opc !=9)
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: \n 1- Cadastra Aluno \n 2- Ler Aluno \n 9- Fim"));
            switch(opc)
            {
                case 1: aluno= a.FCadastraAluno(aluno); 
                    break;
                case 2:  a.PLerAluno(aluno);
                    break;
                case 9: JOptionPane.showMessageDialog(null, "Acabou!!!");
            }
        }
    }    
}