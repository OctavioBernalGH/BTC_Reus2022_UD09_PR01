package Class;

public class ElectrodomesticoClass {
	
	protected final String COLORF	="blanco";
	protected final char  CONSUMOF	='F';
	protected double PRECIOBASEF = 100;
	protected double PESOF = 5;
	
	protected double precioBase = PRECIOBASEF;
	protected String color = COLORF;
	protected char consumo = CONSUMOF;
	protected double peso = PESOF;


//Constructors
	public ElectrodomesticoClass() {
		//Hola
	}


	public ElectrodomesticoClass(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}


	public ElectrodomesticoClass(double precioBase, String color, char consumo, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}
	
	
	
//Methods
	
	public static boolean comprobarConsumoEnergetico(char letra) {
		boolean flag = false;
		
		return flag;
	}
	public static boolean comprobarColor(String color) {
		boolean flag = false;
		
		return flag;
	}
	
	
//Getter and setters

}
