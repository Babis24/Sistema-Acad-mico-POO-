import java.util.Scanner;

public class CursoMenu {
    private Scanner teclado = new Scanner(System.in);
    private CursoBanco bancoCursos = new CursoBanco();

    public void exibir() {
        int opcao = 0;
        do {
            System.out.println("\n--- MENU DE CURSOS ---");
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
                // Opção Pesquisar por código
                pesquisar();

            } else if (opcao == 5) {
                // Opção Imprimir todos os cursos
                bancoCursos.imprimirTodos();

            } else if (opcao == 6) { 
                // Opção Ver número de cadastrados
                System.out.println("\nNúmero de cursos cadastrados: " + bancoCursos.getNumeroCursos());

            } else if (opcao == 9) {
                // Opção Voltar ao menu principal
                System.out.println("Voltando...");

            } else {
                // Quando é uma opção inválida
                System.out.println("Opção inválida!");
            }
            
        } while (opcao != 9);
    }

    // Método Adicionar
    private void adicionar() {
        System.out.println("\n--- Adicionar Novo Curso ---");
        Curso curso = new Curso();

        do {
            System.out.print("Código: ");
        } while (!curso.setId(Integer.parseInt(teclado.nextLine())));

        do {
            System.out.print("Nome: ");
        } while (!curso.setNome(teclado.nextLine()));

        System.out.print("Sigla: ");
        curso.setSigla(teclado.nextLine());

        System.out.print("Observações: ");
        curso.setObservacoes(teclado.nextLine());

        bancoCursos.adicionar(curso);
    }

    // Método Alterar
    private void alterar() {
        System.out.println("\n--- Alterar Curso ---");
        System.out.print("Informe o código do curso a ser alterado: ");
        int id = Integer.parseInt(teclado.nextLine());

        Curso curso = bancoCursos.pesquisar(id);

        if (curso == null) {
            System.out.println("Curso não localizado!");
        } else {
            System.out.println("Dados atuais: " + curso);
            do {
                System.out.print("Novo Nome: ");
            } while (!curso.setNome(teclado.nextLine()));
            
            System.out.print("Nova Sigla: ");
            curso.setSigla(teclado.nextLine());

            System.out.print("Novas Observações: ");
            curso.setObservacoes(teclado.nextLine());
            
            bancoCursos.alterar(curso);
        }
    }
    
    // Métodos excluir
    private void excluir() {
        System.out.println("\n--- Excluir Curso ---");
        System.out.print("Informe o código do curso a ser excluído: ");
        int id = Integer.parseInt(teclado.nextLine());
        bancoCursos.excluir(id);
    }

    // Método pesquisar 
    private void pesquisar() {
        System.out.println("\n--- Pesquisar Curso ---");
        System.out.print("Informe o código do curso: ");
        int id = Integer.parseInt(teclado.nextLine());
        
        Curso localizado = bancoCursos.pesquisar(id);
        if (localizado == null) {
            System.out.println("Curso não localizado!");
        } else {
            System.out.println(localizado.toString());
        }
    }
}