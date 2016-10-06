package br.com.projeto.mecsys.domain.usuario;

public abstract class Pessoa {
	private String endereco;
	private String cidade;
	private String estado;
	private String cep;
	private String telefone;
	private String observacao;
	
	public Pessoa(String endereco, String cidade, String estado, String cep, String telefone, String observacao) {
		super();
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.telefone = telefone;
		this.observacao = observacao;
	}
	

}
