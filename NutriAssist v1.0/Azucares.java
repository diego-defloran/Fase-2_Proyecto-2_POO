//@author Elena Rodriguez
//Ultima modificación: 29/09/2021
//Clase hija Azucares que hereda de clase madre ConsejosNutricionales

class Azucares extends ConsejosNutricionales{
	String mensaje;
	//Constructor
	public Azucares(String nom){
		super(nom);
	}
	
	
	//Método Beneficios en el que se utiliza overloading
	public String Beneficios(){
		mensaje = ("BENEFICIOS DE CONSUMIR "+nombre);
		mensaje =( mensaje+"Aporte de energia\n" +
			"2. Desarrollo de los tejidos\n"+
			"3. Permite reponer los depositos de glucogeno\n"+
			"4. Nutre el sistema nervioso\n");
		return mensaje;
	}
	
	
	//Método Beneficios en el que se utiliza overloading, se llaman a las clases privadas: Sacarosa, Fructosa, Lactosa y Almidon
	public String Ejemplos(){
		mensaje = ("ALGUNOS EJEMPLOS DE "+nombre);
		mensaje = mensaje+Sacarosa();
		mensaje = mensaje+Fructosa();
		mensaje = mensaje+Lactosa();
		mensaje = mensaje+Almidon();
		return mensaje;
	}
	
	
	//Método privado que retorna un string con ejemplos específicos	
	private String Sacarosa(){

		String sacarosa = ("\nSACAROSA\n"+
						"Tambien se conoce como azucar de mesa\n"+
						"1. Azucar morena\n" +
						"2. Azucar mascarbado\n"+
						"3. Azucar blanca\n"+
						"4. Frutas\n"+
						"Todos los productos que las contengan\n");
		return sacarosa;
	}
	
	
	//Método privado que provee ejemplos específicos
	private String Fructosa(){
		String fructosa = ("\nFRUCTOSA\n"+
						"1. Frutas\n" +
						"2. Cereales\n"+
						"3. Vegetales\n"+
						"4. Miel\n");
		return fructosa;
	}
	
	//Método privado que retorna un string con ejemplos específicos
	private String Lactosa(){
		String lactosa = ("\nLACTOSA\n"+
						"1. Leche y derivados\n");
		return lactosa;
	}
	
	
	//Método privado que retorna un string con ejemplos específicos
	private String Almidon(){
		String almidon = ("\nALMIDON\n"+
						"1. Arroz\n" +
						"2. Papa\n"+
						"3. Pastas\n"+
						"4. Harinas\n"+
						"5. Frijoles\n");
		return almidon;
	}
	
	//Método Cantidad, se utiliza overloading, retorna un string con la cantidad 
	//Se reciben como parámetros los datos del usuario, se llama al método de la clase madre Calorías y se utiliza para el cálculo en gramos de los azúcares
	public String Cantidad(int peso, int altura, int edad, int sexo){
		mensaje = ("CUANTO DEBO CONSUMIR DE "+nombre);
		double calorias = Calorias(peso, altura, edad, sexo);
		double cal = ((calorias*0.10)/4);
		int total = (int) cal;
		mensaje = ("\nUsted debe consumir "+total+" gramos de azucar al día\n");
		return mensaje;
	}
}
