public class Main{

	public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente venilton = new Cliente();
		banco.addConta(venilton);
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);

		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Cliente matheus = new Cliente();
		matheus.setNome("Matheus");
		banco.addConta(matheus);
		Conta mc = new ContaCorrente(matheus);
		Conta pc = new ContaPoupanca(matheus);

		mc.depositar(100000);
		mc.transferir(5000, pc);

		mc.imprimirExtrato();
		pc.imprimirExtrato();

		System.out.println(banco.getContas());
	}

}
