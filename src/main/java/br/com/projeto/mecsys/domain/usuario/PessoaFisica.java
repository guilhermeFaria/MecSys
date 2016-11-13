package br.com.projeto.mecsys.domain.usuario;

/**
 * 
 * Comments go here...
 *
 * @author Guilhere Faria
 *
 * @Version 1.0 13 de nov de 2016
 */
public class PessoaFisica extends Pessoa{
	
	private final String nome;
	private final String cpf;
	private final String rg;
	private final String dataNascimento;
	
	public PessoaFisica(final String endereco, final String cidade, final String estado, 
			final String cep, final String telefone, final String observacao, 
			final String nome, final String cpf, final String rg, final String dataNascimento) {
		super(endereco, cidade, estado, cep, telefone, observacao);
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}
}
