import models.*;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Cartao cartao = new Cartao("1234-5678-9101-1121", "Venilton", "12/25", "123", cc);
		cartao.realizarPagamento(50);
		cc.imprimirExtrato();

		Transacao transacao = new Transacao(LocalDateTime.now(), "Pagamento de Serviço", 50, cc);
		transacao.imprimirDetalhes();
	}

}
