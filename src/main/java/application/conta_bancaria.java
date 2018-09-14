package application;

public class conta_bancaria {
	int nroDeConta;
	int agencia;
	int cpf;
	int telefone;
	int cep;
	float saldo;
	float saldoPoupança;
	String nome;
	boolean usoDeChequeEspecial;
	float renda;
	int limiteChequeEspecial;
	
	public conta_bancaria(float renda, String nome, int nroDeConta, int agencia, int cpf, int telefone, int cep) {
		super();
		this.nome = nome;
		this.nroDeConta = nroDeConta;
		this.agencia = agencia;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cep = cep;
		this.saldo = 0f;
		this.saldoPoupança = 0f;
	}
	
	public void status() {
		System.out.println("============== DADOS DO CLIENTE ==============");
		System.out.println("Nome: "+this.nome);
		System.out.println("CPF : "+this.cpf);
		System.out.println("Telefone: "+this.telefone);
		System.out.println("CEP: "+this.cep);
		System.out.println("Agência: "+this.agencia);
		System.out.println("Conta: "+this.nroDeConta);
		System.out.println("Saldo: "+this.saldo);
		System.out.println("Saldo Poupança: "+this.saldoPoupança);
	}
	
	public float getRenda() {
		return renda;
	}
	public void setRenda(float renda) {
		this.renda = renda;
	}	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNroDeConta() {
		return nroDeConta;
	}
	public void setNroDeConta(int nroDeConta) {
		this.nroDeConta = nroDeConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}	
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getSaldoPoupanca() {
		return saldoPoupança;
	}
	public void setSaldoPoupança(float saldoPoupança) {
		this.saldoPoupança = saldoPoupança;
	}
}
