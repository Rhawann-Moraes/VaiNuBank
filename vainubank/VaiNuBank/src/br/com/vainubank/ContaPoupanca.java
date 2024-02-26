package br.com.vainubank;

public class ContaPoupanca extends Conta {
    private double aniversario;

    public ContaPoupanca(Cliente cliente, double aniversario) {
        super(cliente);
        this.setAniversario(aniversario);
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            double juros = valor * 0.02;
            setSaldo(getSaldo() - valor - juros);
            System.out.println("Seu saque foi realizado com sucesso!");
        } else {
            System.err.println("Não foi possível realizar a operação!");
        }
    }

	public double getAniversario() {
		return aniversario;
	}

	public void setAniversario(double aniversario) {
		this.aniversario = aniversario;
	}
}
