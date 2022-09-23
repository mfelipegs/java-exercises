
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec_aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Percurso percurso = new Percurso();
        Custos custo = new Custos();
        
        int op;
        do {
            // conversão para inteiro Integer.parsetInt
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n " +
                    "\n 1 - Cadastrar percurso\n 2 - Listar percurso\n 3 - Totalizar viagem\n 0 - Sair"));
            
            //Estrutura de condição switch case
            switch(op) // Selecione a variavel op, que guarda a opção digitada
            {
                case 1:
                    percurso.cadastrarPercurso();
                    break;//paralisar cada caso
                    
                case 2:
                    percurso.listarPercurso();
                    break;
                    
                case 3:
                    custo.calcularViagem(percurso);
                    break;
                    
                case 0: 
                    JOptionPane.showMessageDialog(null,"Finalizando o programa");// show mostra a mensagem
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida");
                    break;
            }
            
        }while(op != 0);
    }
    
}
