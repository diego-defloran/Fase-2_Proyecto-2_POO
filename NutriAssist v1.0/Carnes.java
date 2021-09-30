
class Carnes extends ConsejosNutricionales{
	String mensaje;
	//Constructor
	public Carnes(String nom){
		super(nom);
	}
	
	public String Beneficios(){
		mensaje = ("BENEFICIOS DE CONSUMIR "+nombre);
		mensaje =( mensaje+"1.Fuente de vitamina B12\n" +
			"2. Principal fuente de proteina\n"+
			"3. Fuente de hierrro"+
			"4. Contienen aminoacidos");
		return mensaje;
	}
	
	public String Ejemplos(){
		mensaje = ("ALGUNOS EJEMPLOS DE "+nombre);
		mensaje = mensaje+ CarnesRojas();
		mensaje = mensaje+ CarnesBlancas();
		return mensaje;
	}
	
	private String CarnesRojas(){
		String rojas = ("\nCARNES ROJAS\n"+
						"Estas proveen mas colesterol, por lo que no se deben consumir en exceso\n"+
						"1.Carne de ternera\n" +
						"2. Carne de cerdo\n"+
						"3. Carne de cabra\n"+
						"4. Carne de cordero\n"+
						"5. Carne de pato\n");
		return rojas;
	}
	
	private String CarnesBlancas(){
		String blancas = ("\nCARNES BLANCAS\n"+
						"Son mas faciles de digerir y contienen menos colesterol\n"+
						"1.Pollo\n" +
						"2. Pavo"+
						"3. Conejo"+
						"4. Carne de bacalao"+
						"5. Carne de gallo");
		return blancas;
	}
	
	public String Cantidad(int peso, int altura, int edad, int sexo){
		mensaje = ("CUANTO DEBO CONSUMIR DE "+nombre);
		double calorias = Calorias(peso, altura, edad, sexo);
		double cal = (((calorias*0.133)*100)/200);
		int total = (int) cal;
		mensaje = ("\nUsted debe consumir "+total+" gramos de carne al día\n");
		return mensaje;
	}
}