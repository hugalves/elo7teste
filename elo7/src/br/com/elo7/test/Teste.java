package br.com.elo7.test;

import java.util.Date;
import java.util.GregorianCalendar;

import br.com.elo7.models.Conta;
import br.com.elo7.models.TipoTaxa;
import br.com.elo7.models.Transferencia;
import br.com.elo7.models.Usuario;

public class Teste {
	public static void main(String[] args) {
		Usuario quico  = new Usuario("quico", "67890");
		Usuario chaves = new Usuario("chaves", "12345");

		Conta origem   = new Conta("2", 1000, quico);
		Conta destino  = new Conta("1", 1, chaves);

		// january = 0, february = 1...
		Date dataTransferencia = new GregorianCalendar(2014, 11, 23).getTime();
		Transferencia ajudaChaves = new Transferencia(
				origem,
				destino,
				"sanduiche de presunto", 
				100,
				dataTransferencia,
				TipoTaxa.TIPO_A);

		System.out.println("Saldo chaves: " + destino.getSaldo());
		System.out.println("Saldo quico: " + origem.getSaldo());

		if (origem.transferePara(destino, ajudaChaves)) {
			System.out.println("Saldo chaves: " + destino.getSaldo());
			System.out.println("Saldo quico: " + origem.getSaldo());
			origem.imprimirMinhasTransferencias();
		} else
			System.out
					.println("N‹o foi poss’vel transferir. Chaves continua com fome");
	}
}
