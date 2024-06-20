package projeto.repository;

import projeto.model.FunkoEspecial;

public interface ProjetoRepository {

	void visualizarCatalogo();

	void buscarProdutoPorNome(String nome);

	void finalizarCompra();

	void cadastrarProduto(FunkoEspecial funkopop);

	void comprarProduto(String nome);

}
