package elo7;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utils {
	public static long diasDeDiferenca(Transferencia transferencia) {
		Date dataFinal = transferencia.getData();
		Date dataInicial = transferencia.getDataCadastro();
		long diferenca = dataFinal.getTime() - dataInicial.getTime();

		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}
}
