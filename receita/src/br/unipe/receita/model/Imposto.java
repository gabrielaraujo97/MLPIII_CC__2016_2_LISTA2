package br.unipe.receita.model;

public abstract class Imposto {

	private double valorImposto;
	private int anoImposto;
	private int codIdImposto;

	enum TipoImposto {
		municipal, federal, estadual;
	}

	public double getValorImposto() {
		return valorImposto;
	}

	public void setValorImposto(double valorImposto) {
		this.valorImposto = valorImposto;
	}

	public int getAnoImposto() {
		return anoImposto;
	}

	public void setAnoImposto(int anoImposto) {
		this.anoImposto = anoImposto;
	}

	public int getCodIdImposto() {
		return codIdImposto;
	}

	public void setCodIdImposto(int codIdImposto) {
		this.codIdImposto = codIdImposto;
	}

}
