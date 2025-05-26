package FuturoBrilhante;

import java.util.Scanner;

public class CursoTecnico extends Pessoa{
    private String horaComplementar;
    private String cargaHoraria;

    public CursoTecnico(String nome, String cpf, String rg, String endereco,
                        String curso, String horaComplementar, String cargaHoraria) {
        super(nome, cpf, rg, endereco, curso);
        this.horaComplementar = horaComplementar;
        this.cargaHoraria = cargaHoraria;
    }

    public String getHoraComplementar() {
        return horaComplementar;
    }

    public void setHoraComplementar(String horaComplementar) {
        this.horaComplementar = horaComplementar;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    Scanner aluno = new Scanner(System.in);

    @Override
    public void cadastrarPessoa() {
        super.cadastrarPessoa();
        System.out.println("Hora Complementar:");
        horaComplementar = aluno.nextLine();
        System.out.println("Carga Horária:");
        cargaHoraria = aluno.nextLine();
    }

    @Override
    public void exibirPessoa() {
        super.exibirPessoa();
        System.out.println("Hora Complementar:"+horaComplementar);
        System.out.println("Carga Horária:"+cargaHoraria);
    }
}
