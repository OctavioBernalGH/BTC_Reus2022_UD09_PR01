package Class;

/*
 * @author:		Josep Oriol López Bosch / 	David Dalmau Dieguez / Octavio Bernal Vilana
 * @fecha:		14/04/2022
 * @versión:	0.0.1
 */

public abstract class ElectrodomesticoClass {
	
	//Constants
	protected static final String COLORF	="blanco";
	protected static final char  CONSUMOF	='F';
	protected static double PRECIOBASEF = 100;
	protected static double PESOF = 5;
	
	//Variables and defaults
	protected double precioBase = PRECIOBASEF;
	protected String color = COLORF;
	protected char consumo = CONSUMOF;
	protected double peso = PESOF;
	
	//Constructors
	public ElectrodomesticoClass() {}
	
	
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
	abstract public char comprobarConsumoEnergetico(char letra);
	abstract public String comprobarColor(String color);
	
	//TelevisorClass method
	public double precioFinal() {
		return 0;
	}


}
