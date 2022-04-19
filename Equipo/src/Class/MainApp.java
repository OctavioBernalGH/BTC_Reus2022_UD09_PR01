
/*
 * @author:		Josep Oriol López Bosch / 	David Dalmau Dieguez / Octavio Bernal Vilana
 * @fecha:		16/04/2022
 * @versión:	0.1.2
 */

package Class;

public class MainApp {

	public static void main(String[] args) {

		// Definimos un array de 10 lavadoras.
		LavadoraClass[] arrLavadoras = new LavadoraClass[10];

		// Creamos los objetos del tipo LavadoraClass.
		LavadoraClass bosch = new LavadoraClass(100, "rojo", 'a', 100, 30);
		LavadoraClass siemens = new LavadoraClass(150, "morado", 'f', 40, 20);
		LavadoraClass balay = new LavadoraClass(200, "gris", 'a', 60, 80);
		LavadoraClass candy = new LavadoraClass(250, "blanco", 'b', 50, 80);
		LavadoraClass fagor = new LavadoraClass(300, "negro", 'c', 30, 20);
		LavadoraClass haler = new LavadoraClass(350, "ROJO", 'd', 15, 60);
		LavadoraClass bmw = new LavadoraClass(400, "AZUL", 'E', 80, 100);
		LavadoraClass industrialLav = new LavadoraClass(600, "MARR�N", 'X', 50, 90);
		LavadoraClass lavathor = new LavadoraClass(300, "verde", 'F', 35, 40);
		LavadoraClass lavadorax = new LavadoraClass(250, "AMARILLO", 'A', 70, 100);

		// Llenamos el arrLavadoras con los objetos LavadoraClass.
		arrLavadoras[0] = bosch;
		arrLavadoras[1] = siemens;
		arrLavadoras[2] = balay;
		arrLavadoras[3] = candy;
		arrLavadoras[4] = fagor;
		arrLavadoras[5] = haler;
		arrLavadoras[6] = bmw;
		arrLavadoras[7] = industrialLav;
		arrLavadoras[8] = lavathor;
		arrLavadoras[9] = lavadorax;

		// Creamos variables locales para almacenar los preciosFinales.
		double precioTotalLavadoras = 0;
		double precioFinalLavadoras = 0;

		// Recorremos el arrLavadoras y mostramos todos sus valores , la suma del
		// precioFinal
		// seg�n los pluses que tienen y el precio total de todas las lavadoras.
		for (int i = 0; i < arrLavadoras.length; i++) {
			System.out.println(arrLavadoras[i]);
			precioFinalLavadoras = arrLavadoras[i].precioFinal();
			System.out.println("El precio de la lavadora " + i + " es " + precioFinalLavadoras);
			precioTotalLavadoras += precioFinalLavadoras;
		}

		// Mostramos la suma del precio final de todas las lavadoras.
		System.out
				.println("\nEl precio total con pluses de todas las lavadoras es: " + precioTotalLavadoras + "\n\n\n");

		// Definimos un array de 10 televisores.
		TelevisorClass[] arrTeles = new TelevisorClass[10];

		TelevisorClass lg = new TelevisorClass(250, "azul", 'f', 60, 50, false);
		TelevisorClass oki = new TelevisorClass(100, "rojo", 'a', 80, 50, true);
		TelevisorClass samsung = new TelevisorClass(100, "morado", 'x', 80, 50, true);
		TelevisorClass philips = new TelevisorClass(699, "verde", 's', 180, 50, false);
		TelevisorClass aoc = new TelevisorClass(399, "blanco", 'b', 30, 50, true);
		TelevisorClass benq = new TelevisorClass(499, "negro", 'a', 60, 20, false);
		TelevisorClass thomson = new TelevisorClass(849, "rojo", 'f', 100, 100, true);
		TelevisorClass sony = new TelevisorClass(666, "azul", 'e', 25, 25, true);
		TelevisorClass telepaco = new TelevisorClass(350, "negro", 'd', 70, 50, false);
		TelevisorClass teleVisor = new TelevisorClass(250, "gris", 'c', 50, 50, true);

		// Llenamos el array de teles con objetos del tipo TelevisorClass.
		arrTeles[0] = lg;
		arrTeles[1] = oki;
		arrTeles[2] = samsung;
		arrTeles[3] = philips;
		arrTeles[4] = aoc;
		arrTeles[5] = benq;
		arrTeles[6] = thomson;
		arrTeles[7] = sony;
		arrTeles[8] = telepaco;
		arrTeles[9] = teleVisor;

		// Creamos variables locales para almacenar los preciosFinales.
		double precioTotalTelevisores = 0;
		double precioFinalTelevisores = 0;

		// Recorremos el arrTeles y mostramos todos sus valores , la suma del
		// precioFinal
		// seg�n los pluses que tienen y el precio total de todas las televisiones.
		for (int i = 0; i < arrTeles.length; i++) {
			System.out.println(arrTeles[i]);
			precioFinalTelevisores = arrTeles[i].precioFinal();
			System.out.println("Precio total televisi�n " + i + " con pluses es: " + arrTeles[i].precioFinal());
			precioTotalTelevisores += precioFinalTelevisores;
		}

		// Mostramos la suma del precio final de todas las televisiones.
		System.out.println("\nLa suma del precio total de las televisiones es: " + precioTotalTelevisores);

	}

}
