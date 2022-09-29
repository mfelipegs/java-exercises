/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec_aluno
 */
import javax.swing.JOptionPane;

public class Principal {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comanda controleMesa = new Comanda();
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma ação: "
                    + "\n1 - Lançar Gastos"
                    + "\n2 - Verificar Promoção"
                    + "\n3 - Fechar Mesa"
                    + "\n4 -  Listar Comanda"
                    + "\n0 - Sair"));
        
            switch(op){
                case 1: 
                    controleMesa.lancarGastos();
                    break;
                    
                case 2: 
                    controleMesa.verificarPromocao();
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null,"Mesa Fechada\n"
                            + "Valor total: " + controleMesa.totalizarComanda());
                    break;
                    
                case 4: 
                    controleMesa.listarComanda();
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
