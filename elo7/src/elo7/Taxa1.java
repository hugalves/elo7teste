package elo7;

public class Taxa1 extends Taxa {

	@Override
	public double getValorTaxa(Transferencia transferencia) {
		double valor = transferencia.getValor();

		return 2 + (valor * 0.03);
	}
}
