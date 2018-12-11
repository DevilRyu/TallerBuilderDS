package SolucionBuilder;

public class Mainboard {
	
	private String modelo;
	private String numeracion;
	
	public Mainboard (String modelo, String numeracion) {
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumeracion() {
		return numeracion;
	}

	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}

	@Override
	public String toString() {
		return "Mainboard [modelo=" + modelo + ", numeracion=" + numeracion + "]";
	}
	
	

}
