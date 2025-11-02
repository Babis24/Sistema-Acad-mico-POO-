public class Periodo extends Cadastro_AcademicoBase {
    private String sigla;

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    // --- SOBRESCRITA DO MÉTODO toString ---
    @Override
    public String toString() {
        return "ID: " + this.getId()
          + " - Nome: " + this.getNome()
          + " - Sigla: " + this.getSigla();
    }
}