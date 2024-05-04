package Vehiculo;

public class Particular extends Turismo implements Iniciable{
	
	String propietario="";
	boolean conAireAcondicionado;
	double kmRecorridos=0;

	public Particular(String marca, String modelo, String numBastidor, int numPuertas, Asientos tipoAsiento, double kmRecorridos, String propietario, boolean conAireAcondicionado) {
		super(marca, modelo, numBastidor, numPuertas, tipoAsiento);
		// TODO Auto-generated constructor stub
		this.kmRecorridos=kmRecorridos;
		this.propietario=propietario;
		this.conAireAcondicionado=conAireAcondicionado;
	}

	@Override
	public void reiniciarContador(double kilometros) {
		// TODO Auto-generated method stub
		kmRecorridos=kilometros;
		System.out.println("Cuentakilómetos del Particular reiniciado con un total de "  + kmRecorridos + "km.\n");
	}

	@Override
	public double calcularPrecioAlquiler(int numDias) {
		// TODO Auto-generated method stub
		return 30*numDias;
	}

	@Override
	public int getMaxVelocidad() {
		// TODO Auto-generated method stub
		return 220;
	}
	
	public String getPropietario() {
		return propietario;
	}
	
	public void setPropietario(String propietario) {
		this.propietario=propietario;
	}
	
	public boolean getAireAcondicionado() {
		return conAireAcondicionado;
	}
	
	public String toString() {
		return super.toString() + "; " + "Propietario: " + propietario + "; " + "Aire acondicionado: " + conAireAcondicionado + "\n";
	}

}
