package br.com.elo7;

import java.util.Date;
import java.util.GregorianCalendar;

import br.com.elo7.models.Conta;
import br.com.elo7.models.Transferencia;
import br.com.elo7.models.Usuario;

public class Teste {
	public static void main(String[] args) {
		Usuario chaves = new Usuario("chaves", "12345");
		Usuario quico = new Usuario("quico", "67890");

		Conta destino = new Conta("1", 1, chaves);
		Conta origem = new Conta("2", 100000, quico);

		Date dataTransferencia = new GregorianCalendar(2014, 12, 28).getTime();

		Transferencia ajudaChaves = new Transferencia(origem, destino,
				"sanduiche de presunto", 3, dataTransferencia, 1);

		System.out.println("Saldo chaves: " + destino.getSaldo());
		System.out.println("Saldo quico: " + origem.getSaldo());
		origem.transferePara(destino, ajudaChaves);
		System.out.println("Saldo chaves: " + destino.getSaldo());
		System.out.println("Saldo quico: " + origem.getSaldo());
		System.out.println("Transferencias quico: "
				+ origem.getTransferencias().get(0).getDescricao());

	}
}
