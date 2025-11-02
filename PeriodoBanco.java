import java.util.ArrayList;
import java.util.List;

public class PeriodoBanco {
    private List<Periodo> lista = new ArrayList<>();
    private int numeroPeriodos = 0;

    public void adicionar(Periodo periodo) {
        if (pesquisar(periodo.getId()) == null) {
            lista.add(periodo);
            numeroPeriodos++;
            System.out.println("Período adicionado com sucesso!");
        } else {
            System.out.println("Erro: Já existe um período com o código informado!");
        }
    }

    public void alterar(Periodo periodo) {
        Periodo itemEncontrado = pesquisar(periodo.getId());
        if (itemEncontrado != null) {
            itemEncontrado.setNome(periodo.getNome());
            itemEncontrado.setSigla(periodo.getSigla());
            System.out.println("Período alterado com sucesso!");
        } else {
            System.out.println("Período não localizado para alteração!");
        }
    }

    public void excluir(int id) {
        Periodo itemEncontrado = pesquisar(id);
        if (itemEncontrado != null) {
            lista.remove(itemEncontrado);
            numeroPeriodos--;
            System.out.println("Período removido com sucesso!");
        } else {
            System.out.println("Período não localizado para exclusão!");
        }
    }

    public Periodo pesquisar(int id) {
        for (Periodo item : lista) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void imprimirTodos() {
        if (getNumeroPeriodos() == 0) {
            System.out.println("Nenhum período cadastrado!");
        } else {
            System.out.println("--- Lista de Períodos ---");
            for (Periodo item : lista) {
                System.out.println(item.toString());
            }
        }
    }

    public int getNumeroPeriodos() {
        return this.numeroPeriodos;
    }
}