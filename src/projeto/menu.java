package projeto;

import java.util.Scanner;

import projeto.controller.ProjetoController;
import projeto.model.FunkoEspecial;
import projeto.util.cores;

public class menu {

	public static void main(String[] args) {

		ProjetoController repos = new ProjetoController();

		repos.cadastrarProduto(new FunkoEspecial("DONATELLO CLASSICO", "R$215,00", "6 cm", "Plastico", "Herois", "Sem brilho"));
        repos.cadastrarProduto(new FunkoEspecial("MILES MORALES ", "R$225,00", "6 cm", "Plastico", "Marvel", "Sem brilho"));
        repos.cadastrarProduto(new FunkoEspecial("STITCH COMO PONGO", "R$115,00", "6 cm", "Plastico", "Disney", "Sem brilho"));
        repos.cadastrarProduto(new FunkoEspecial("SHAKIRA (SUPER BOWL LIV)", "R$205,00", "6 cm", "Plastico", "Musica", "Sem brilho"));
		
		Scanner leia = new Scanner(System.in);
		int opcao;

		while (true) {

			System.out.println(cores.TEXT_WHITE + cores.ANSI_BLACK_BACKGROUND
					+ "»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
			System.out.println("                                                     ");
			System.out.println("                Bem Vindos ao MUNDOPOP               ");
			System.out.println("                                                     ");
			System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
			System.out.println("                                                     ");
			System.out.println("            1 - Visualizar Catálogo                  ");
			System.out.println("            2 - Buscar produto por nome              ");
			System.out.println("            3 - Comprar produto                      ");
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
				repos.visualizarCatalogo();
				break;
			case 2:
		
			    System.out.println(cores.TEXT_WHITE_BOLD + "Buscar produto por nome \n\n");
			    leia.nextLine(); 
			    String nomeProduto = leia.nextLine(); 
			    repos.buscarProdutoPorNome(nomeProduto);
			    break;
			case 3:
				System.out.println(cores.TEXT_WHITE_BOLD + "Comprar produto \n\n");
			    leia.nextLine(); 
			    String nomeProdutoCompra = leia.nextLine(); 
			    repos.comprarProduto(nomeProdutoCompra);
			    break;
			case 4:
				System.out.println(cores.TEXT_WHITE_BOLD + "Finalizar Compra \n\n");
				repos.finalizarCompra();
				break;
			case 5:
                System.out.println(cores.TEXT_WHITE_BOLD + "Sair \n\n");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
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