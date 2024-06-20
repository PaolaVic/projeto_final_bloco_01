package projeto;

import java.util.Scanner;

import projeto.util.cores;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {

			System.out.println(cores.TEXT_WHITE+ cores.ANSI_BLACK_BACKGROUND + "»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
			System.out.println("                                                     ");
			System.out.println("                Bem Vindos ao MUNDOPOP               ");
			System.out.println("                                                     ");
			System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
			System.out.println("                                                     ");
			System.out.println("            1 - Visualizar Catálogo                  ");
			System.out.println("            2 - Adicionar Item ao Carrinho           ");
			System.out.println("            3 - Visualizar Carrinho                  ");
			System.out.println("            4 - Finalizar Compra                     ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
			System.out.println("Escolha uma opção:                                   ");
			System.out.println("                                                     " + cores.TEXT_RESET);
			opcao = leia.nextInt();
			
			if (opcao == 5) {
				System.out.println("Onde você encontra seus personagens favoritos");
				sobre();
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println(cores.TEXT_WHITE_BOLD + "Visualizar Catálogo \n\n");
				
				break;
			case 2:
				System.out.println(cores.TEXT_WHITE_BOLD + "Adicionar Item ao Carrinho \n\n");
				
				break;
			case 3:
				System.out.println(cores.TEXT_WHITE_BOLD + "Visualizar Carrinho \n\n");
				
				break;
			case 4:
				System.out.println(cores.TEXT_WHITE_BOLD + "Finalizar Compra \n\n");
				
				break;
			case 5:
				System.out.println(cores.TEXT_WHITE_BOLD + "Sair \n\n");
				
				break;
				
			}
		
		
		
	}

}

	private static void sobre() {
		System.out.println("\n»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
		System.out.println("Projeto Desenvolvido por: Paola Victorya C. Silva ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/PaolaVic");
		System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
		
	}
}
