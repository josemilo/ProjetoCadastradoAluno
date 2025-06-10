public class AlunoIniciacaoCientifica extends Aluno {
    private String nomeProjeto;

    public AlunoIniciacaoCientifica(String nome, int matricula, int periodo, String nomeProjeto) {
        super(nome, matricula, periodo);
        setNomeProjeto(nomeProjeto);
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        if (nomeProjeto == null || nomeProjeto.trim().isEmpty()) {
            throw new ExcecaoDadoInvalido("Nome do projeto inválido.");
        }
        this.nomeProjeto = nomeProjeto;
    }

    public String toString() {
        return super.toString() + ", Nome do Projeto: " + nomeProjeto;
    }
}


