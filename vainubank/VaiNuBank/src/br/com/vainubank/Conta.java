package br.com.vainubank;

import br.com.utilitarios.Util;

public class Conta {
	public static int contadorDeContas;
	private String agencia;
	private Cliente cliente;
	private int numeroConta;
	private double saldo = 0.0;
	public Conta(Cliente cliente) {
		this.agencia = "0001";
		this.cliente = cliente;
		this.numeroConta = contadorDeContas;
		contadorDeContas += 1;
	}
	public static int getContadorDeContas() {
		return contadorDeContas;
	}
	public static void setContadorDeContas(int contadorDeContas) {
		Conta.contadorDeContas = contadorDeContas;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String toString() {
		return "\nNúmero da conta " + this.getNumeroConta() +
				"\nNome: " + this.cliente.getNome() +
				"\ncpf: " + this.cliente.getCpf() +
				"\nEmail: " + this.cliente.getEmail() +
				"\nSaldo: " + Util.doubleToString(this.getSaldo());
	}
	public void depositar(double valor) {
		if(valor > 0) {
			setSaldo(getSaldo()+ valor);
			System.out.println("Seu deposito foi realizado com sucesso!");
		}else {
			System.err.println("Não foi possível realizar a operação!");
		}
	}
	public void sacar(double valor) {
		if(valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			System.out.println("Seu saque foi realizado com sucesso!");
		}
		else {
			System.err.println("Não foi possível realizar a operação!");
		}
	}
	public void transferir(Conta contaParaDeposito, double valor) {
		if(valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			contaParaDeposito.setSaldo(contaParaDeposito.getSaldo() + valor);
			System.out.println("Transferência realizado com sucesso!");
		}
		else {
			System.err.println("Não foi possível realizar a operação!");
		}
	}
	
}
