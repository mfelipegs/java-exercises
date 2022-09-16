
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
        do {
            // conversão para inteiro Integer.parsetInt
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n " +
                    "\n 1- Entrada de valor \n 2-Retirada da valor \n 3-Consultar saldo \n 0-Sair"));

            //Estrutura de condição switch case
            switch(op) // Selecione a variavel op, que guarda a opção digitada
            {
                case 1:
                    cx.entrar();
                    break;//paralisar cada caso
                case 2:
                    cx.retirar();
                    break;
                case 3:
                    //para mostrar mensagem JOptionPane.showMessageDialog
                    JOptionPane.showMessageDialog(null, "Saldo atual é R$: " + cx.getSaldo());
                    break;
                case 0: 
                    JOptionPane.showMessageDialog(null,"Finalizando o programa");// show mostra a mensagem
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inváliida");
                    break;
            }

        } while(op !=0);
        
    }
    
}
