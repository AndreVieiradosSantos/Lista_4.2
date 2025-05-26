package FuturoBrilhante;

import java.util.Scanner;

public class CursoProfissionalizante extends Pessoa{
    private String especialidade;

    public CursoProfissionalizante(String nome, String cpf, String rg,
                                   String endereco, String curso, String especialidade) {
        super(nome, cpf, rg, endereco, curso);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    Scanner aluno = new Scanner(System.in);

    @Override
    public void cadastrarPessoa() {
        super.cadastrarPessoa();
        System.out.println("Especialidade:");
        especialidade = aluno.nextLine();
    }

    @Override
    public void exibirPessoa() {
        super.exibirPessoa();
        System.out.println("Especialidade:"+especialidade);
    }
}
