
public class Main {

	public static void main(String[] args) {
		Cliente valdineia = new Cliente();
		valdineia.setNome("Valdineia");
		
		Conta cc = new ContaCorrente(valdineia);
		Conta poupanca = new ContaPoupanca(valdineia);

		cc.depositar(500);
		cc.transferir(500, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
