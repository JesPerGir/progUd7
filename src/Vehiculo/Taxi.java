package Vehiculo;

public class Taxi extends Turismo implements Calculable, Iniciable {
	
	double importeInicio = 2, kmRecorridos=0, importeKm=0;

	public Taxi(String marca, String modelo, String numBastidor, int numPuertas, Asientos tipoAsiento, double kmRecorridos, double importeKm) {
		super(marca, modelo, numBastidor, numPuertas, tipoAsiento);
		// TODO Auto-generated constructor stub
		this.kmRecorridos=kmRecorridos;
		this.importeKm=importeKm;
	}

	@Override
	public void reiniciarContador(double kilometros) {
		// TODO Auto-generated method stub
		kmRecorridos=kilometros;
		System.out.println("Cuentakilómetos del Taxi reiniciado con un total de " + kmRecorridos + "km.\n");
	}

	@Override
	public double calcularCosteTrayecto() {
		// TODO Auto-generated method stub
		return importeInicio+(kmRecorridos*importeKm);
	}

	@Override
	public double calcularPrecioAlquiler(int numDias) {
		// TODO Auto-generated method stub
		return 50*numDias;
	}

	@Override
	public int getMaxVelocidad() {
		// TODO Auto-generated method stub
		return 200;
	}
	
	public double getKmRecorridos() {
		return kmRecorridos;
	}
	
	public double getImporteKm() {
		return importeKm;
	}
	
	public String toString() {
		return super.toString() + "; " + "Importe inicio: " + importeInicio + "€; " + "Importe Km: " + importeKm + "€;  " + "KmRecorridos: " + kmRecorridos + "km; " + "Coste del trayecto: " + calcularCosteTrayecto() + "€ \n" ;
	}


}
