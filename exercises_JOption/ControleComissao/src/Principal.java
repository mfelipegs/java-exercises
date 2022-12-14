
import javax.swing.JOptionPane;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vendedor vend = new Vendedor();
        
        int op;
        
        double valVend;
        
        do {
            // conversão para inteiro Integer.parsetInt
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite "
                    + "\n 1 - Nome"
                    + "\n 2 - Salário Base"
                    + "\n 3 - Valor Vendido / Calcular Comissão"
                    + "\n 0 - Sair"));
            
            switch(op) {
                case 1:
                    vend.entrarNome();
                    break;
                    
                case 2: 
                    vend.entrarSalarioBase();
                    break;
                
                case 3:
                    valVend = Double.parseDouble(JOptionPane.showInputDialog("Valor vendido: "));
                    JOptionPane.showMessageDialog(null,"O vendedor " + vend.getNome() +
                            " teve o salário final de " + vend.calculoComissao(valVend));
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
