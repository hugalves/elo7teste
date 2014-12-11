package elo7;

public class Taxa3 extends Taxa {

	@Override
	public double getValorTaxa(Transferencia transferencia) {
		double valor = transferencia.getValor();
		long diasDeDiferenca = Utils.diasDeDiferenca(transferencia);
		
		if (diasDeDiferenca <= 5) {
			return valor * 8.3;
		}
		if (diasDeDiferenca > 5 && diasDeDiferenca <= 10) {
			return valor * 7.4;
		}
		if (diasDeDiferenca > 10 && diasDeDiferenca <= 15) {
			return valor * 6.7;
		}
		if (diasDeDiferenca > 15 && diasDeDiferenca <= 20) {
			return valor * 5.4;
		}
		if (diasDeDiferenca > 20 && diasDeDiferenca <= 25) {
			return valor * 4.3;
		}
		if (diasDeDiferenca > 25 && diasDeDiferenca <= 30) {
			return valor * 2.1;
		}
		return valor * 1.2;
	}

}
