package ex01.conta;

public class MainConta {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		conta.depositar(500);
		conta.sacar(200);
		System.out.println(conta.getSaldo());
	}
}