public class AlunoEAD extends Aluno{

    public AlunoEAD(String nome, int matricula, String curso) {
        super(nome,matricula,curso);
    }

    @Override
    public void matricular() {
        System.out.println("Aluno Matriculado!");
    }

}
