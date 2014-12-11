package elo7;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	private String numeroConta;
	private double saldo;
	private Usuario usuario;
	private List<Transferencia> transferencias = new ArrayList<Transferencia>();

	public Conta(String numeroConta, double saldo, Usuario usuario) {
		this.setNumeroConta(numeroConta);
		this.setSaldo(saldo);
		this.setUsuario(usuario);
	}
	
	public boolean transferePara(Conta destino, Transferencia transferencia) {
		double valorTransferir = transferencia.getValor();

		if (this.getSaldo() > valorTransferir) {
			this.saldo -= valorTransferir;
			destino.setSaldo(destino.getSaldo() + valorTransferir);
			this.transferencias.add(transferencia);
			
			return true;
		}

		return false;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Transferencia> getTransferencias() {
		return transferencias;
	}

	public void setTransferencias(List<Transferencia> transferencias) {
		this.transferencias = transferencias;
	}
}
