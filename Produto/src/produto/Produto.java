/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

/**
 *
 * @author fatec_aluno
 */
import java.util.Scanner;
public class Produto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome_Produto;
        double valor_Produto, valor_Total;
        int qtd;
        
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        nome_Produto = ent.next();
        System.out.println("Digite o valor do produto: ");
        valor_Produto = ent.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        qtd = ent.nextInt();
        
        valor_Total = valor_Produto * qtd;
        
        System.out.println("Produto: " + nome_Produto + 
                "\n Valor: R$" + valor_Produto + 
                "\n Quantidade: " + qtd + 
                "\n Valor Total: R$" + valor_Total);
    }
    
}
