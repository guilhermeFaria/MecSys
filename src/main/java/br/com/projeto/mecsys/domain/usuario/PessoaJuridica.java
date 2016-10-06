package br.com.projeto.mecsys.domain.usuario;

public class PessoaJuridica extends Pessoa {
	
	private String nomeFantasia;
	private String cnpj;
	private String razaoSocial;
	private String representante;
	private String email;
	
	
	public PessoaJuridica(final String endereco, final String cidade, final String estado, 
			final String cep, final String telefone, final String observacao, 
			final String nomeFantasia, final String cnpj, final String razaoSocial, final String representante, final String email) {
		super(endereco, cidade, estado, cep, telefone, observacao);
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.representante = representante;
		this.email = email;
	}

}
