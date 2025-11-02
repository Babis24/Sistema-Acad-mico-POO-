public class Cadastro_AcademicoBase {
    private int id;
    private String nome;


    public int getId() {
        return this.id;
    }

    /**
     * Define o código.
     * @param id O valor para o código.
     * @return true se o código for válido (> 0), false caso contrário.
     */
    public boolean setId(int id) {
        if (id <= 0) {
            System.out.println("Erro: O código deve ser um número positivo e maior que zero!");
            return false;
        } else {
            this.id = id;
            return true;
        }
    }

    public String getNome() {
        return this.nome;
    }

    /**
     * Define o nome.
     * @param nome O valor para o nome.
     * @return true se o nome for válido, false caso contrário.
     */
    public boolean setNome(String nome) {
        if (nome == null || nome.trim().length() < 3) {
            System.out.println("Erro: O nome não pode ser nulo, vazio ou conter menos que 3 caracteres!");
            return false;
        } else {
            this.nome = nome;
            return true;
        }
    }
}