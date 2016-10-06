package br.com.projeto.mecsys.domain.usuario;

public class PessoaFisica extends Pessoa{
	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	
	public PessoaFisica(final String endereco, final String cidade, final String estado, 
			final String cep, final String telefone, final String observacao, 
			final String nome, final String cpf, final String rg, final String dataNascimento) {
		super(endereco, cidade, estado, cep, telefone, observacao);
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}
	
	
	
	
	
	
	
}
