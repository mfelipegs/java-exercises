/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraBasica;

import javax.swing.JOptionPane;


/**
 *
 * @author fatec_aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CalculadoraBasica cb = new CalculadoraBasica();
        
        double num1, num2;
        int op;
        
        //estrutura de repetição do while
        do {
            // conversão para inteiro Integer.parsetInt
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n " +
                    "\n 1 - Somar\n 2 - Subtrair\n 3 - Multiplicar\n 4 - Dividir\n 0 - Sair"));
            
            //Estrutura de condição switch case
            switch(op) // Selecione a variavel op, que guarda a opção digitada
            {
                case 1:
                    cb.somar();
                    JOptionPane.showMessageDialog(null, "Soma: " + cb.getR());
                    break;//paralisar cada caso
                    
                case 2:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
                    cb.subtrair(num1, num2);
                    JOptionPane.showMessageDialog(null, "Subtração: " + cb.getR());
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null,"Produto: " + cb.multiplicar());
                    break;
                    
                 case 4:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
                    cb.dividir(num1, num2);
                    JOptionPane.showMessageDialog(null, "Quociente: " + cb.getR());
                    break;
                     
                case 0: 
                    JOptionPane.showMessageDialog(null,"Finalizando o programa");// show mostra a mensagem
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inváliida");
                    break;
            }
            
        }while(op != 0);
    }
    
}
