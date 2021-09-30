
class Azucares extends ConsejosNutricionales{
	String mensaje;
	//Constructor
	public Azucares(String nom){
		super(nom);
	}
	
	public String Beneficios(){
		mensaje = ("BENEFICIOS DE CONSUMIR "+nombre);
		mensaje =( mensaje+"Aporte de energia\n" +
			"2. Desarrollo de los tejidos\n"+
			"3. Permite reponer los depositos de glucogeno"+
			"4. Nutre el sistema nervioso");
		return mensaje;
	}
	
	public String Ejemplos(){
		mensaje = ("ALGUNOS EJEMPLOS DE "+nombre);
		mensaje = mensaje+Sacarosa();
		mensaje = mensaje+Fructosa();
		mensaje = mensaje+Lactosa();
		mensaje = mensaje+Almidon();
		return mensaje;
	}
	
	private String Sacarosa(){
		String sacarosa = ("\nSACAROSA\n"+
						"Tambien se conoce como azucar de mesa\n"+
						"1.Azucar morena\n" +
						"2. Azucar mascarbado\n"+
						"3. Azucar blanca\n"+
						"4.Frutas\n"+
						"Todos los productos que las contengan");
		return sacarosa;
	}
	
	private String Fructosa(){
		String fructosa = ("\nFRUCTOSA\n"+
						"1.Frutas\n" +
						"2. Cereales"+
						"3. Vegetales"+
						"4. Miel");
		return fructosa;
	}
	
	private String Lactosa(){
		String lactosa = ("\nLACTOSA\n"+
						"1.Leche y derivados");
		return lactosa;
	}
	
	private String Almidon(){
		String almidon = ("\nALMIDON\n"+
						"1.Arroz\n" +
						"2. Papa"+
						"3. Pastas"+
						"4. Harinas"+
						"5. Frijoles");
		return almidon;
	}
	
	
	public String Cantidad(int peso, int altura, int edad, int sexo){
		mensaje = ("CUANTO DEBO CONSUMIR DE "+nombre);
		double calorias = Calorias(peso, altura, edad, sexo);
		double cal = ((calorias*0.10)/4);
		int total = (int) cal;
		mensaje = ("\nUsted debe consumir "+total+" gramos de azucar al día\n");
		return mensaje;
	}
}