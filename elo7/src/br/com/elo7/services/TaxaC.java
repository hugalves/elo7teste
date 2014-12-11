package br.com.elo7.services;

import br.com.elo7.models.Transferencia;
import br.com.elo7.utils.Utils;

public class TaxaC extends Taxa {

	@Override
	public double getValorTaxa(Transferencia transferencia) {
		double valor = transferencia.getValor();
		long diasDeDiferenca = Utils.diasDeDiferenca(transferencia);
		
		if (diasDeDiferenca <= 5) {
			return valor * 0.083;
		}
		if (diasDeDiferenca > 5 && diasDeDiferenca <= 10) {
			return valor * 0.074;
		}
		if (diasDeDiferenca > 10 && diasDeDiferenca <= 15) {
			return valor * 0.067;
		}
		if (diasDeDiferenca > 15 && diasDeDiferenca <= 20) {
			return valor * 0.054;
		}
		if (diasDeDiferenca > 20 && diasDeDiferenca <= 25) {
			return valor * 0.043;
		}
		if (diasDeDiferenca > 25 && diasDeDiferenca <= 30) {
			return valor * 0.021;
		}
		return valor * 0.012;
	}

}
