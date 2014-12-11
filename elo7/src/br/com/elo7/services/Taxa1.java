package br.com.elo7.services;

import br.com.elo7.models.Transferencia;

public class Taxa1 extends Taxa {

	@Override
	public double getValorTaxa(Transferencia transferencia) {
		double valor = transferencia.getValor();

		return 2 + (valor * 0.03);
	}
}
