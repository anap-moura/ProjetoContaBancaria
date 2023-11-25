package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta.model.Conta;
import conta.util.Cores;
import conta.model.ContaPoupanca;
import conta.model.ContaCorrente;




public class Menu {
	public static void main(String[] args) {
					
		ContaCorrente 
		cc1 = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
				
		        
		ContaPoupanca 
		cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		

		while (true) {
			
			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND);
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO APMC                           ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     "+ Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n Banco APMC - Sempre com você!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE_BOLD+"Criar Conta\n\n");

					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE_BOLD+"Listar todas as Contas\n\n");

					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD+"Consultar dados da Conta - por número\n\n");

					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD+"Atualizar dados da Conta\n\n");

					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE_BOLD+"Apagar a Conta\n\n");

					break;
				case 6:
					System.out.println(Cores.TEXT_WHITE_BOLD+"Saque\n\n");

					break;
				case 7:
					System.out.println(Cores.TEXT_WHITE_BOLD+"Depósito\n\n");

					break;
				case 8:
					System.out.println(Cores.TEXT_WHITE_BOLD+"Transferência entre Contas\n\n");

					break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD+"\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Ana Paula Moura da Cruz \ne supervisionado pelos instrutores da Generation Brasil.");
		System.out.println("Contato: ana.mcruz@hotmail.com");
		System.out.println("Para mais projetos, acesse: github.com/anap-moura");
		System.out.println("*********************************************************");
	}
	

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione ENTER para continuar.");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de ENTER...");

		}
	}
}