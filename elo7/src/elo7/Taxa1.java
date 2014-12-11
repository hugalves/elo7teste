package elo7;

public class Taxa1 extends Taxa {

	@Override
	double getValorTaxa(Transferencia transferencia) {
		float valor = transferencia.getValor();

		return 2 + (valor * 0.03) ;
	}
}
