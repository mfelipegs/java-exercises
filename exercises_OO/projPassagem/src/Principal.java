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
        
        Passagem p = new Passagem();
        
        p.cadastrarDadosPassageiros();
        p.cadastrarDadosPassagem();
        p.mostrarDadosPassageiro();
        p.mostrarDadosPassagem();
        
    }
    
}
