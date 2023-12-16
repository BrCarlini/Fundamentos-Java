package pessoa;

public class Pessoa {

    // nome, idade, cpf
    // tipo, noeDaVariavel

    String nome;
    int idade;
    String cpf;

    String imprimirDadosDaPessoa(){

        return "Nome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf;
    }
}
