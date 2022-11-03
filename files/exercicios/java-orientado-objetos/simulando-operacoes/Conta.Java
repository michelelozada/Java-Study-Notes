package github.repositorio.estudo.java;

public class Conta {
	int numero;
	String titular;
	double saldo;
	double limite;
	
	// Método construtor	
	public Conta(int numero, String titular, double saldo, double limite) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}

	// Método para sacar valores
	boolean sacar(double valor) {
		if(valor > limite || valor > saldo || valor <= 0) {
			return false;
		} else {
			saldo -= valor;
			return true;
		}	
	}
	
	// Método para depositar valores
	boolean depositar(double valor) {
		if(valor <= 0) {
			return false;
		}
		saldo += valor;
		return true;
	}
	
	// Método para transferir valores
	boolean transferir(Conta destino, double valor) {
		if(valor > limite || valor > saldo || valor <= 0) {
			return false;
		}
		this.saldo -= valor;
	    destino.saldo += valor;
		return true;
	}
	
	// Impressão dos dados das contas
	void imprimirInformacoes() {
		System.out.println("- Informações de correntista -");
		System.out.println("Nome: " + titular);
		System.out.println("Número da conta: " + numero);
		System.out.printf("Saldo atual: R$ %.2f\n", saldo);
		System.out.printf("Limite: R$ %.2f\n", limite);
		System.out.println(" ");
	}
	
	// Impressão dados atualizados após as operações
	void imprimirSaldo() {
		System.out.println("Titular da conta: " + titular);
		System.out.printf("Saldo atualizado: R$ %.2f\n", saldo);
		System.out.println(" ");
	}
}
