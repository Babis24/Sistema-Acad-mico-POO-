public class Disciplina extends Cadastro_AcademicoBase {
    private String sigla;
    private String observacoes;


    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getObservacoes() {
        return this.observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    // --- SOBRESCRITA DO MÉTODO toString ---
    @Override
    public String toString() {
        return "ID: " + this.getId()
          + " - Nome: " + this.getNome()
          + " - Sigla: " + this.getSigla()
          + " - Obs: " + this.getObservacoes();
    }
}