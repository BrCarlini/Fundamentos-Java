package pessoa;

public class TesteDePessoa {
    
    public static void main(String[] args) {
        
        Professor professor = new Professor();

        professor.setCpf("33344455567");
        professor.setNome("Julia");
        professor.setIdade(33);

        professor.setSalario(50000);

        System.out.println(professor.imprimirDadosDaPessoa());
        System.out.println("=======================================");


        Aluno aluno = new Aluno();
        aluno.setNome("Mariana");
        aluno.setCpf("66677788890");
        aluno.setIdade(18);
        aluno.setMatricula("112233");

        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}
