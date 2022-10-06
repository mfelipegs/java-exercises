
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
        Eleitores eleit = new Eleitores();
        
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
                    + "\n1 - Inserir quantidade de votos"
                    + "\n2 - Calcular Total eleitores"
                    + "\n3 - Calcular e mostrar percentual de votos"
                    + "\n0 - Sair"));
            
            switch(op) {
                case 1:
                    eleit.inserirQtdVotos();
                    break;
                    
                case 2:
                    eleit.calcularTotalEleitores();
                    break;
                    
                case 3:
                    eleit.calcularPercentualVotos();
                    break;
                    
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando o programa");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida");
                    break;   
            }
            
        }while(op != 0);
    }
    
}
