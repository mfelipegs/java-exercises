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
        //instanciação
        idadePessoa y = new idadePessoa();
        
        y.calcularIdade();
        System.out.println(y.mostrarIdade());
    }
    
}
