/**
 * 
 */
package br.com.projeto.mecsys.domain.estoque;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.projeto.mecsys.domain.produto.Produto;

/**
 * Comments go here...
 *
 * @author Guilhere Faria
 *
 * @Version 1.0 13 de nov de 2016
 */
public class Estoque {

	private List<Produto> produtosEstoque;
	
	public Estoque() {
		produtosEstoque = new ArrayList<Produto>();
	}
	
	public void addProduto(final Produto produto, final int quantidade) {
		produtosEstoque.addAll(carregaLista(produto, quantidade));
	}
	
	public void removeProduto(final Produto produto, final int quantidade) {
		produtosEstoque.removeAll(carregaLista(produto, quantidade));
	}
	
	public List<Produto> mostrarProdutos() {
		return Collections.unmodifiableList(produtosEstoque);
	}
	
	private List<Produto> carregaLista(final Produto produto, final int quantidade) {
		List<Produto> lista = new ArrayList<>();
		for (int contador = 0; contador <= quantidade; contador++) {
			lista.add(produto);
		}
		return lista;
	}
	
}