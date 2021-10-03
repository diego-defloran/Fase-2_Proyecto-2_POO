//@author Elena Rodriguez
//Ultima modificación: 29/09/2021
//Clase hija Carbohidratos que hereda de clase madre ConsejosNutricionales

class Carbohidratos extends ConsejosNutricionales{
	String mensaje;
	//Constructor
	public Carbohidratos(String nom){
		super(nom);
	}
	
	public String Beneficios(){
	//Método Beneficios en el que se utiliza overloading
		mensaje = ("BENEFICIOS DE CONSUMIR "+nombre);
		mensaje =( mensaje+"\nPrincipal fuente de energia\n" +
			"2. Fuente de fibra\n"+
			"3. Mejoran los niveles de serotonina"+
			"4. Contienen filonutrientes cardioprotectores");
		return mensaje;
	}
	
	public String Ejemplos(){
	//Método Beneficios en el que se utiliza overloading
		mensaje = ("ALGUNOS EJEMPLOS DE "+nombre);
		mensaje = mensaje+("1.Hortalizas y frutas\n" +
						"2. Cereales, pan, pasta y arroz\n"+
						"3. Leche y productos lacteos\n"+
						"4. Frijoles, legumbres y lentejas\n"+
						"5. Verduras con almidon\n");
		return mensaje;
	}

	
	public String Cantidad(int peso, int altura, int edad, int sexo){
	//Método Cantidad, se utiliza overloading, retorna un string con la cantidad 
	//Se reciben como parámetros los datos del usuario, se llama al método de la clase madre Calorías y se utiliza para el cálculo en gramos de los carbohidratos
		mensaje = ("CUANTO DEBO CONSUMIR DE "+nombre);
		double calorias = Calorias(peso, altura, edad, sexo);
		double cal = (((calorias*0.133)*100)/200);
		int total = (int) cal;
		mensaje = ("\nUsted debe consumir "+total+" gramos carbohidratos al día\n");
		return mensaje;
	}
}
