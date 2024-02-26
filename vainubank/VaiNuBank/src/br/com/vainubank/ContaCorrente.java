package br.com.vainubank;

public class ContaCorrente extends Conta {
 private double limiteCredito;

 public ContaCorrente(Cliente cliente, double limiteCredito) {
     super(cliente);
     this.limiteCredito = limiteCredito;
 }

 @Override
 public void sacar(double valor) {
     if (getSaldo() + limiteCredito >= valor) {
         setSaldo(getSaldo() - valor);
         System.out.println("Seu saque foi realizado com sucesso!");
     } else {
         System.err.println("Não foi possível realizar a operação!");
     }
 }
}
