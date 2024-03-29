package br.com.vainubank;

public class Cliente {
	public static int count= 1;
	
	private String nome;
	private String cpf;
	private String email;
	
	public Cliente(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		count += 1;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String toString() {
		return "\nNome: " + this.getNome() +
		"\nCPF " + this.getCpf() +
		"\nEmail " + this.getEmail();
	}
	

}
