import java.util.Scanner;

public class DisciplinaMenu {
    private Scanner teclado = new Scanner(System.in);
    private DisciplinaBanco bancoDisciplinas = new DisciplinaBanco();

    public void exibir() {
        int opcao = 0;
        do {
            System.out.println("\n--- MENU DE DISCIPLINAS ---");
            System.out.println("1. Adicionar");
            System.out.println("2. Alterar");
            System.out.println("3. Excluir");
            System.out.println("4. Pesquisar por código");
            System.out.println("5. Imprimir todos");
            System.out.println("6. Ver número de cadastrados"); // NOVA OPÇÃO
            System.out.println("9. Voltar ao menu principal");
            System.out.print("Digite a opção: ");
            opcao = Integer.parseInt(teclado.nextLine());

            if (opcao == 1) {
                // Opção Adicionar
                adicionar();

            } else if (opcao == 2) {
                // Opção Alterar
                alterar();

            } else if (opcao == 3) {
                // Opção Excluir
                excluir();

            } else if (opcao == 4) {
                // Opção Pesquisar
                pesquisar();

            } else if (opcao == 5) {
                // Opção Imprimir todos os registros de disciplinas
                bancoDisciplinas.imprimirTodos();

            } else if (opcao == 6) { 
                // Opção Ver número de cadastrados
                 System.out.println("\nNúmero de disciplinas cadastradas: " + bancoDisciplinas.getNumeroDisciplinas());

            } else if (opcao == 9) {
                // Opção Voltar ao menu principal
                System.out.println("Voltando...");

            } else {
                // Quando é uma opção inválida
                System.out.println("Opção inválida!");
            }
            
        } while (opcao != 9);
    }

    // Método adicionar
    private void adicionar() {
        System.out.println("\n--- Adicionar Nova Disciplina ---");
        Disciplina disciplina = new Disciplina();

        do {
            System.out.print("Código: ");
        } while (!disciplina.setId(Integer.parseInt(teclado.nextLine())));
        
        do {
            System.out.print("Nome: ");
        } while (!disciplina.setNome(teclado.nextLine()));

        System.out.print("Sigla: ");
        disciplina.setSigla(teclado.nextLine());

        System.out.print("Observações: ");
        disciplina.setObservacoes(teclado.nextLine());

        bancoDisciplinas.adicionar(disciplina);
    }

    // Método alterar
    private void alterar() {
        System.out.println("\n--- Alterar Disciplina ---");
        System.out.print("Informe o código da disciplina a ser alterada: ");
        int id = Integer.parseInt(teclado.nextLine());

        Disciplina disciplina = bancoDisciplinas.pesquisar(id);

        if (disciplina == null) {
            System.out.println("Disciplina não localizada!");
        } else {
            System.out.println("Dados atuais: " + disciplina);
            do {
                System.out.print("Novo Nome: ");
            } while (!disciplina.setNome(teclado.nextLine()));

            System.out.print("Nova Sigla: ");
            disciplina.setSigla(teclado.nextLine());

            System.out.print("Novas Observações: ");
            disciplina.setObservacoes(teclado.nextLine());
            
            bancoDisciplinas.alterar(disciplina);
        }
    }
    
    // Métodos excluir 
    private void excluir() {
        System.out.println("\n--- Excluir Disciplina ---");
        System.out.print("Informe o código da disciplina a ser excluída: ");
        int id = Integer.parseInt(teclado.nextLine());
        bancoDisciplinas.excluir(id);
    }

    // Método pesquisar
    private void pesquisar() {
        System.out.println("\n--- Pesquisar Disciplina ---");
        System.out.print("Informe o código da disciplina: ");
        int id = Integer.parseInt(teclado.nextLine());
        
        Disciplina localizada = bancoDisciplinas.pesquisar(id);
        if (localizada == null) {
            System.out.println("Disciplina não localizada!");
        } else {
            System.out.println(localizada.toString());
        }
    }
}