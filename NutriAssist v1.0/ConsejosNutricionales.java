//@author Elena Rodriguez
//Ultima modificación: 29/09/2021
//Clase madre ConsejosNutricionales, de ella heredan las clases de Agua, Carnes, Carbohidratos, FrutasVerduras, Azucares y Grasas

//Se modificó ConsejosNutricionales a una clase abstracta
abstract class ConsejosNutricionales implements FuncionalidadesConsejos{
	protected String nombre;
	protected String mensaje;
	protected int cantidad;
	
	public ConsejosNutricionales(String nom){
	//Constructor, recibe como parámetro el nombre del tipo de alimento
		nombre = nom;
	}
	
	public String Bienvenida(){
	//Método que contiene el menú de consejos nutricionales, retorna el string con el menú 
		mensaje = "Bienvenido al segmento de consejos nutricionales\n"+
					"Seleccione la opcion que desea\n"+
					"1. Beneficios de consumir "+nombre+"\n"+
					"2. Ejemplos de "+nombre+"\n"+
					"3. Salir\n";
		return mensaje;
	}
	
	
	public double Calorias(int peso, int altura, int edad, int sexo){
	//Método de la clase madre que calcula las calorías para cada usuario según su peso, altura, edad y sexo. Devuelve el número de calorías. Se llama desde las clases hijas por eso es público
		double calorias =0;
		if(sexo==1){
			//Femenino
			calorias = ((655+(9.6*(peso/2.205))+(1.8*altura)-(4.7*edad))*1.375);
		} else if (sexo==2){
			calorias = ((66+(13.7*(peso/2.205))+(5*altura)-(6.75*edad))*1.375);
		}
		return calorias;
	}
	
	

	
}
	
