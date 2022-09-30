
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
        Quadrado quad = new Quadrado();
        
        double valor_lado;
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
                    + "\n1 - Calcular área do quadrado"
                    + "\n2 - Calcular perímetro do quadrado"
                    + "\n3 - Mostrar valores"
                    + "\n0 - Sair"));
            
            switch(op) {
                case 1:
                    valor_lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado:"));
                    quad.calcularArea(valor_lado);
                    break;
                    
                case 2:
                    valor_lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado:"));
                    quad.calcularPerimetro(valor_lado);
                    break;
                    
                case 3:
                    quad.mostrarValores();
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
