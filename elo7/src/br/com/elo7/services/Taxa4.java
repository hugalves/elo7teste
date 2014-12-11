package br.com.elo7.services;

import br.com.elo7.models.Transferencia;

public class Taxa4 extends Taxa {

	@Override
	public double getValorTaxa(Transferencia transferencia) {
		double valor = transferencia.getValor();
		Taxa taxa = null;
		
		if (valor <= 25000)
			taxa = new Taxa1();
		if (valor > 25000 && valor <= 120000)
			taxa = new Taxa2();
		if (valor > 120000)
			taxa = new Taxa3();	
		
		return taxa.getValorTaxa(transferencia);
	}
}
