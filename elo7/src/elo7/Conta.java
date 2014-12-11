package elo7;

public class Conta {
	private String numeroConta;
	//BigDecimal ??
	private float saldo;
	private Usuario usuario;

	public Conta(String numeroConta, float saldo, Usuario usuario) {
		this.setNumeroConta(numeroConta);
		this.setSaldo(saldo);
		this.setUsuario(usuario);
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
