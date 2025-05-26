import FuturoBrilhante.CursoProfissionalizante;
import FuturoBrilhante.CursoTecnico;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int escolha;
        Scanner opcao = new Scanner(System.in);
        do {
            System.out.println("===============Menu===============");
            System.out.println(" 1 - para cadastrar Smartphone");
            System.out.println(" 2 - para cadastrar Notebook");
            System.out.println(" 3 - para cadastrar Smartwatch");
            System.out.println(" 4 - Sair do programa");

            escolha = opcao.nextInt();

            switch (escolha) {
                case 1:
                    CursoRegular cursoRegular = new CursoRegular("","","",
                            "","","",0);
                    cursoRegular.cadastrarPessoa();
                    cursoRegular.exibirPessoa();
                    break;
                case 2:
                    CursoTecnico cursoTecnico = new CursoTecnico("","","",
                            "","","","");
                    cursoTecnico.cadastrarPessoa();
                    cursoTecnico.exibirPessoa();
                    break;
                case 3:
                    CursoProfissionalizante cursoProfissionalizante = new CursoProfissionalizante("",
                            "","","","","");
                    cursoProfissionalizante.cadastrarPessoa();
                    cursoProfissionalizante.exibirPessoa();
                    break;
                default:
                    System.out.println("Saindo do programa...");
                    opcao.close();
                    break;
            }

        }while (escolha>0 && escolha<4);
    }
}