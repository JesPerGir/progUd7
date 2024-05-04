package Vehiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Taxi taxi1 = new Taxi("Tesla", "Model S", "4YJSA1DP5CFF00000", 5, Asientos.CUERO, 35, 0.92);
		Taxi taxi2 = new Taxi("Honda", "Civic", "4YLDR1BG9HCFF02356", 5, Asientos.RECLINABLES, 44, 0.99);
		Particular particular1 = new Particular("Mercedes", "Benz", "8JKIR3VF9CCDF06384", 5, Asientos.CALEFACCION, 66, "Amancio Ortega", true);
		Particular particular2 = new Particular("Audi", "A6", "5MMJU3VH2F5GC12254", 5, Asientos.RECLINABLES, 22, "Elon Musk", false);
		Autobus autobus1 = new Autobus("Volvo", "9800", "66JHU2KK3DD3C22478", 4, 27, 12);
		
		System.out.println("Datos del primer taxi:\n" + taxi1);
		System.out.println("Datos del segundo taxi:\n" + taxi2);
		System.out.println("Datos del primer particular:\n" + particular1);
		System.out.println("Datos del segundo particular:\n" + particular2);
		System.out.println("Datos del primer autobús:\n" + autobus1);
		
		System.out.println("Número de vehículos funcionando: " + Vehiculo.getCantidadVehiculosFuncionando() + "\n");
		
		taxi1.reiniciarContador(25000);
		System.out.println("Coste del trayecto del primer taxi: " + taxi1.calcularCosteTrayecto() + "€.\n");
		System.out.println("Datos actualizados del primer taxi: " + taxi1);
		
		particular1.reiniciarContador(10000);
		
		particular2.setPropietario("Jeff Bezos");
		System.out.println("Datos actualizados del segundo particular: " + particular2);
		
		
	}

}
