package MazoCartass;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Mazo baraja = new Mazo();
		Scanner sc = new Scanner(System.in);
		
		baraja.generarMazo(baraja);
		baraja.mezclarMazo(baraja);
		//baraja.mostrarMazo(baraja);
		
		System.out.println("Cuantas cartas queres sacar?: ");
		int rta = sc.nextInt();
		
		for(int i = 0; i < rta; i++) {
			baraja.sacar(baraja);
		}
		baraja.mostrarMazo(baraja);
	}
}
