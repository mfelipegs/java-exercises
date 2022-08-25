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
public class Passagem {
    private String nomePassageiro;
    private String telefone;
    private String RG;
    private String localViagem;
    private String data;
    private String horario;
    private String numpoltrona;
    
    //constructor

    public Passagem() {
        this("","","","","","","");
    }

    public Passagem(String nomePassageiro, String telefone, String RG, String localViagem, String data, String horario, String numpoltrona) {
        this.nomePassageiro = nomePassageiro;
        this.telefone = telefone;
        this.RG = RG;
        this.localViagem = localViagem;
        this.data = data;
        this.horario = horario;
        this.numpoltrona = numpoltrona;
    }
    
    //encapsulamento
    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumpoltrona() {
        return numpoltrona;
    }

    public void setNumpoltrona(String numpoltrona) {
        this.numpoltrona = numpoltrona;
    }
    
    //methods
    public void cadastrarDadosPassageiros() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Digite o nome do passageiro: ");
        setNomePassageiro(ent.next());
        System.out.println("Digite o RG: ");
        setRG(ent.next());
        System.out.println("Digite o telefone: ");
        setTelefone(ent.next());
    }
    
    public void cadastrarDadosPassagem() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Digite o local da viagem: ");
        setLocalViagem(ent.next());
        System.out.println("Digite a data da passagem: ");
        setData(ent.next());
        System.out.println("Digite o horário: ");
        setHorario(ent.next());
        System.out.println("Digite o número da poltrona: ");
        setNumpoltrona(ent.next());
    }
    
    public void mostrarDadosPassageiro() {
        System.out.println("Nome do passageiro: " + getNomePassageiro()
                            + "\n RG: " + getRG()
                            + "\n Telefone: " + getTelefone() );
    }
    
    public void mostrarDadosPassagem() {
        System.out.println("Local da viagem: " + getLocalViagem()
                            + "\n Data: " + getData()
                            + "\n Horário: " + getHorario()
                            + "\n Número da poltrona: " + getNumpoltrona() );
    }
}
