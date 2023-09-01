package MazoCartass;

public class Cartas {
	private int numero;
	private String palo; // E - B - O - C

	Cartas(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}
}
