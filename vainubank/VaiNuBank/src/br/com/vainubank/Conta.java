package br.com.vainubank;

import br.com.utilitarios.Util;

public class Conta {
	public static int contadorDeContas;
	private int agencia;
	private Cliente cliente;
	private int numeroConta;
	private double saldo = 0.0;
	public Conta(Cliente cliente) {
		this.agencia = 0001-1;
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
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
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
	
	
	
	
}
