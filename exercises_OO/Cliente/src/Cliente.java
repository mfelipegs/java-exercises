/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec_aluno
 */
import java.util.Scanner;
public class Cliente {
    private String nome;
    private String end;
    private String rg;
    
    //constructor

    public Cliente() {
        this("","","");
    }

    public Cliente(String nome, String end, String rg) {
        this.nome = nome;
        this.end = end;
        this.rg = rg;
    }
    
    //encapsulamento

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    //methods
    public void cadastrarCliente() {
        Scanner e = new Scanner(System.in);
        
        System.out.println("Digite o nome do cliente: ");
        setNome(e.next());
        System.out.println("Digite o endereço: ");
        setEnd(e.next());
        System.out.println("Digite o RG: ");
        setRg(e.next());
    }
    
    public void listarCliente() {
        System.out.println("Nome: " + getNome()
                            + "\n Endereço: " + getEnd()
                            + "\n RG: " + getRg() );
    }
    
}
