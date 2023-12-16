package pessoa;

public class TesteDePessoa {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();

        pessoa.cpf =  "33344455567";
        pessoa.nome =  "Julia";
        pessoa.idade =  33;

        System.out.println(pessoa.imprimirDadosDaPessoa());



        Pessoa pessoa2 = new Pessoa();

        pessoa2.cpf =  "66677788890";
        pessoa2.nome =  "Breno";
        pessoa2.idade =  59;

        System.out.println(pessoa2.imprimirDadosDaPessoa());
    }
}
