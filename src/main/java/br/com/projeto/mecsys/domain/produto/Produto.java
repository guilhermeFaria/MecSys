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
	
	private BigDecimal preçoVenda;
	private String nomeProduto;
	
	public Produto(final BigDecimal preçoVenda, final String nomeProduto) {
		super();
		this.preçoVenda = preçoVenda;
		this.nomeProduto = nomeProduto;
	}

	public BigDecimal getPreçoVenda() {
		return preçoVenda;
	}

	public void setPreçoVenda(BigDecimal preçoVenda) {
		this.preçoVenda = preçoVenda;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
}
