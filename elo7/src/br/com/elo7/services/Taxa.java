package br.com.elo7.services;

import br.com.elo7.models.Transferencia;

public abstract class Taxa {
	public abstract double getValorTaxa(Transferencia transferencia);
}
