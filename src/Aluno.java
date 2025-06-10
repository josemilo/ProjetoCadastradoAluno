public class Aluno {
    private String nome;
    private int matricula;
    private int periodo;

    public Aluno(String nome, int matricula, int periodo) {
        setNome(nome);
        setMatricula(matricula);
        setPeriodo(periodo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new ExcecaoDadoInvalido("Nome inválido.");
        }
        this.nome =nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula < 0) {
            throw new ExcecaoDadoInvalido("Matrícula não pode ser negativa.");
        }
        this.matricula = matricula;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        if (periodo < 0) {
            throw new ExcecaoDadoInvalido("Período não pode ser negativo.");
        }
        this.periodo = periodo;
    }

    public String toString() {
        return "Nome: " + nome + ", Matrícula: " + matricula + ", Período: " + periodo;
    }
}
