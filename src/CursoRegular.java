import FuturoBrilhante.Pessoa;

import java.util.Scanner;

public class CursoRegular extends Pessoa {
    private String bolsa;
    private double descontoMens;

    public CursoRegular(String nome, String cpf, String rg, String endereco,
                        String curso, String bolsa, double descontoMens) {
        super(nome, cpf, rg, endereco, curso);
        this.bolsa = bolsa;
        this.descontoMens = descontoMens;
    }

    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }

    public double getDescontoMens() {
        return descontoMens;
    }

    public void setDescontoMens(double descontoMens) {
        this.descontoMens = descontoMens;
    }
     Scanner aluno = new Scanner(System.in);
    @Override
    public void cadastrarPessoa() {
        super.cadastrarPessoa();
        System.out.println("Bolsa:");
        bolsa = aluno.nextLine();
        System.out.println("Desconto na mensalidade:");
        descontoMens = aluno.nextDouble();
    }

    @Override
    public void exibirPessoa() {
        super.exibirPessoa();
        System.out.println("Bolsa:"+bolsa);
        System.out.println("Desconto na mensalidade:"+descontoMens);

    }
}
