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
        //instanciar o objeto mult da classe multiplicacao
        Multiplicacao mult = new Multiplicacao();
        
        //chamada do metodo multiplicacao4
        mult.multiplicacao4();
        
        //chamada do metodo com retorno mostrarMultiplicacao
        System.out.println(mult.mostrarMultiplicacao());
        
        //chamada do metodo sem retorno mostrarMultiplicacaoV
        mult.mostrarMultiplicacaoV();
    }
    
}
