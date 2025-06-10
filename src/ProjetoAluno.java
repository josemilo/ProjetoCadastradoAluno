public class ProjetoAluno extends Aluno {
    private String area;
    private double valor;

    public ProjetoAluno(String nome, int matricula, int periodo, String area, double valor) {
        super(nome, matricula, periodo);
        setArea(area);
        setValor(valor);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        if (area == null || area.trim().isEmpty()) {
            throw new ExcecaoDadoInvalido("Área inválida.");
        }
        this.area = area;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0) {
            throw new ExcecaoDadoInvalido("Valor não pode ser negativo.");
        }
        this.valor = valor;
    }

    public String toString() {
        return super.toString() + ", Área: " + area + ", Valor: " + valor;
    }
}
