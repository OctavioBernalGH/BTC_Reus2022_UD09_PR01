
/*
 * @author:		Josep Oriol López Bosch / 	David Dalmau Dieguez / Octavio Bernal Vilana
 * @fecha:		14/04/2022
 * @versión:	0.0.1
 */

package Class;

public class MainApp {

	public static void main(String[] args) {

		LavadoraClass lavadora = new LavadoraClass();
		System.out.println(lavadora);

		/* Instanciamos un objeto tele de la clase TelevisorClass con parámetros definidos */
		TelevisorClass tele = new TelevisorClass(250, "rojo", 'a', 120, 60, false);
		
		
		/* Instanciamos un objeto tele de la clase TelevisorClass con parámetros definidos */
		TelevisorClass tele2 = new TelevisorClass(100, "verde", 'b', 40, 30, true);

		/* Instanciamos un objeto tele de la clase TelevisorClass con parámetros definidos */
		TelevisorClass tele3 = new TelevisorClass(100, "", 's', 40, 30, true);
		
		/* Comprobación del funcionamiento de la clase TelevisorClass con atributos definidos */
		System.out.println(tele);
		
		/* Comprobación del funcionamiento de la clase TelevisorClass con atributos definidos */
		System.out.println(tele2);
		
		/* Comprobación de valores por defecto de la clase abstracta heredada*/
		System.out.println(tele3);

	}

}
