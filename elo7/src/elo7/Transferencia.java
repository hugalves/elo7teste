package elo7;

import java.util.Date;

public class Transferencia {
	private Conta origem;
	private Conta destino;
	private float valor;
	private float valorComTaxa;
	private Date data;
	private TipoTaxa tipoTaxa;

	public Transferencia(Conta origem, Conta destino, float valor,
			Date data, TipoTaxa tipoTaxa) {
		this.setOrigem(origem);
		this.setDestino(destino);
		this.setValor(valor);
		this.setData(data);
		this.setTipoTaxa(tipoTaxa);
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

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
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

	public void setTipoTaxa(TipoTaxa tipoTaxa) {
		this.tipoTaxa = tipoTaxa;
	}

	public float getValorComTaxa() {
		return valorComTaxa;
	}

	public void setValorComTaxa(float valorComTaxa) {
		this.valorComTaxa = valorComTaxa;
	}
}
