package Vehiculo;

public class Autobus extends Vehiculo{
	
	private  int numero=0, numParadas=0;

	public Autobus(String marca, String modelo, String numBastidor, int numPuertas, int numero, int numParadas) {
		super(marca, modelo, numBastidor, numPuertas);
		this.numero=numero;
		this.numParadas=numParadas;
		// TODO Auto-generated constructor stub
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getNumeroParadas() {
		return numParadas;
	}
	
	public String toString() {
		return super.toString()  +  "Número: " + numero + "; " + "Número de paradas: " + numParadas + "\n"; 
	}


}
