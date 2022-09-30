
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
        CustoPiso piso = new CustoPiso();
        
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
                    + "\n1 - Inserir valores do cômodo"
                    + "\n2 - Calcular preço por área"
                    + "\n3 - Mostrar valores"
                    + "\n0 - Sair"));
            
            switch(op) {
                case 1:
                    piso.inserirValores();
                    break;
                    
                case 2:
                    piso.calcularPrecoArea();
                    break;
                    
                case 3:
                    piso.mostrarValores();
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
