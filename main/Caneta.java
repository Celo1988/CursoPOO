package aula02;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;

	public void status() {
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Está tampada " + this.tampada);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}

	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! Não posso rabiscar");
		} else {
			System.out.println("Estou Rabiscando...");
		}
	}
	
	protected void tampar() {
		this.tampada = true;
	}

	protected void destampar() {
		this.tampada = false;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return this.ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return this.carga;
	}

	public void setCarga() {
		this.carga = carga;
	}

	
}