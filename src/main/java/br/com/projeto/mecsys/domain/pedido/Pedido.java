/**
 * 
 */
package br.com.projeto.mecsys.domain.pedido;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
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
public class Pedido {
	
	private List<Produto> listaPedido;
	
	public Pedido() {
		listaPedido = new ArrayList<Produto>();
	}
	
	public void addProdutoPedido(final Produto produto, final int quantidade) {
		listaPedido.addAll(carregaLista(produto, quantidade));
	}
	
	public void removeProduto(final Produto produto, final int quantidade) {
		listaPedido.removeAll(carregaLista(produto, quantidade));
	}
	
	public BigDecimal valorTotal() {
		BigDecimal valorTotal = new BigDecimal(0);
		
		for(Produto produtoLista: listaPedido) {
			valorTotal.add(produtoLista.getPreçoVenda());
		}
		return valorTotal;
	}
	
	public Collection<? extends Produto> listaPedido() {
		return Collections.unmodifiableList(listaPedido);
	}
	
	private List<Produto> carregaLista(final Produto produto, final int quantidade) {
		List<Produto> lista = new ArrayList<Produto>();
		for(int contador = 0; contador < quantidade; contador++) {
			lista.add(produto);
		}
		return Collections.unmodifiableList(lista);
	}

}
