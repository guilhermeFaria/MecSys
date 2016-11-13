/**
 * 
 */
package br.com.projeto.mecsys.domain.produto;

import java.math.BigDecimal;

/**
 * Comments go here...
 *
 * @author Guilhere Faria
 *
 * @Version 1.0 13 de nov de 2016
 */
public class Oleo extends Produto {

	private BigDecimal precoCompra;
	
	public Oleo(final BigDecimal preçoVenda, final String nomeProduto, final BigDecimal precoCompra) {
		super(preçoVenda, nomeProduto);
		this.precoCompra = precoCompra;
	}

	public BigDecimal getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(BigDecimal precoCompra) {
		this.precoCompra = precoCompra;
	}

}