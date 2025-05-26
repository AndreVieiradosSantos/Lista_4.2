package FuturoBrilhante;

import java.util.Scanner;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String curso;

    public Pessoa(String nome, String cpf, String rg, String endereco, String curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    Scanner pessoa = new Scanner(System.in);
    public void cadastrarPessoa(){
        System.out.println("Nome:");
        nome = pessoa.nextLine();
        System.out.println("Cpf:");
        cpf = pessoa.nextLine();
        System.out.println("Rg:");
        rg = pessoa.nextLine();
        System.out.println("Endereço:");
        endereco = pessoa.nextLine();
        System.out.println("Curso:");
        curso = pessoa.nextLine();
    }
    public void exibirPessoa(){
        System.out.println("Nome:"+nome);
        System.out.println("Cpf:"+cpf);
        System.out.println("Rg:"+rg);
        System.out.println("Endereço:"+endereco);
        System.out.println("Curso:"+curso);

    }
}
