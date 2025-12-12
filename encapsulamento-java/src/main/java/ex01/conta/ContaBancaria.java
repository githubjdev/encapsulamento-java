package ex01.conta;

public class ContaBancaria {
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor inválido");
		}
		saldo += valor;
	}

	public void sacar(double valor) {
		if (valor > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente");
		}
		saldo -= valor;
	}
}