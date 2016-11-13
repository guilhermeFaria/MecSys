package br.com.projeto.mecsys.domain.usuario;

/**
 * 
 * Comments go here...
 *
 * @author Guilhere Faria
 *
 * @Version 1.0 13 de nov de 2016
 */
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

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}