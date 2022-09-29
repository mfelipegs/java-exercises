
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
        Cliente cli = new Cliente();
        Produto prod = new Produto();
    
    int op;
        do {

            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n " +
                    "\n 1 - Cadastrar cliente\n 2 - Listar cliente\n 3 - Cadastrar Produto\n 4 - Listar Produto\n 5 - Vender\n 0 - Sair"));
            
            switch(op)
            {
                case 1:
                    cli.cadastrarCliente();
                    break;
                    
                case 2:
                    cli.listarCliente();
                    break;
                
                case 3:
                    prod.cadastrarProduto();
                    break;
                 
                case 4:
                    prod.listarProduto();
                    break;
                    
                case 5:
                    int qtde= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
                    if(prod.getEstoqueDisponivel()>= qtde){
                        prod.pedido(qtde);JOptionPane.showMessageDialog(null,"Preço total da compra: R$"+ prod.pedido(qtde));
                        prod.vender(qtde);
                    }
                    else {
                        JOptionPane.showMessageDialog(null," Estoque Indisponivel");
                    }
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
