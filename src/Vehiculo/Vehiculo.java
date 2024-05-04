package Vehiculo;

public abstract class Vehiculo {
	private String marca="", modelo="", numBastidor="";
	private int numPuertas=0;
	private static int CantidadVehiculosFuncionando=0;
	
	public Vehiculo(String marca, String modelo, String numBastidor, int numPuertas) {
		this.marca=marca;
		this.modelo=modelo;
		this.numBastidor=numBastidor;
		this.numPuertas=numPuertas;
		CantidadVehiculosFuncionando++;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getNumeroBastidor() {
		return numBastidor;
	}
	
	public int getNumeroPuertas() {
		return numPuertas;
	}
	
	public static int getCantidadVehiculosFuncionando() {
		return CantidadVehiculosFuncionando;
	}
	
	public String toString() {
		return "Marca: " + marca + "; " + "Modelo: " + modelo + "; " + "NumBastidor: " + numBastidor + "; " + "NumPuertas: " + numPuertas + "; ";
	}
}
