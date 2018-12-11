package SolucionBuilder;

public class Computador {
	
	private String marca;
	private String modelo;
	private int ram;
	private int disco;
	private SistemaOperativo so;
	private Mainboard placa;
	private boolean coolerExterno;
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getDisco() {
		return disco;
	}
	public void setDisco(int disco) {
		this.disco = disco;
	}
	public SistemaOperativo getSo() {
		return so;
	}
	public void setSo(SistemaOperativo so) {
		this.so = so;
	}
	public Mainboard getPlaca() {
		return placa;
	}
	public void setPlaca(Mainboard placa) {
		this.placa = placa;
	}
	
	public boolean isCoolerExterno() {
		return coolerExterno;
	}
	public void setCoolerExterno(boolean coolerExterno) {
		this.coolerExterno = coolerExterno;
	}
	@Override
	public String toString() {
		return "El computador es" + marca +"" + modelo + " con" + ram + "de ram," + disco + "de almacenamiento y cuenta con un Sistema Operativo" + so
				+ " con una placa" + placa + " y cooler Externo: " + coolerExterno ;
	}
	
	
	
	

}
