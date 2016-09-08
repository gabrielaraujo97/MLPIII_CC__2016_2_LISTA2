package br.unipe.receita.model;

public class ImpostoPrivado extends Imposto implements ITributavel {

	private double aliquota = 0.10;

	public double calcularImposto() {
		System.out.println("Valor total (aliquota incluida) : "
				+ ((this.getValorImposto() * this.aliquota) + this.getValorImposto()));
		return (this.getValorImposto() * this.aliquota) + this.getValorImposto();
	}
}
