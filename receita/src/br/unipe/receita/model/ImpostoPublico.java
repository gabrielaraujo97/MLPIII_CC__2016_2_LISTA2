package br.unipe.receita.model;

public class ImpostoPublico extends Imposto implements ITributavel {

	private double aliquota = 0.15;

	public double calcularImposto() {
		System.out.println("Valor total (aliquota incluida) : "
				+ ((this.getValorImposto() * this.aliquota) + this.getValorImposto()));
		return (this.getValorImposto() * this.aliquota) + this.getValorImposto();
	}

}
