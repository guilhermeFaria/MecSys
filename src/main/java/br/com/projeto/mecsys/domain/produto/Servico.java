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
public class Servico extends Produto {

	private String descricaoServico; 
	
	public Servico(final BigDecimal pre�oCompra, final BigDecimal pre�oVenda, final String nomeProduto, final String descricaoServico) {
		super(pre�oVenda, nomeProduto);
		this.descricaoServico = descricaoServico;
	}

	public String getDescricaoServico() {
		return descricaoServico;
	}
	
	public void setDescricaoServico(final String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}

}