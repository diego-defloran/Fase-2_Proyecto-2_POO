
/**
 *
 * @author Elena Rodriguez
 */
public class CalculadoraCantidades {
    
    protected String nombre;
    protected String mensaje;
    protected int cantidad;
	
    
    public String result;
    
    public void CalcularAgua(int peso, int altura, int edad, int sexo){
		//Método Cantidad se implementa overloading
		mensaje = ("CUANTO DEBO CONSUMIR DE "+nombre);
		int agua = peso/16;
                if(agua==0){
                    mensaje = "Ingresó valores incorrectos, por favor revise sus entradas";
                } else {
                    mensaje = ("\nUsted debe tomar "+agua+" vasos de agua al dia\n");
                }
		
		result = mensaje;
	}
    
    public void CalcularGrasas(int peso, int altura, int edad, int sexo){
	//Método Cantidad, se utiliza overloading, retorna un string con la cantidad 
	//Se reciben como parámetros los datos del usuario, se llama al método de la clase madre Calorías y se utiliza para el cálculo en gramos de las grasas
		mensaje = ("CUANTO DEBO CONSUMIR DE "+nombre);
		double calorias = Calorias(peso, altura, edad, sexo);
		double cal = ((calorias*0.25)/9);
		int total = (int) cal;
                if(total==0){
                    mensaje = "Ingresó valores incorrectos, por favor revise sus entradas";
                } else {
                    mensaje = ("\nUsted debe consumir "+total+" gramos de grasa\n");
                }
		
		result= mensaje;
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
    
    public void CalcularFV(int peso, int altura, int edad, int sexo){
	//Método Cantidad, se utiliza overloading, retorna un string con la cantidad 
	//Se reciben como parámetros los datos del usuario, se llama al método de la clase madre Calorías y se utiliza para el cálculo en gramos de las frutas y verduras
		mensaje = ("CUANTO DEBO CONSUMIR DE "+nombre);
		double calorias = Calorias(peso, altura, edad, sexo);
		double cal = (((calorias*0.16)*100)/60);
		int total = (int) cal;
                if(total==0){
                    mensaje = "Ingresó valores incorrectos, por favor revise sus entradas";
                } else {
                    mensaje = ("\nUsted debe consumir "+total+" gramos de frutas y verduras al día\n");
                }
		
		result = mensaje;
	}
    
    public void CalcularProteinas(int peso, int altura, int edad, int sexo){
	//Método Cantidad, se utiliza overloading, retorna un string con la cantidad 
	//Se reciben como parámetros los datos del usuario, se llama al método de la clase madre Calorías y se utiliza para el cálculo en gramos de las carnes
		mensaje = ("CUANTO DEBO CONSUMIR DE "+nombre);
		double calorias = Calorias(peso, altura, edad, sexo);
		double cal = (((calorias*0.133)*100)/200);
		int total = (int) cal;
                if(total==0){
                    mensaje = "Ingresó valores incorrectos, por favor revise sus entradas";
                } else {
                    mensaje = ("\nUsted debe consumir "+total+" gramos de proteinas al día\n");
                }
		
		result = mensaje;
	}
    
    public void CalcularAzucares(int peso, int altura, int edad, int sexo){
		mensaje = ("CUANTO DEBO CONSUMIR DE "+nombre);
		double calorias = Calorias(peso, altura, edad, sexo);
		double cal = ((calorias*0.10)/4);
		int total = (int) cal;
                if(total==0){
                    mensaje = "Ingresó valores incorrectos, por favor revise sus entradas";
                } else {
                    mensaje = ("\nUsted debe consumir "+total+" gramos de azucar al día\n");
                }
		
		result = mensaje;
	}
    
    public void CalcularCarbs(int peso, int altura, int edad, int sexo){
	//Método Cantidad, se utiliza overloading, retorna un string con la cantidad 
	//Se reciben como parámetros los datos del usuario, se llama al método de la clase madre Calorías y se utiliza para el cálculo en gramos de los carbohidratos
		mensaje = ("CUANTO DEBO CONSUMIR DE "+nombre);
		double calorias = Calorias(peso, altura, edad, sexo);
		double cal = (((calorias*0.133)*100)/200);
		int total = (int) cal;
                if(total==0){
                    mensaje = "Ingresó valores incorrectos, por favor revise sus entradas";
                } else {
                    mensaje = ("\nUsted debe consumir "+total+" gramos carbohidratos al día\n");
                }
		
		result = mensaje;
	}
}
