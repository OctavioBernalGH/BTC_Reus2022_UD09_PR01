package Class;

public class ElectrodomesticoClass {
	
	protected static final String COLORF	="blanco";
	protected static final char  CONSUMOF	='F';
	protected static double PRECIOBASEF = 100;
	protected static double PESOF = 5;
	
	protected double precioBase = PRECIOBASEF;
	protected String color = COLORF;
	protected char consumo = CONSUMOF;
	protected double peso = PESOF;
	



//Constructors
	public ElectrodomesticoClass() {
	}


	public ElectrodomesticoClass(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}


	public ElectrodomesticoClass(double precioBase, String color, char consumo, double peso) {
		super();
		//Transform the char to uppercase
		char charUpper = Character.toUpperCase(consumo);
		
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumo = comprobarConsumoEnergetico(charUpper);
		this.peso = peso;
	}
	
	
	
//Methods
	
	public static char comprobarConsumoEnergetico(char letra) {
		char letraCorrecta=CONSUMOF;
		char [] letras = {'A', 'B', 'C', 'D', 'E','F'};
		
		for(int i=0; i<letras.length; i++) {
			if(letra==letras[i]) {
				letraCorrecta=letra;
			}
		}
		
		return letraCorrecta;
	}
	public static String comprobarColor(String color) {
		String colorCorrecto=COLORF;
		String [] colores = {"blanco", "negro", "rojo", "azul", "gris"};
		
		for(int i=0; i<colores.length;i++) {
			if(color.toLowerCase().equals(colores[i])) {
				colorCorrecto = color;
			}
		}	
		return colorCorrecto;
	}

	public static double precioFinal(char letra, double peso) {
		double precioModificado = PRECIOBASEF;
		
		//Modify price depending the consumption
		switch(comprobarConsumoEnergetico(letra)) {
			case 'A':
				precioModificado = precioModificado + 100;
				break;
			case 'B':
				precioModificado = precioModificado + 80;
				break;
			case 'C':
				precioModificado = precioModificado + 60;
				break;
			case 'D':
				precioModificado = precioModificado + 50;
				break;
			case 'E':
				precioModificado = precioModificado + 30;
				break;
			case 'F':
				precioModificado = precioModificado + 10;
				break;
			default:
					break;
			}
	//Modify price depending the weight
			if(peso>=0 && peso<=19){
				precioModificado = precioModificado + 10;
				
			}else if(peso>=20 && peso<=49) {
				precioModificado = precioModificado + 50;
			}else if(peso>=50 && peso<=79) {
				precioModificado = precioModificado + 80;
			}else if(peso>=80) {
				precioModificado = precioModificado + 100;
			}
		
		return precioModificado;
	}

//Getter and setters

}
