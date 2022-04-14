package Class;

public class TelevisorClass extends ElectrodomesticoClass {

	/* Atributos de clase */
	protected double resolucion;
	protected boolean sintonizador;
	
	/* Constantes por defecto */
	protected final double RESOLUCIONF = 20.0;
	protected final boolean SINTONIZADORF = false;
	
	/* Constructor por defecto */
	public TelevisorClass() {
		this.resolucion = RESOLUCIONF;
		this.sintonizador = SINTONIZADORF;
	}
	
	
}
