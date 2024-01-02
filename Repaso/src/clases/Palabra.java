package clases;

public class Palabra {

	private String ingles;
	private String castellano;
	
	public Palabra(String ingles, String castellano) {
		super();
		this.ingles = ingles;
		this.castellano = castellano;
	}
	public String getIngles() {
		return ingles;
	}
	public void setIngles(String ingles) {
		this.ingles = ingles;
	}
	public String getCastellano() {
		return castellano;
	}
	public void setCastellano(String castellano) {
		this.castellano = castellano;
	}
	
	@Override
	public String toString() {
		return "Palabra [ingles=" + ingles + ", castellano=" + castellano + "]";
	}
	
	
	
}
