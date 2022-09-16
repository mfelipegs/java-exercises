
import javax.swing.JOptionPane;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        
        int op;
        
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu de ações: "
                    + "\n 1 - Cadastrar cliente"
                    + "\n 2 - Listar cliente"
                    + "\n 3 - Calcular limite de crédito"
                    + "\n 0 - Sair"));
            
            switch(op) {
                case 1:
                    cli.cadastrarCliente();
                    break;
                    
                case 2: 
                    cli.listarCliente();
                    break;
                
                case 3:
                    cli.calcularLimiteCredito();
                    break;
                
                case 0: 
                    JOptionPane.showMessageDialog(null,"Finalizando o programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida");
                    break;
            }
        }while(op != 0);
    }
    
}
