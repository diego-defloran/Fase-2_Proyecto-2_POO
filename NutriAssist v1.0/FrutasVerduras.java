
class FrutasVerduras extends ConsejosNutricionales{
	String mensaje;
	//Constructor
	public FrutasVerduras(String nom){
		super(nom);
	}
	
	public String Beneficios(){
		mensaje = ("BENEFICIOS DE CONSUMIR "+nombre);
		mensaje = (mensaje+"1.Reducen los niveles de colesterol\n" +
			"2. Contribuyen a la eliminacion de toxinas\n"+
			"3. Cumplen funciones antivirales y antibacterianas"+
			"4. Nos ayudan a saciar el apetito");
		return mensaje;
	}
	
	public String Ejemplos(){
		mensaje = ("ALGUNOS EJEMPLOS DE "+nombre);
		mensaje = mensaje+Frutas();
		mensaje = mensaje+Verduras();
		return mensaje;
	}
	
	private String Frutas(){
		String frutas = ("\nFRUTAS\n"+
						"1.Sandia\n" +
						"2. Manzana\n"+
						"3. Banano\n"+
						"4. Papaya\n"+
						"5. Pera\n");
		return frutas;
	}
	
	private String Verduras(){
		String verduras = ("\nVERDURAS\n"+
						"1.Zanahoria\n" +
						"2. Brocolo"+
						"3. Tomate"+
						"4. Pimiento"+
						"5. Cebolla");
		return verduras;
	}
	
	public String Cantidad(int peso, int altura, int edad, int sexo){
		mensaje = ("CUANTO DEBO CONSUMIR DE "+nombre);
		double calorias = Calorias(peso, altura, edad, sexo);
		double cal = (((calorias*0.16)*100)/60);
		int total = (int) cal;
		mensaje = ("\nUsted debe consumir "+total+" gramos de frutas y verduras al día\n");
		return mensaje;
	}
}