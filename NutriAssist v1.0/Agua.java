//@author Elena Rodriguez
//Ultima modificación: 29/09/2021
//Clase hija Agua que hereda de clase madre ConsejosNutricionales
class Agua extends ConsejosNutricionales{
	String mensaje;
	//Constructor
	public Agua(String nom){
		super(nom);
	}
	
	public String Beneficios(){
		//Método Beneficios se implementa overloading
		mensaje = ("BENEFICIOS DE CONSUMIR "+nombre);
		mensaje = mensaje+" \nLos beneficios de tomar agua\n" +
			"1.Alivia la fatiga\n" +
			"2. Evita el dolor de cabeza y las migrañas\n"+
			"3. Mejora la digestion"+
			"4. Mejora el sistema inmunologico"+
			"5. Hidrata la piel";
		return mensaje;
	}
	
	public String Ejemplos(){
		//Método Ejemplos se implementa overloading
		mensaje = ("ALGUNOS EJEMPLOS DE "+nombre);
		mensaje = (mensaje+" \nTambien puedes tomar infusiones o aguas saborizadas, claro, sin azucar\n");
		return mensaje;
	}
	
	
}
