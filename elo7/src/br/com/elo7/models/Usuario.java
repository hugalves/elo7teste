package br.com.elo7.models;

public class Usuario {
	private String nome;
	private String cpf;

	public Usuario(String nome, String cpf) {
		this.nome = nome;
		this.setCpf(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
