package br.unipe.receita.ui;

import java.util.Scanner;

import br.unipe.receita.model.ImpostoDeRenda;
import br.unipe.receita.model.ImpostoPrivado;
import br.unipe.receita.model.ImpostoPublico;

public class Principal {

	public static void main(String[] args) {

		ImpostoDeRenda impostoDeRenda = new ImpostoDeRenda();
		ImpostoPrivado impostoPrivado = new ImpostoPrivado();
		ImpostoPublico impostoPublico = new ImpostoPublico();
		Scanner leitor = new Scanner(System.in);

		// TESTANDO IMPOSTO PUBLICO

		System.out.println("Por favor informe o valor do seu imposto (publico) : ");
		impostoPublico.setValorImposto(leitor.nextDouble());
		impostoPublico.calcularImposto();

		// TESTANDO IMPOSTO PRIVADO

		System.out.println("Por favor informe o valor do seu imposto (privado) : ");
		impostoPrivado.setValorImposto(leitor.nextDouble());
		impostoPrivado.calcularImposto();

		// TESTANDO IMPOSTO DE RENDA

		System.out.println("Por favor informe o valor do seu imposto (renda) : ");
		impostoDeRenda.setValorImposto(leitor.nextDouble());
		impostoDeRenda.calcularImposto();

		leitor.close();

	}

}
