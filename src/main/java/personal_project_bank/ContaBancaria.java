package personal_project_bank;
//import personal_project_bank.cartao_de_credito;

public class ContaBancaria {
	public String nroDeConta;
	public String agencia;
	private String cpf;
	private float saldo;
	private float saldoPoupan�a;
	private float limiteChequeEspecial;
	private boolean usandoChequeEspecial;
	private String password;

	public ContaBancaria(String nroDeConta, String agencia, String cpf, String password) {
		super();
		this.password = password;
		this.nroDeConta = nroDeConta;
		this.agencia = agencia;
		this.cpf = cpf;
		this.saldo = 0f;
		this.saldoPoupan�a = 0f;
		this.usandoChequeEspecial = false;
	}

	@Override
	public boolean equals(Object obj) {
		if (null == obj) {
			return false;
		}
		ContaBancaria objConta = (ContaBancaria) obj;
		if (objConta.getNroDeConta().equals(Utilitarios.contaAuxiliar.getNroDeConta())
				&& objConta.getAgencia().equals(Utilitarios.contaAuxiliar.getAgencia())
				&& objConta.getCpf().equals(Utilitarios.contaAuxiliar.getCpf())
				&& objConta.getPassword().equals(Utilitarios.contaAuxiliar.getPassword())) {
			return true;
		}
		return false;
	}

	public void status() {
		System.out.println("============== DADOS DO CLIENTE ==============");
		System.out.println("$ CPF : " + getCpf());
		System.out.println("$ Ag�ncia: " + getAgencia());
		System.out.println("$ Conta: " + getNroDeConta());
		System.out.println("$ Saldo: " + getSaldo());
		System.out.println("$ Saldo Poupan�a: " + getSaldoPoupan�a());
		// System.out.println("Fatura do cart�o: "+cartao.getFatura());
	}

	public String getNroDeConta() {
		return nroDeConta;
	}

	public void setNroDeConta(String nroDeConta) {
		this.nroDeConta = nroDeConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getSaldoPoupanca() {
		return saldoPoupan�a;
	}

	public void setSaldoPoupan�a(float saldoPoupan�a) {
		this.saldoPoupan�a = saldoPoupan�a;
	}

	public float getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(int limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	public float getSaldoPoupan�a() {
		return saldoPoupan�a;
	}

	public boolean getUsandoChequeEspecial() {
		return usandoChequeEspecial;
	}

	public void setUsandoChequeEspecial(boolean usandoChequeEspecial) {
		this.usandoChequeEspecial = usandoChequeEspecial;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
