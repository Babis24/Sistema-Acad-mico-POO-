import java.util.ArrayList;
import java.util.List;

public class CursoBanco {
    private List<Curso> lista = new ArrayList<>();
    private int numeroCursos = 0;

    public void adicionar(Curso curso) {
        if (pesquisar(curso.getId()) == null) {
            lista.add(curso);
            numeroCursos++;
            System.out.println("Curso adicionado com sucesso!");
        } else {
            System.out.println("Erro: Já existe um curso com o código informado!");
        }
    }

    public void alterar(Curso curso) {
        Curso itemEncontrado = pesquisar(curso.getId());
        if (itemEncontrado != null) {
            itemEncontrado.setNome(curso.getNome());
            itemEncontrado.setSigla(curso.getSigla());
            itemEncontrado.setObservacoes(curso.getObservacoes());
            System.out.println("Curso alterado com sucesso!");
        } else {
            System.out.println("Curso não localizado para alteração!");
        }
    }

    public void excluir(int id) {
        Curso itemEncontrado = pesquisar(id);
        if (itemEncontrado != null) {
            lista.remove(itemEncontrado);
            numeroCursos--;
            System.out.println("Curso removido com sucesso!");
        } else {
            System.out.println("Curso não localizado para exclusão!");
        }
    }

    public Curso pesquisar(int id) {
        for (Curso item : lista) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void imprimirTodos() {
        if (getNumeroCursos() == 0) {
            System.out.println("Nenhum curso cadastrado!");
        } else {
            System.out.println("--- Lista de Cursos ---");
            for (Curso item : lista) {
                System.out.println(item.toString());
            }
        }
    }

    public int getNumeroCursos() {
        return this.numeroCursos;
    }
}