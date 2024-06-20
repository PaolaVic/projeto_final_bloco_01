package projeto.controller;

import projeto.model.FunkoEspecial;
import projeto.repository.ProjetoRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProjetoController implements ProjetoRepository {

    private List<FunkoEspecial> produtos;

    public ProjetoController() {
       produtos = new ArrayList<>();
        
    }

    @Override
    public void visualizarCatalogo() {
        if (produtos.isEmpty()) {
            System.out.println("O catálogo está vazio.");
        } else {
            System.out.println("Catálogo de Funko Pops:");
            for (FunkoEspecial produto : produtos) {
                System.out.println(produto);
            }
        }
        System.out.println();
    }

    @Override
    public void buscarProdutoPorNome(String nome) {
        boolean encontrado = false;
        for (FunkoEspecial produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Produto encontrado: " + produto);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
        System.out.println();
    }

    @Override
    public void comprarProduto(String nome) {
        Iterator<FunkoEspecial> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            FunkoEspecial produto = iterator.next();
            if (produto.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
                System.out.println("Produto comprado com sucesso: " + produto);
                return;
            }
        }
        System.out.println("Produto não disponível para compra.");
        System.out.println();
    }

    @Override
    public void finalizarCompra() {
        System.out.println("Compra finalizada. Obrigado pela preferência!");
        System.out.println();
    }

	@Override
	public void cadastrarProduto(FunkoEspecial funkopop) {
		produtos.add(funkopop);
	}
}