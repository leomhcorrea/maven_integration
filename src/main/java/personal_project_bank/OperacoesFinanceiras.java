package personal_project_bank;

import personal_project_bank.ContaBancaria;

public class OperacoesFinanceiras {

	public static void depositar(ContaBancaria conta, float valor) {
		float saldo = Utilitarios.contaAuxiliar.getSaldo();
		conta.setSaldo(saldo + valor);
		// setLog seria uma boa para criar um extrato
	}

	public static void sacar(ContaBancaria conta, float valor) {
		float saldo = Utilitarios.contaAuxiliar.getSaldo();
		conta.setSaldo(saldo - valor);
		boolean i;
		if (valor > 0) {
			i = true;
		} else
			i = false;
		if (i == true && Utilitarios.contaAuxiliar.getSaldo() == 0) {
			conta.setUsandoChequeEspecial(true);
			float limiteChequeEspecial = conta.getLimiteChequeEspecial();
			conta.setSaldo(limiteChequeEspecial);
		}
	}

	public static void guardarNaPoupança(ContaBancaria conta, float valor) {
		float saldo = conta.getSaldoPoupanca();
		conta.setSaldoPoupança(saldo + valor);
	}

	public static void sacarPoupanca(ContaBancaria conta, float valor) {
		float saldoPP = conta.getSaldoPoupanca();
		float saldoCC = Utilitarios.contaAuxiliar.getSaldo();
		conta.setSaldoPoupança(saldoPP - valor);
		conta.setSaldo(saldoCC + valor);
	}

	public static void transferir(ContaBancaria conta, String nroDeConta, String agencia, String cpf, float valor) {
		ContaBancaria contaParaTransferir = Utilitarios.banco.buscaContaParaTransferencia(nroDeConta, agencia, cpf);
		if (contaParaTransferir != null) {
			depositar(contaParaTransferir, valor);
			sacar(conta, valor);
		}
	}
}
