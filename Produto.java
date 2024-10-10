package pacote;

public class Produto {
	private int codigo;
	private double precoBase;
	private double desconto;
	
	private static double imposto = 0.15;
	
	public Produto(int codigo, double precoBase, double desconto, double imposto) {
	this.codigo = codigo;
	this.precoBase = precoBase;
	this.desconto = desconto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public static double getImposto() {
		return imposto;
	}

	public static void setImposto(double imposto) {
		Produto.imposto = imposto;
	}

	public String toString() {
		return "Produto [codigo=" + codigo + ", precoBase=" + precoBase + ", desconto=" + desconto + "]";
	}
	public double precoFinal() { 
		double precoFinal= (precoBase - desconto)*(1+ imposto);
		return precoFinal;
	
	}

}
