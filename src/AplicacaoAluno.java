import java.util.Scanner;

public class AplicacaoAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = null;
        try {
            System.out.println("Escolha o tipo de aluno:");
            System.out.println("1 - Aluno");
            System.out.println("2 - Aluno Projeto");
            System.out.println("3 - Aluno Monitoria");
            System.out.println("4 - Aluno Iniciação Científica");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();

            System.out.print("Período: ");
            int periodo = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    aluno = new Aluno(nome, matricula, periodo);
                    break;
                case 2:
                    System.out.print("Área: ");
                    String area = scanner.nextLine();

                    System.out.print("Valor: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    aluno = new ProjetoAluno(nome, matricula, periodo, area, valor);
                    break;
                case 3:
                    System.out.print("Disciplina: ");
                    String disciplina = scanner.nextLine();

                    aluno = new AlunoMonitoria(nome, matricula, periodo, disciplina);
                    break;
                case 4:
                    System.out.print("Nome do Projeto: ");
                    String nomeProjeto = scanner.nextLine();

                    aluno = new AlunoIniciacaoCientifica(nome, matricula, periodo, nomeProjeto);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    return;
            }


            System.out.println("\nAluno criado:");
            System.out.println(aluno);

        } catch (ExcecaoDadoInvalido e) {

            System.out.println("Erro: " + e.getMessage());
        } finally {

            scanner.close();
        }

    }
}


