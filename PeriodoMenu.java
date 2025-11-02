import java.util.Scanner;

public class PeriodoMenu {
    private Scanner teclado = new Scanner(System.in);
    private PeriodoBanco bancoPeriodos = new PeriodoBanco();

    public void exibir() {
        int opcao = 0;

        do {
            System.out.println("\n--- MENU DE PERÍODOS ---");
            System.out.println("1. Adicionar");
            System.out.println("2. Alterar");
            System.out.println("3. Excluir");
            System.out.println("4. Pesquisar por código");
            System.out.println("5. Imprimir todos");
            System.out.println("6. Ver número de cadastrados"); 
            System.out.println("9. Voltar ao menu principal");
            System.out.print("Digite a opção: ");
            opcao = Integer.parseInt(teclado.nextLine());

            // Menu de Períodos

            if (opcao == 1) {
                // Opção de Adicionar 
                adicionar();
                
            } else if (opcao == 2) {
                // Opção de Alterar
                alterar();

            } else if (opcao == 3) {
                // Opção de Excluir
                excluir();

            } else if (opcao == 4) {
                // Opção de Pesquisar por Código
                pesquisar();
                
            } else if (opcao == 5) {
                // Opção de Imprimir Todos
                bancoPeriodos.imprimirTodos();
                
            } else if (opcao == 6) { 
                // Opção de Ver Número de Cadastrados
                System.out.println("\nNúmero de períodos cadastrados: " + bancoPeriodos.getNumeroPeriodos());

            } else if (opcao == 9) {
                // Opção de Voltar ao Menu Principal
                System.out.println("Voltando...");

            } else {
                // Quando é uma opção inválida
                System.out.println("Opção inválida!");
            }

        } while (opcao != 9);
    }
 
    // Método adicionar()
    private void adicionar() {
        System.out.println("\n--- Adicionar Novo Período ---");
        Periodo periodo = new Periodo();

        // Loop de validação para o CÓDIGO
        do {
            System.out.print("Código: ");
        } while (!periodo.setId(Integer.parseInt(teclado.nextLine())));

        // Loop de validação para o NOME
        do {
            System.out.print("Nome: ");
        } while (!periodo.setNome(teclado.nextLine()));

        System.out.print("Sigla: ");
        periodo.setSigla(teclado.nextLine());

        bancoPeriodos.adicionar(periodo);
    }

    // Método alterar()
    private void alterar() {
        System.out.println("\n--- Alterar Período ---");
        System.out.print("Informe o código do período a ser alterado: ");
        int id = Integer.parseInt(teclado.nextLine());

        Periodo periodo = bancoPeriodos.pesquisar(id);

        if (periodo == null) {
            System.out.println("Período não localizado!");
        } else {
            System.out.println("Dados atuais: " + periodo);
            // Loop de validação para o NOME na alteração
            do {
                System.out.print("Novo Nome: ");
            } while (!periodo.setNome(teclado.nextLine()));
            
            System.out.print("Nova Sigla: ");
            periodo.setSigla(teclado.nextLine());
            
            bancoPeriodos.alterar(periodo);
        }
    }

    // Métodos excluir()
    private void excluir() {
        System.out.println("\n--- Excluir Período ---");
        System.out.print("Informe o código do período a ser excluído: ");
        int id = Integer.parseInt(teclado.nextLine());
        bancoPeriodos.excluir(id);
    }

    // Métodos pesquisar()
    private void pesquisar() {
        System.out.println("\n--- Pesquisar Período ---");
        System.out.print("Informe o código do período: ");
        int id = Integer.parseInt(teclado.nextLine());
        
        Periodo localizado = bancoPeriodos.pesquisar(id);
        if (localizado == null) {
            System.out.println("Período não localizado!");
        } else {
            System.out.println(localizado.toString());
        }
    }
}   