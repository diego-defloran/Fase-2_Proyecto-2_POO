//@author Elena Rodriguez
//Ultima modificación: 29/09/2021
//Clase hija Carnes que hereda de clase madre ConsejosNutricionales

class Carnes extends ConsejosNutricionales{
	String mensaje;
	//Constructor
	public Carnes(String nom){
		super(nom);
	}
	
	public String Beneficios(){
	//Método Beneficios en el que se utiliza overloading, retorna un string con la información
		mensaje = ("BENEFICIOS DE CONSUMIR "+nombre);
		mensaje =( mensaje+"1.Fuente de vitamina B12\n" +
			"2. Principal fuente de proteina\n"+
			"3. Fuente de hierro\n"+
			"4. Contienen aminoacidos\n");
		return mensaje;
	}
	
	public String Ejemplos(){
	//Método Beneficios en el que se utiliza overloading, se llaman a las clases privadas: CarnesRojas y CarnesBlancas. Retorna un String con la info
		mensaje = ("ALGUNOS EJEMPLOS DE "+nombre);
		mensaje = mensaje+ CarnesRojas();
		mensaje = mensaje+ CarnesBlancas();
		return mensaje;
	}
	
	private String CarnesRojas(){
	//Método privado que retorna un string con ejemplos específicos	
		String rojas = ("\nCARNES ROJAS\n"+
						"Estas proveen mas colesterol, por lo que no se deben consumir en exceso\n"+
						"1. Carne de ternera\n" +
						"2. Carne de cerdo\n"+
						"3. Carne de cabra\n"+
						"4. Carne de cordero\n"+
						"5. Carne de pato\n");
		return rojas;
	}
	
	private String CarnesBlancas(){
	//Método privado que retorna un string con ejemplos específicos	
		String blancas = ("\nCARNES BLANCAS\n"+
						"Son mas faciles de digerir y contienen menos colesterol\n"+
						"1.Pollo\n" +
						"2. Pavo\n"+
						"3. Conejo\n"+
						"4. Carne de bacalao\n"+
						"5. Carne de gallo\n");
		return blancas;
	}
	
	public String Cantidad(int peso, int altura, int edad, int sexo){
	//Método Cantidad, se utiliza overloading, retorna un string con la cantidad 
	//Se reciben como parámetros los datos del usuario, se llama al método de la clase madre Calorías y se utiliza para el cálculo en gramos de las carnes
		mensaje = ("CUANTO DEBO CONSUMIR DE "+nombre);
		double calorias = Calorias(peso, altura, edad, sexo);
		double cal = (((calorias*0.133)*100)/200);
		int total = (int) cal;
		mensaje = ("\nUsted debe consumir "+total+" gramos de carne al día\n");
		return mensaje;
	}
}
