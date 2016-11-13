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
public abstract class Produto {
	
	private BigDecimal pre�oVenda;
	private String nomeProduto;
	
	public Produto(final BigDecimal pre�oVenda, final String nomeProduto) {
		super();
		this.pre�oVenda = pre�oVenda;
		this.nomeProduto = nomeProduto;
	}

	public BigDecimal getPre�oVenda() {
		return pre�oVenda;
	}

	public void setPre�oVenda(BigDecimal pre�oVenda) {
		this.pre�oVenda = pre�oVenda;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
}
