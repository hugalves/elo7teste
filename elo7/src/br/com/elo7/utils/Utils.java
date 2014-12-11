package br.com.elo7.utils;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import br.com.elo7.models.Transferencia;

public class Utils {
	public static long diasDeDiferenca(Transferencia transferencia) {
		Date dataFinal = transferencia.getData();
		Date dataInicial = transferencia.getDataCadastro();
		long diferenca = dataFinal.getTime() - dataInicial.getTime();

		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}
}
