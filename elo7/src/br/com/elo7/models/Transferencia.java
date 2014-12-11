package br.com.elo7.models;

import java.util.Date;

import br.com.elo7.services.Taxa;

public class Transferencia {
	private Conta origem;
	private Conta destino;
	private String descricao;
	private double valor;
	private double valorDaTaxa;
	private Date dataCadastro = new Date();
	private Date data;
	private TipoTaxa tipoTaxa;

	public Transferencia(Conta origem, Conta destino, String descricao,
			double valor, Date data, String tipoTaxa) {
		this.setOrigem(origem);
		this.setDestino(destino);
		this.setDescricao(descricao);
		this.setData(data);
		this.setTipoTaxa(tipoTaxa);
		this.setValor(valor);
	}

	public void setOrigem(Conta origem) {
		this.origem = origem;
	}

	public void setDestino(Conta destino) {
		this.destino = destino;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public double getValorTotal() {
		return valor + valorDaTaxa;
	}

	public void setValor(double valor) {
		this.valor = valor;
		setValorDaTaxa();
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public TipoTaxa getTipoTaxa() {
		return tipoTaxa;
	}

	public void setTipoTaxa(String tipoTaxa) {
		this.tipoTaxa = new TipoTaxa(tipoTaxa);
	}

	public void setValorDaTaxa() {
		Taxa taxa = this.getTipoTaxa().getTaxa();
		this.valorDaTaxa = taxa.getValorTaxa(this);
	}

	public double getValorDaTaxa() {
		return valorDaTaxa;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}
}
