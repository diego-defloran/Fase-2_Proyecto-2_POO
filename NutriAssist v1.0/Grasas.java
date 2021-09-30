
class Grasas extends ConsejosNutricionales{
	String mensaje;
	//Constructor
	public Grasas(String nom){
		super(nom);
	}
	
	public String Beneficios(){
		mensaje = ("BENEFICIOS DE CONSUMIR "+nombre);
		mensaje = mensaje+"\n1.Protegen los organos vitales\n" +
			"2. Proporcionan energia\n"+
			"3. Absorben vitaminas"+
			"4. Regulan la temperatura temporal"+
			"\nOJO, CON MODERACION";
		return mensaje;
	}
	
	public String Ejemplos(){
		mensaje = ("ALGUNOS EJEMPLOS DE "+nombre);
		mensaje = mensaje+grasasSaturadas();
		mensaje = mensaje+grasasInsaturadas();
		return mensaje;
	}
	
	private String grasasSaturadas(){
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
		String grasas = ("\nGrasas Insaturadas\n"+
						"Prefiere las grasas Insaturadas\n"+
						"1.Aceite de oliva\n" +
						"2. Pescado\n"+
						"3. Frutos Secos\n"+
						"4. Aguacate\n"+
						"5. Aceitunas\n");
		return grasas;
	}
	
	public String Cantidad(int peso, int altura, int edad, int sexo){
		mensaje = ("CUANTO DEBO CONSUMIR DE "+nombre);
		double calorias = Calorias(peso, altura, edad, sexo);
		double cal = ((calorias*0.25)/9);
		int total = (int) cal;
		mensaje = ("\nUsted debe consumir "+total+" gramos de grasa\n");
		return mensaje;
	}
}