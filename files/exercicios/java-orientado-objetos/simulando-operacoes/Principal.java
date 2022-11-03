package github.repositorio.estudo.java;

/* Criar a classe Conta e simular operações de saque, depósito e transferência entre contas */

public class Principal {

	public static void main(String[] args) {

		Conta c1 = new Conta(1234, "Ana Luisa Bastos", 3000, 1000);
		Conta c2 = new Conta(2345, "André Lara", 5000, 2000);
		c1.imprimirInformacoes();
		c2.imprimirInformacoes();
		
		// Sacar R$ 500,00 da conta da Ana
		double saque = 500.00;
		if(!c1.sacar(saque)) {
			System.out.println("Saque não pôde ser efetuado.");
		}
		else {
			System.out.printf("Realizado saque de R$ %.2f\n", saque);
		}
		c1.imprimirSaldo();
		
		// Depositar R$ 2000,00 na conta da Ana
		double deposito = 2000.00; 
		if(!c1.depositar(deposito)) {
			System.out.println("O depósito não pode ser realizado.");
		}
		else {
			System.out.printf("Realizado depósito de R$ %.2f\n", deposito);
		}			
		c1.imprimirSaldo();
				
		// Transferir R$ 1500,00 da conta da Ana para conta do André
		double transf = 500.00;
		if(!c1.transferir(c2, transf)) {
			System.out.println("Transferência não pode ser realizada");
		}
		else {
			System.out.printf("Transferência de R$ %.2f efetuada com sucesso\n", transf);
		}
						
		c1.imprimirSaldo();
		c2.imprimirSaldo();
	}
}

/* Retorna:

- Informações de correntista -
Nome: Ana Luisa Bastos
Número da conta: 1234
Saldo atual: R$ 3000,00
Limite: R$ 1000,00
 
- Informações de correntista -
Nome: André Lara
Número da conta: 2345
Saldo atual: R$ 5000,00
Limite: R$ 2000,00
 
Realizado saque de R$ 500,00
Titular da conta: Ana Luisa Bastos
Saldo atualizado: R$ 2500,00
 
Realizado depósito de R$ 2000,00
Titular da conta: Ana Luisa Bastos
Saldo atualizado: R$ 4500,00
 
Transferência de R$ 500,00 efetuada com sucesso
Titular da conta: Ana Luisa Bastos
Saldo atualizado: R$ 4000,00
 
Titular da conta: André Lara
Saldo atualizado: R$ 5500,00
*/