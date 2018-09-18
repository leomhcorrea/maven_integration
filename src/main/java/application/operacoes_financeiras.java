package application;
import application.conta_bancaria;

	
public class operacoes_financeiras {

	private conta_bancaria conta;
	
	public operacoes_financeiras(conta_bancaria conta) {
		this.setConta(conta);
	}
	public void depositar(conta_bancaria conta, float valor) {
		
		float saldo = conta.getSaldo(); 
		conta.setSaldo(saldo + valor);
	}
	
	public void sacar(conta_bancaria conta, float valor) {
		float saldo = conta.getSaldo();
		conta.setSaldo(saldo - valor);
		boolean i;
		if(valor > 0) {
			i = true;
		}
		else 
			i = false;
		
		if(i == true && conta.getSaldo() == 0) {
			conta.setUsandoChequeEspecial(true);
			float limiteChequeEspecial = conta.getLimiteChequeEspecial();
			conta.setSaldo(limiteChequeEspecial);
		}
	}
	
	public float transferir() {
	//TODO	
		return 0;
	}
	
	public float guardarNaPoupança() {
	//TODO
		return 0;
	}
	
	public conta_bancaria getConta() {
		return conta;
	}
	public void setConta(conta_bancaria conta) {
		this.conta = conta;
	}
	
}



