public class AlunoMonitoria extends Aluno {
    private String disciplina;

    public AlunoMonitoria(String nome, int matricula, int periodo, String disciplina) {
        super(nome, matricula, periodo);
        setDisciplina(disciplina);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (disciplina == null || disciplina.trim().isEmpty()) {
            throw new ExcecaoDadoInvalido("Disciplina inválida.");
        }
        this.disciplina = disciplina;
    }

    public String toString() {
        return super.toString() + ", Disciplina: " + disciplina;
    }
}


