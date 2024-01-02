package clases;

public class Verbo {

	private String infinitivo;
	private String pasado;
	private String participio;
	private String significado;
	
	public Verbo(String infinitivo, String pasado, String participio, String significado) {
		super();
		this.infinitivo = infinitivo;
		this.pasado = pasado;
		this.participio = participio;
		this.significado = significado;
	}

	public String getInfinitivo() {
		return infinitivo;
	}

	public void setInfinitivo(String infinitivo) {
		this.infinitivo = infinitivo;
	}

	public String getPasado() {
		return pasado;
	}

	public void setPasado(String pasado) {
		this.pasado = pasado;
	}

	public String getParticipio() {
		return participio;
	}

	public void setParticipio(String participio) {
		this.participio = participio;
	}

	public String getSignificado() {
		return significado;
	}

	public void setSignificado(String significado) {
		this.significado = significado;
	}

	@Override
	public String toString() {
		return "Verbo Infinitivo --> " + infinitivo + " Pasado --> " + pasado + " Participio --> " + participio
				+ " Significado --> " + significado;
	}
	
	
}
