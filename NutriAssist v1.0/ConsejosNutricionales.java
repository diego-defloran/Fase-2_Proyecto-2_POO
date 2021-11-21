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
	
	
	
	

	
}
	
