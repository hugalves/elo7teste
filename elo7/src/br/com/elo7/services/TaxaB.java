package br.com.elo7.services;

import br.com.elo7.models.Transferencia;
import br.com.elo7.utils.Utils;


public class TaxaB extends Taxa{

	@Override
	public double getValorTaxa(Transferencia transferencia) {
		if (Utils.diasDeDiferenca(transferencia) <= 30)
			return 10;

		return 8;
	}
}
