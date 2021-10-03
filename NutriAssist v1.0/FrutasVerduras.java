//@author Elena Rodriguez
//Ultima modificación: 29/09/2021
//Clase hija FrutasVerduras que hereda de clase madre ConsejosNutricionales

class FrutasVerduras extends ConsejosNutricionales{
	String mensaje;
	//Constructor
	public FrutasVerduras(String nom){
		super(nom);
	}
	
	public String Beneficios(){
	//Método Beneficios en el que se utiliza overloading, retorna un String con la info
		mensaje = ("BENEFICIOS DE CONSUMIR "+nombre);
		mensaje = (mensaje+"1.Reducen los niveles de colesterol\n" +
			"2. Contribuyen a la eliminacion de toxinas\n"+
			"3. Cumplen funciones antivirales y antibacterianas\n"+
			"4. Nos ayudan a saciar el apetito\n");
		return mensaje;
	}
	
	public String Ejemplos(){
	//Método Beneficios en el que se utiliza overloading, se llaman a las clases privadas: Frutas y Verduras
		mensaje = ("ALGUNOS EJEMPLOS DE "+nombre);
		mensaje = mensaje+Frutas();
		mensaje = mensaje+Verduras();
		return mensaje;
	}
	
	private String Frutas(){
	//Método privado que retorna un string con ejemplos específicos	
		String frutas = ("\nFRUTAS\n"+
						"1.Sandia\n" +
						"2. Manzana\n"+
						"3. Banano\n"+
						"4. Papaya\n"+
						"5. Pera\n");
		return frutas;
	}
	
	private String Verduras(){
	//Método privado que retorna un string con ejemplos específicos	
		String verduras = ("\nVERDURAS\n"+
						"1.Zanahoria\n" +
						"2. Brocolo"+
						"3. Tomate"+
						"4. Pimiento"+
						"5. Cebolla");
		return verduras;
	}
	
	public String Cantidad(int peso, int altura, int edad, int sexo){
	//Método Cantidad, se utiliza overloading, retorna un string con la cantidad 
	//Se reciben como parámetros los datos del usuario, se llama al método de la clase madre Calorías y se utiliza para el cálculo en gramos de las frutas y verduras
		mensaje = ("CUANTO DEBO CONSUMIR DE "+nombre);
		double calorias = Calorias(peso, altura, edad, sexo);
		double cal = (((calorias*0.16)*100)/60);
		int total = (int) cal;
		mensaje = ("\nUsted debe consumir "+total+" gramos de frutas y verduras al día\n");
		return mensaje;
	}
}
