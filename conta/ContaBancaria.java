package conta;

public class ContaBancaria {
    

    private String numero;
    private String titular;
    private double saldo;


    public ContaBancaria() {
        saldo = 0.0;
    }


    // Getters e Setters

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }



    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }



    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }




    // depositar

    void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito de R$" + valor + "\nSaldo atual de R$" + saldo);
        } else{
            System.out.println("O valor de depósito é inválido.");
        }
    }


    // sacar

    void sacar(double valor){
        if(valor > 0 && saldo > 0){
            saldo = saldo - valor;
            System.out.println("Saque de R$" + valor + "\nSaldo atual R$" + saldo);
        }
    }
}
