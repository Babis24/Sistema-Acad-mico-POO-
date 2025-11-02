import java.util.ArrayList;
import java.util.List;

public class DisciplinaBanco {
    private List<Disciplina> lista = new ArrayList<>();
    private int numeroDisciplinas = 0;

    public void adicionar(Disciplina disciplina) {
        if (pesquisar(disciplina.getId()) == null) {
            lista.add(disciplina);
            numeroDisciplinas++;
            System.out.println("Disciplina adicionada com sucesso!");
        } else {
            System.out.println("Erro: Já existe uma disciplina com o código informado!");
        }
    }

    public void alterar(Disciplina disciplina) {
        Disciplina itemEncontrado = pesquisar(disciplina.getId());
        if (itemEncontrado != null) {
            itemEncontrado.setNome(disciplina.getNome());
            itemEncontrado.setSigla(disciplina.getSigla());
            itemEncontrado.setObservacoes(disciplina.getObservacoes());
            System.out.println("Disciplina alterada com sucesso!");
        } else {
            System.out.println("Disciplina não localizada para alteração!");
        }
    }

    public void excluir(int id) {
        Disciplina itemEncontrado = pesquisar(id);
        if (itemEncontrado != null) {
            lista.remove(itemEncontrado);
            numeroDisciplinas--;
            System.out.println("Disciplina removida com sucesso!");
        } else {
            System.out.println("Disciplina não localizada para exclusão!");
        }
    }

    public Disciplina pesquisar(int id) {
        for (Disciplina item : lista) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void imprimirTodos() {
        if (getNumeroDisciplinas() == 0) {
            System.out.println("Nenhuma disciplina cadastrada!");
        } else {
            System.out.println("--- Lista de Disciplinas ---");
            for (Disciplina item : lista) {
                System.out.println(item.toString());
            }
        }
    }

    public int getNumeroDisciplinas() {
        return this.numeroDisciplinas;
    }
}