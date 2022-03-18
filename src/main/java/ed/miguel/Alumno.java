package ed.miguel;

public class Alumno {
	
	
	public String nombre;
	public String apellido;
	public int anyo;
	public String clase;
	
	@Override
	public String toString() {
		
		return  "nombre = " + nombre + System.lineSeparator() +
				"apellido = " + apellido + System.lineSeparator() +
				"anyo = " + anyo + System.lineSeparator() +
				"clase = " + clase;
	}
}
