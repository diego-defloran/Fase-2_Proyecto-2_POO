//@author Elena Rodriguez
class Agua extends ConsejosNutricionales{
	String mensaje;
	//Constructor
	public Agua(String nom){
		super(nom);
	}
	
	public String Beneficios(){
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
		mensaje = ("ALGUNOS EJEMPLOS DE "+nombre);
		mensaje = (mensaje+" \nTambien puedes tomar infusiones o aguas saborizadas, claro, sin azucar\n");
		return mensaje;
	}
	
	public String Cantidad(int peso, int altura, int edad, int sexo){
		mensaje = ("CUANTO DEBO CONSUMIR DE "+nombre);
		int agua = peso/16;
		mensaje = ("\nUsted debe tomar "+agua+" vasos de agua al dia\n");
		return mensaje;
	}
}
