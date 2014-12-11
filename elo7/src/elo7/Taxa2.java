package elo7;


public class Taxa2 extends Taxa{

	@Override
	public double getValorTaxa(Transferencia transferencia) {
		if (Utils.diasDeDiferenca(transferencia) <= 30)
			return 10;

		return 8;
	}
}
