
/*
 * @author:		Josep Oriol LÃ³pez Bosch / 	David Dalmau Dieguez / Octavio Bernal Vilana
 * @fecha:		16/04/2022
 * @versiÃ³n:	0.0.2
 */

package Class;

public class MainApp {

	public static void main(String[] args) {

		// Definimos un array de 10 lavadoras.
		LavadoraClass [] arrLavadoras = new LavadoraClass[10];
		
		// Creamos los objetos del tipo LavadoraClass.
		LavadoraClass bosch = new LavadoraClass(100, "rojo", 'a', 100, 30);
		LavadoraClass siemens = new LavadoraClass(150, "morado", 'f',40, 20);
		LavadoraClass balay = new LavadoraClass(200, "gris", 'a',60, 80);
		LavadoraClass candy = new LavadoraClass(250, "blanco", 'b',50, 80);
		LavadoraClass fagor = new LavadoraClass(300, "negro", 'c',30, 20);
		LavadoraClass haler = new LavadoraClass(350, "ROJO", 'd',15, 60);
		LavadoraClass bmw = new LavadoraClass(400, "AZUL", 'E', 80,100);
		LavadoraClass industrialLav = new LavadoraClass(600, "MARRÓN", 'X',50, 90);
		LavadoraClass lavathor = new LavadoraClass(300, "verde", 'F',35, 40);
		LavadoraClass lavadorax = new LavadoraClass(250, "AMARILLO", 'A',70, 100);
		
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
		
		// Recorremos el arrLavadoras y mostramos todos sus valores , la suma del precioFinal
		// según los pluses que tienen y el precio total de todas las lavadoras.
		for(int i=0 ; i< arrLavadoras.length; i++) {
			System.out.println(arrLavadoras[i]);
			precioFinalLavadoras = arrLavadoras[i].precioFinal();
			System.out.println(precioFinalLavadoras);
			precioTotalLavadoras += precioFinalLavadoras;
		}
		
		// Mostramos la suma del precio final de todas las lavadoras.
		System.out.println("El precio total con pluses de todas las lavadoras es: " + precioTotalLavadoras);



		
	}

}
