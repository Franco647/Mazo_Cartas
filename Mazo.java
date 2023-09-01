package MazoCartass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mazo {
	Cartas[] mazo = new Cartas[48];

	Mazo() {
	};

	public void generarMazo(Mazo baraja) {

		int posArray = 0;

		for (int i = 0; i < 4; i++) {
			if (i == 0) {
				for (int j = 1; j <= 12; j++) {

					baraja.mazo[posArray] = new Cartas(j, "Espada");
					posArray++;
				}
			} else if (i == 1) {

				for (int f = 1; f <= 12; f++) {
					baraja.mazo[posArray] = new Cartas(f, "Basto");
					posArray++;
				}
			} else if (i == 2) {
				for (int n = 1; n <= 12; n++) {
					baraja.mazo[posArray] = new Cartas(n, "Copa");
					posArray++;
				}
			} else {
				for (int m = 1; m <= 12; m++) {
					baraja.mazo[posArray] = new Cartas(m, "Oro");
					posArray++;
				}
			}

		}
	}

	public void mezclarMazo(Mazo baraja) {
		List<Cartas> cartalist = Arrays.asList(baraja.mazo);
		Collections.shuffle(cartalist);
		cartalist.toArray(baraja.mazo);
	}

	public void mostrarMazo(Mazo baraja) {
		for (int j = 0; j < 48; j++) {
			if(baraja.mazo[j] == null) {
				System.out.println("No hay mas cartas pa.");
				break;
			}
			System.out.println(baraja.mazo[j].getNumero() + "," + baraja.mazo[j].getPalo());
		}
	}

	public Cartas sacar(Mazo baraja) {

		int cont = -1;
		
		do{
			cont++;
			if(cont == 48) {
				System.out.println("Se terminaron las cartas del mazo.");
				cont = 0;
				return null;
			}
		} while (baraja.mazo[cont] == null);
		
		Cartas cartaAux = new Cartas(baraja.mazo[cont].getNumero(), baraja.mazo[cont].getPalo());
		System.out.println(cartaAux.getNumero() + "," + cartaAux.getPalo());
		
		baraja.mazo[cont] = null;
		
		return cartaAux;
	}

}
