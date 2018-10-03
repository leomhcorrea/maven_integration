package personal_project_bank;

import personal_project_bank.ContaBancaria;
import personal_project_bank.OperacoesFinanceiras;
import personal_project_bank.BancoDeDadosEmMemoria;

import java.util.Scanner;

public class Utilitarios {
	public static BancoDeDadosEmMemoria banco = new BancoDeDadosEmMemoria();
	public static ContaBancaria contaAuxiliar = new ContaBancaria(null, null, null, null);

	public static void novaConta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("############# NOVA CONTA BANCÁRIA #############");
		System.out.println("$ Insira os dados do cliente ");
		System.out.println("$ CPF: ");
		String cpf = sc.nextLine();
		System.out.println("$ Senha: ");
		String password = sc.nextLine();
		System.out.println("$ Número de conta: ");
		String nroDeConta = sc.nextLine();
		System.out.println("$ Agência: ");
		String agencia = sc.nextLine();
		boolean validador = banco.buscaContaPorCPF(cpf);

		if (validador == true) {
			System.out.println("$ Erro, conta já existente");
			Menu();
		} else {
			banco.criaConta(nroDeConta, agencia, cpf, password);
			logger();
		}
		sc.close();
	}

	public static void Menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("############# MENU #############");
		System.out.println("$ Para criar uma nova conta digite 1");
		System.out.println("$ Se já possui conta, digite 2");
		int entrada = sc.nextInt();
		if (entrada == 1) {
			novaConta();
		}
		if (entrada == 2) {
			logger();
		}
		sc.close();
	}

	public static void logger() {
		Scanner sd = new Scanner(System.in);
		System.out.println("############# LOG-IN #############");
		System.out.println("$ Digite o número de sua conta: ");
		String nroContaSelecionada = sd.nextLine();
		System.out.println("$ Digite a agência de sua conta: ");
		String agenciaContaSelecionada = sd.nextLine();
		System.out.println("$ Digite seu CPF: ");
		String cpfContaSelecionada = sd.nextLine();
		System.out.println("$ Digite sua senha: ");
		String passwordContaSelecionada = sd.nextLine();
		contaAuxiliar = banco.buscaConta(nroContaSelecionada, agenciaContaSelecionada, cpfContaSelecionada,
				passwordContaSelecionada);

		if (contaAuxiliar != null) {
			operacoes();
		} else {
			System.out.println("$ Erro, conta não encontrada..");
			logger();
		}
		sd.close();
	}

	public static void operacoes() {
		Scanner so = new Scanner(System.in);
		System.out.println("############# OPERAÇÕES #############");
		System.out.println("$ Para depositar digite 1");
		System.out.println("$ Para sacar digite 2");
		System.out.println("$ Para depositar na poupança digite 3");
		System.out.println("$ Para sacar da poupança digite 4");
		System.out.println("$ Para mostrar o status digite 5");
		System.out.println("$ Para transferir para outra conta digite 6");
		System.out.println("$ Para retornar para o Menu digite 7");
		int entrada = so.nextInt();
		if (entrada == 1) {
			System.out.println("$ Digite o valor a ser depositado: ");
			float valor = so.nextFloat();
			OperacoesFinanceiras.depositar(contaAuxiliar, valor);
		}
		if (entrada == 2) {
			System.out.println("$ Digite o valor que deseja sacar: ");
			float valor = so.nextFloat();
			OperacoesFinanceiras.sacar(contaAuxiliar, valor);
		}
		if (entrada == 3) {
			System.out.println("$ Digite o valor a ser depositado: ");
			float valor = so.nextFloat();
			OperacoesFinanceiras.guardarNaPoupança(contaAuxiliar, valor);
		}
		if (entrada == 4) {
			System.out.println("$ Digite o valor que deseja sacar: ");
			float valor = so.nextFloat();
			OperacoesFinanceiras.sacarPoupanca(contaAuxiliar, valor);
		}
		if (entrada == 5) {
			contaAuxiliar.status();
		}
		if (entrada == 6) {
			System.out.println("$ Digite os dados da conta para qual deseja transferir");
			System.out.println("$ O valor que deseja transferir: ");
			float valor = so.nextFloat();
			System.out.println("$ Número da conta: ");
			String nroDeConta = so.nextLine();
			System.out.println("$ Número da agência: ");
			String agencia = so.nextLine();
			System.out.println("$ CPF: ");
			String cpf = so.nextLine();
			OperacoesFinanceiras.transferir(contaAuxiliar, nroDeConta, agencia, cpf, valor);
		}
		if (entrada == 7) {
			Menu();
		}
		operacoes();
		so.close();
	}
}
