
class ConsejosNutricionales{
	protected String nombre;
	protected String mensaje;
	protected String pesoUsuario;
	protected int cantidad;
	
	public ConsejosNutricionales(String nom){
		nombre = nom;
	}
	
	public String Bienvenida(){
		mensaje = "Bienvenido al segmento de consejos nutricionales\n"+
					"Seleccione la opcion que desea\n"+
					"1.Beneficios de consumir "+nombre+"\n"+
					"2. Ejemplos de "+nombre+"\n"+
					"3. Cuanto debo consumir de "+nombre+"\n"+
					"4. Salir\n";
		return mensaje;
	}
	public String Beneficios(){
		mensaje = ("----BENEFICIOS DE CONSUMIR "+nombre+"----");
		return mensaje;
	}
	
	public String Ejemplos(){
		mensaje = ("ALGUNOS EJEMPLOS DE "+nombre);
		return mensaje;
	}
	
	public String Cantidad(int peso, int altura, int edad, int sexo){
		mensaje = ("CUANTO DEBO CONSUMIR DE "+nombre);
		return mensaje;
	}
	public double Calorias(int peso, int altura, int edad, int sexo){
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
	