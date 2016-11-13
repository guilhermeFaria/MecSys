package br.com.projeto.mecsys.domain.usuario;

/**
 * 
 * Comments go here...
 *
 * @author Guilhere Faria
 *
 * @Version 1.0 13 de nov de 2016
 */
public abstract class Pessoa {
	
	private String endereco;
	private String cidade;
	private String estado;
	private String cep;
	private String telefone;
	private String observacao;
	
	public Pessoa(final String endereco, final String cidade, final String estado, final String cep, final String telefone, final String observacao) {
		super();
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.telefone = telefone;
		this.observacao = observacao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(final String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(final String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(final String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(final String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(final String telefone) {
		this.telefone = telefone;
	}

	public String getObservacao() {
		return observacao;
	}
	
	public void setObservacao(final String observacao) {
		this.observacao = observacao;
	}

}