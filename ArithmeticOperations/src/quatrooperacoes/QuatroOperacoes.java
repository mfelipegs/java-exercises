/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quatrooperacoes;

/**
 *
 * @author fatec_aluno
 */
import java.util.Scanner;
public class QuatroOperacoes {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
        double n1, n2, sum, sub, multip, div;
        
        System.out.println("Enter the first number: ");
        n1 = e.nextDouble();
        System.out.println("Enter the second number: ");
        n2 = e.nextDouble();
        
        sum = n1 + n2;
        sub = n1 - n2;
        multip = n1 * n2;
        div = n1 / n2;
        
        System.out.println("Sum: " + sum +
                "\nSubtraction: " + sub + 
                "\nProduct: " + multip + 
                "\nQuotient: " + div);
    }
    
}
