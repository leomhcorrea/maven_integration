package personal_project_bank;

import personal_project_bank.ContaBancaria;
import java.util.List;
import java.util.ArrayList;

public class BancoDeDadosEmMemoria {

	private List<ContaBancaria> contas = new ArrayList<ContaBancaria>();

	public void criaConta(String nroDeConta, String agencia, String cpf, String password) {
		contas.add(new ContaBancaria(nroDeConta, agencia, cpf, password));
	}

	public boolean buscaContaPorCPF(String cpf) {
		for (ContaBancaria contaAtual : contas) {
			if (contaAtual.getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}

	public ContaBancaria buscaContaParaTransferencia(String nroDeConta, String agencia, String cpf) {
		for (ContaBancaria contaParaTransferir : contas) {
			if (contaParaTransferir.getCpf().equals(cpf) && contaParaTransferir.getAgencia().equals(agencia)
					&& contaParaTransferir.getNroDeConta().equals(nroDeConta)) {
				return contaParaTransferir;
			}
		}
		return null;
	}

	public ContaBancaria buscaConta(String nroDeConta, String agencia, String cpf, String password) {
		for (ContaBancaria contaAtual : contas) {
			if (contaAtual.getCpf().equals(cpf) && contaAtual.getAgencia().equals(agencia)
					&& contaAtual.getNroDeConta().equals(nroDeConta) && contaAtual.getPassword().equals(password)) {
				return contaAtual;
			}
		}
		return null;
	}

	public List<ContaBancaria> buscaTodosAsContas() {
		return contas;
	}

	public void deletarPorCpf(String cpf) {
		for (ContaBancaria contaAtual : contas) {
			if (contaAtual.getCpf().equals(cpf)) {
				contas.remove(contaAtual);
			}
		}
	}
}
