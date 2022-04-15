package Class;

public class LavadoraClass extends ElectrodomesticoClass{
	// Atributos de clase
	protected double carga;

	// Constantes por defecto
	protected static final double CARGAF= 5;

	public LavadoraClass(double carga) {
		this.carga = carga;
	}

	public LavadoraClass() {
		this.carga = CARGAF;

	}

	public LavadoraClass(double precioBase, double peso) {
		super(precioBase, peso);

	}

	public LavadoraClass(double precioBase, String color, char consumo, double peso) {
		super(precioBase, color, consumo, peso);
		this.carga = CARGAF;

	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "LavadoraClass [carga=" + carga + "]";
	}


	public double precioFinal (double precioBase, String color, char consumo, double peso) {
		if (peso > 30) {
			precioBase = precioBase + 50;
			
		}		
		return precioBase;

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

	@Override
	public String comprobarColor(String color) {
		String colorCorrecto=COLORF;
		String [] colores = {"blanco", "negro", "rojo", "azul", "gris"};
		
		for(int i=0; i<colores.length;i++) {
			if(color.toLowerCase().equals(colores[i])) {
				colorCorrecto = color;
			}
		}	
		return colorCorrecto;
	}

	@Override
	public double precioFinal(char letra, double peso) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double precioFinal(char letra, double peso, double resolucion, double precioBase) {
		// TODO Auto-generated method stub
		return 0;
	}

}
