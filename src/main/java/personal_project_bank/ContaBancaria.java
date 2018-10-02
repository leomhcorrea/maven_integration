package personal_project_bank;
//import personal_project_bank.cartao_de_credito;

public class ContaBancaria {
	public static String nroDeConta;
	public static String agencia;
	private static String cpf;
	private static String telefone;
	private static String cep;
	private static float saldo;
	private static float saldoPoupança;
	private static String nome;
	private static float renda;
	private static float limiteChequeEspecial;
	private static boolean usandoChequeEspecial;
	private static String password;

	public ContaBancaria(String nroDeConta, String agencia, String cpf, String password) {
		super();
		ContaBancaria.password = password;
		ContaBancaria.nome = getNome();
		ContaBancaria.nroDeConta = nroDeConta;
		ContaBancaria.agencia = agencia;
		ContaBancaria.cpf = cpf;
		ContaBancaria.telefone = getNome();
		ContaBancaria.cep = getCep();
		ContaBancaria.saldo = 0f;
		ContaBancaria.saldoPoupança = 0f;
		ContaBancaria.usandoChequeEspecial = false;
	}

	@Override
	public boolean equals(Object obj) {
		if (null == obj) {
			return false;
		}
		ContaBancaria objConta = (ContaBancaria) obj;
		if (ContaBancaria.getNroDeConta().equals(objConta.getNroDeConta())) {
			return true;
		}
		return false;
	}

	public void status() {
		System.out.println("============== DADOS DO CLIENTE ==============");
		System.out.println("Nome: " + getNome());
		System.out.println("CPF : " + getCpf());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("CEP: " + getCep());
		System.out.println("Agência: " + getAgencia());
		System.out.println("Conta: " + getNroDeConta());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Saldo Poupança: " + getSaldoPoupança());
		// System.out.println("Fatura do cartão: "+cartao.getFatura());
	}

	public static float getRenda() {
		return renda;
	}

	public void setRenda(float renda) {
		ContaBancaria.renda = renda;
	}

	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		ContaBancaria.nome = nome;
	}

	public String getNroDeConta() {
		return nroDeConta;
	}

	public void setNroDeConta(String nroDeConta) {
		ContaBancaria.nroDeConta = nroDeConta;
	}

	public static String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		ContaBancaria.agencia = agencia;
	}

	public static String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		ContaBancaria.cpf = cpf;
	}

	public static String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		ContaBancaria.telefone = telefone;
	}

	public static String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		ContaBancaria.cep = cep;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		ContaBancaria.saldo = saldo;
	}

	public static float getSaldoPoupanca() {
		return saldoPoupança;
	}

	public void setSaldoPoupança(float saldoPoupança) {
		ContaBancaria.saldoPoupança = saldoPoupança;
	}

	public float getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(int limiteChequeEspecial) {
		ContaBancaria.limiteChequeEspecial = limiteChequeEspecial;
	}

	public static float getSaldoPoupança() {
		return saldoPoupança;
	}

	public boolean getUsandoChequeEspecial() {
		return usandoChequeEspecial;
	}

	public void setUsandoChequeEspecial(boolean usandoChequeEspecial) {
		ContaBancaria.usandoChequeEspecial = usandoChequeEspecial;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		ContaBancaria.password = password;
	}
}