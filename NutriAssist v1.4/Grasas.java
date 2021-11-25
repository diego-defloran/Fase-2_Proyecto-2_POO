//@author Elena Rodriguez
//Ultima modificación: 29/09/2021
//Clase hija Grasas que hereda de clase madre ConsejosNutricionales

class Grasas extends ConsejosNutricionales{
	String mensaje;
	//Constructor
	public Grasas(String nom){
		super(nom);
	}
	
	public String Beneficios(){
	//Método Beneficios en el que se utiliza overloading, retorna un String con la info
		mensaje = ("BENEFICIOS DE CONSUMIR "+nombre);
		mensaje = mensaje+"\n1.Protegen los organos vitales\n" +
			"2. Proporcionan energia\n"+
			"3. Absorben vitaminas\n"+
			"4. Regulan la temperatura temporal\n"+
			"\nOJO, CON MODERACION\n";
		return mensaje;
	}
	
	public String Ejemplos(){
	//Método Beneficios en el que se utiliza overloading, se llaman a las clases privadas: grasasSaturadas, grasasInsaturadas
		mensaje = ("ALGUNOS EJEMPLOS DE "+nombre);
		mensaje = mensaje+grasasSaturadas();
		mensaje = mensaje+grasasInsaturadas();
		return mensaje;
	}
	
	private String grasasSaturadas(){
	//Método privado que retorna un string con ejemplos específicos
		String grasas = ("\nGrasas saturadas\n"+
						"Solidas a temperatura ambiente, debes consumir con moderacion\n"+
						"1.Manteca\n" +
						"2. Carnes rojas\n"+
						"3. Yema de huevo\n"+
						"4. Leche y sus derivados\n"+
						"5. Margarina\n");
		return grasas;
	}
	
	private String grasasInsaturadas(){
	//Método privado que retorna un string con ejemplos específicos
		String grasas = ("\nGrasas Insaturadas\n"+
						"Prefiere las grasas Insaturadas\n"+
						"1.Aceite de oliva\n" +
						"2. Pescado\n"+
						"3. Frutos Secos\n"+
						"4. Aguacate\n"+
						"5. Aceitunas\n");
		return grasas;
	}
	
	
}
