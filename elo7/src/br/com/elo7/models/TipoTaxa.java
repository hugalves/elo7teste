package br.com.elo7.models;

import br.com.elo7.services.Taxa;
import br.com.elo7.services.TaxaA;
import br.com.elo7.services.TaxaB;
import br.com.elo7.services.TaxaC;
import br.com.elo7.services.TaxaD;

public class TipoTaxa {
	public static final String TIPO_A = "A";
	public static final String TIPO_B = "B";
	public static final String TIPO_C = "C";
	public static final String TIPO_D = "D";

	private String tipoTaxa;

	public TipoTaxa(String tipoTaxa) {
		this.setTipoTaxa(tipoTaxa);
	}

	public Taxa getTaxa() {
		if (this.getTipoTaxa() == "A")
			return new TaxaA();

		if (this.getTipoTaxa() == "B")
			return new TaxaB();

		if (this.getTipoTaxa() == "C")
			return new TaxaC();

		if (this.getTipoTaxa() == "D")
			return new TaxaD();

		throw new IllegalArgumentException("Tipo de Taxa inv‡lida");
	}

	public String getTipoTaxa() {
		return tipoTaxa;
	}

	public void setTipoTaxa(String tipoTaxa) {
		this.tipoTaxa = tipoTaxa;
	}
}