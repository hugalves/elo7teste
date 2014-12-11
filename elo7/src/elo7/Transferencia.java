package elo7;

import java.util.Date;

public class Transferencia {
	private Conta origem;
	private Conta destino;
	private String descricao;
	private double valor;
	private double valorDaTaxa;
	private Date dataCadastro = new Date();
	private Date data;
	private int tipoTaxa;

	public Transferencia(Conta origem, Conta destino, String descricao,
			double valor, Date data, int tipoTaxa) {
		this.setOrigem(origem);
		this.setDestino(destino);
		this.setDescricao(descricao);
		this.setTipoTaxa(tipoTaxa);
		this.setValor(valor);
		this.setData(data);
	}

	public Conta getOrigem() {
		return origem;
	}

	public void setOrigem(Conta origem) {
		this.origem = origem;
	}

	public Conta getDestino() {
		return destino;
	}

	public void setDestino(Conta destino) {
		this.destino = destino;
	}

	public double getValor() {
		return valor + valorDaTaxa;
	}

	public void setValor(double valor) {
		this.valor = valor;
		this.setValorDaTaxa();
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getTipoTaxa() {
		return tipoTaxa;
	}

	public void setTipoTaxa(int tipoTaxa) {
		this.tipoTaxa = tipoTaxa;
	}

	public void setValorDaTaxa() {
		Taxa taxa = null;

		switch (this.getTipoTaxa()) {
		case 1:
			taxa = new Taxa1();
			break;
		case 2:
			taxa = new Taxa2();
			break;
		case 3:
			taxa = new Taxa3();
			break;
		case 4:
			taxa = new Taxa4();
			break;
		}

		this.valorDaTaxa = taxa.getValorTaxa(this);
	}

	public double getValorDaTaxa() {
		return valorDaTaxa;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
