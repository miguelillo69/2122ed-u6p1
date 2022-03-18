package ed.miguel;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Miguel";
		p.apellido = "Castro";
		p.clase = "1º DAW";
		p.anyo = 2022; 
		
		System.out.println(p.toString());

	}

}
