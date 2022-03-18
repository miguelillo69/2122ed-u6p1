package ed.miguel;

public class Instituto {

	private static final int ANY = 2022;
	private static final String CICLE_FORMATIU = "1º DAW";
	private static final String COGNOMS_ALUMNE = "Castro";
	private static final String NOM_ALUMNE = "Miguel";

	public static void main(String[] args) {
		
		Alumno alumno = new Alumno();
		
		alumno.nombre = NOM_ALUMNE;
		alumno.apellido = COGNOMS_ALUMNE;
		alumno.clase = CICLE_FORMATIU;
		alumno.anyo = ANY; 
		
		System.out.println(alumno.toString());

	}

}
