
/*
 * @author:		Josep Oriol López Bosch / 	David Dalmau Dieguez / Octavio Bernal Vilana
 * @fecha:		14/04/2022
 * @versión:	0.0.1
 */

package Class;

public class TelevisorClass extends ElectrodomesticoClass {

	/* Atributos de clase */
	protected double resolucion;
	protected boolean sintonizador;

	/* Constantes por defecto */
	protected static final double RESOLUCIONF = 20.0;
	protected static final boolean SINTONIZADORF = false;

	/* Constructor por defecto */
	public TelevisorClass() {
		this.resolucion = RESOLUCIONF;
		this.sintonizador = SINTONIZADORF;
	}

	/* Constructor de superclase. */
	public TelevisorClass(double precioBase, double peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}

	/* Constructor de clase con superclase. */
	public TelevisorClass(double precioBase, String color, char consumo, double peso, double resolucion,
			boolean sintonizador) {
		super(precioBase, color, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
		this.precioBase = precioFinal(consumo, peso, resolucion, precioBase);
	}

	/* Getters y setters solo de resolución y sintonizador */
	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}

	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}

	/* Método toString() con los atributos de clase y de super clase. */
	@Override
	public String toString() {
		return "TelevisorClass [resolucion=" + resolucion + ", sintonizador=" + sintonizador + ", precioBase="
				+ precioBase + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + "]";
	}

	/*
	 * Método comprobarColor() valida que el color seleccionado esté dentro del
	 * rango de colores.
	 */
	@Override
	public String comprobarColor(String color) {
		String colorCorrecto = COLORF;
		String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };

		for (int i = 0; i < colores.length; i++) {
			if (color.toLowerCase().equals(colores[i])) {
				colorCorrecto = color;
			} else {

			}
		}
		return colorCorrecto;
	}

	/* Meto comprobarConsumoEnergetico(), comprueba que la letra es correcta. */
	@Override
	public char comprobarConsumoEnergetico(char letra) {
		char letraCorrecta = CONSUMOF;
		char[] letras = { 'A', 'B', 'C', 'D', 'E', 'F' };

		for (int i = 0; i < letras.length; i++) {
			if (letra == letras[i]) {
				letraCorrecta = letra;
			}
		}

		return letraCorrecta;
	}

	/* Método precioFinal exclusivo clase Televisor. */
	public double precioFinal(char letra, double peso, double resolucion, double precioBase) {

		/*
		 * Según la resolución de la televisión incrementaremos su valor en un 30% o no.
		 */
		if (resolucion > 40) {
			precioBase = precioBase * 1.30;
		}

		/* Si la televisión dispone de sintonizador incrementaremos su precio en 50€ */
		if (sintonizador == true) {
			precioBase += 50;
		}

		/* Según el consumo del electrodoméstico incrementaremos su precio. */
		if (consumo == 'A') {
			precioBase += 100;
		} else if (consumo == 'B') {
			precioBase += 80;
		} else if (consumo == 'C') {
			precioBase += 60;
		} else if (consumo == 'D') {
			precioBase += 50;
		} else if (consumo == 'E') {
			precioBase += 30;
		} else if (consumo == 'F') {
			precioBase += 10;
		}

		/* Según el peso del electrodomestico , incrementaremos su valor */
		if (peso >= 0 && peso <= 19) {
			precioBase += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioBase += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioBase += 80;
		} else if (peso > 80) {
			precioBase += 100;
		}

		return precioBase;
	}

}
