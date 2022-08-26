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
        // TODO code application logic here
        
        //INSTANCIAÇÃO DO OBJETO (CRIAR O OBJETO)
        //Classe=Usuario Objeto=user
        Usuario user = new Usuario();
        
        //Setando os dados nos atributos (SETTER)
        user.setNome("Matheus Felipe");
        user.setLogin("math");
        user.setSenha("12345Ma");
        user.Mensagem();
    }
    
}
