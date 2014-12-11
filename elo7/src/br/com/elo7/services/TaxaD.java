package br.com.elo7.services;

import br.com.elo7.models.Transferencia;

public class TaxaD extends Taxa {

	@Override
	public double getValorTaxa(Transferencia transferencia) {
		double valor = transferencia.getValor();
		Taxa taxa = null;
		
		if (valor <= 25000)
			taxa = new TaxaA();
		if (valor > 25000 && valor <= 120000)
			taxa = new TaxaB();
		if (valor > 120000)
			taxa = new TaxaC();	
		
		return taxa.getValorTaxa(transferencia);
	}
}
