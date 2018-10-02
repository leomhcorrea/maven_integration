package personal_project_bank;

import personal_project_bank.ContaBancaria;
import personal_project_bank.OperacoesFinanceiras;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Utilitarios {
	public static Set<ContaBancaria> contas = new HashSet<ContaBancaria>();
	public static ContaBancaria contaSelecionada;
	public static boolean validator = false;

	public static void novaConta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("############# NOVA CONTA BANCÁRIA #############");
		System.out.println("$ Insira os dados do cliente: ");
		System.out.println("$ Nome completo: ");
		String nome = sc.nextLine();
		System.out.println("$ CPF: ");
		String cpf = sc.nextLine();
		System.out.println("$ Senha: ");
		String password = sc.nextLine();
		System.out.println("$ Telefone: ");
		String tel = sc.nextLine();
		System.out.println("$ CEP: ");
		String cep = sc.nextLine();
		System.out.println("$ Número de conta: ");
		String nroDeConta = sc.nextLine();
		System.out.println("$ Agência: ");
		String agencia = sc.nextLine();
		System.out.println("$ Renda: ");
		float renda = sc.nextFloat();
		System.out.println("###############################################");

		ContaBancaria conta = new ContaBancaria(nroDeConta, agencia, cpf, password);
		conta.setCep(cep);
		conta.setNome(nome);
		conta.setRenda(renda);
		conta.setTelefone(tel);
		contas.add(conta);
		logger();
		sc.close();
	}

	public static void Menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("############# MENU #############");
		System.out.println("Para criar uma nova conta digite 1");
		System.out.println("Se já possui conta, digite 2");
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
		System.out.println("Digite o número de sua conta: ");
		String nroContaSelecionada = sd.nextLine();
		System.out.println("Digite a agência de sua conta: ");
		String agenciaContaSelecionada = sd.nextLine();
		System.out.println("Digite seu CPF: ");
		String cpfContaSelecionada = sd.nextLine();
		System.out.println("Digite sua senha: ");
		String passwordContaSelecionada = sd.nextLine();
		ContaBancaria contaSendoBuscada = new ContaBancaria(nroContaSelecionada, agenciaContaSelecionada,
				cpfContaSelecionada, passwordContaSelecionada);
		for (ContaBancaria c : contas) {
			if (c.equals(contaSendoBuscada)) {
				contaSelecionada = c;
				validator = true;
				operacoes();
			} else {
				System.out.println("Erro, conta não encontrada..");
			}
		}
		System.out.println("###############################");
		sd.close();
	}

	public static void operacoes() {
		Scanner so = new Scanner(System.in);
		if (validator == true) {
			System.out.println("############# OPERAÇÕES #############");
			System.out.println("Para depositar digite 1");
			System.out.println("Para sacar digite 2");
			System.out.println("Para depositar na poupança digite 3");
			System.out.println("Para sacar da poupança digite 4");
			System.out.println("Para mostrar o status digite 5");
			int entrada = so.nextInt();
			if (entrada == 1) {
				System.out.println("Digite o valor a ser depositado: ");
				float valor = so.nextFloat();
				OperacoesFinanceiras.depositar(contaSelecionada, valor);
			}
			if (entrada == 2) {
				System.out.println("Digite o valor que deseja sacar: ");
				float valor = so.nextFloat();
				OperacoesFinanceiras.sacar(contaSelecionada, valor);
			}
			if (entrada == 3) {
				System.out.println("Digite o valor a ser depositado: ");
				float valor = so.nextFloat();
				OperacoesFinanceiras.guardarNaPoupança(contaSelecionada, valor);
			}
			if (entrada == 4) {
				System.out.println("Digite o valor que deseja sacar: ");
				float valor = so.nextFloat();
				OperacoesFinanceiras.sacarPoupanca(contaSelecionada, valor);
			}
			if (entrada == 5) {
				contaSelecionada.status();
			}
		} else {
			System.out.println("Acesse sua conta para poder realizar operações..");
		}
		System.out.println("####################################");
		so.close();
	}
}