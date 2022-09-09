
import javax.swing.JOptionPane;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciar objeto da classe Caixa
        Caixa cx = new Caixa();
        
        int op; //declaração de variável
        
        //estrutura de repetição do while
        do{
            //CONVERSÃO PARA INTEIRO Integer.parseInt
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n " +
                    "\n 1 - Entrada de Valor \n 2 - Retirada de Valor \n 3 - Consultar Saldo \n 0 - Sair"));
        }
        
    }
    
}
