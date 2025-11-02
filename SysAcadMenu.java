import java.util.Scanner;

public class SysAcadMenu {
    private Scanner teclado = new Scanner(System.in);

    public void exibir() {
        int opcao = 0;
        
        do {
            System.out.println("\n--- SISTEMA ACADÊMICO ---");
            System.out.println("1. Períodos");
            System.out.println("2. Cursos");
            System.out.println("3. Disciplinas");
            System.out.println("9. Sair");
            System.out.print("Digite a opção: ");
            opcao = Integer.parseInt(teclado.nextLine());

            // Menu do Sistema 

            if (opcao == 1) {
                // Menu de Períodos
                PeriodoMenu menuPeriodo = new PeriodoMenu();
                menuPeriodo.exibir();

            } else if (opcao == 2) {
                // Menu de Cursos
                CursoMenu menuCurso = new CursoMenu();
                menuCurso.exibir();

            } else if (opcao == 3) {
                // Menu de Disciplinas
                DisciplinaMenu menuDisciplina = new DisciplinaMenu();
                menuDisciplina.exibir();

            } else if (opcao == 9) {
                // Sair do Sistema
                System.out.println("Saindo do sistema...");

            } else {
                // Quando é uma opção inválida
                System.out.println("Opção inválida!");
            }

            // Repete o menu até que a opção seja 9 (Sair)
        } while (opcao != 9);
    }
}