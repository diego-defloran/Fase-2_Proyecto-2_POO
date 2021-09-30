import java.util.Scanner;

class Vista{
	private Scanner scan;
	
	public Vista(){
		//Constructor que inicia el scanner
		scan = new Scanner(System.in);
		
	}
	
	public int PrimerMensaje(){
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			System.out.println("\n\nSeleccione el tema del que desea mas informacion?\n" +
								"1. Agua\n"+
								"2. Grasas \n"+
								"3. Frutas y verduras\n"+
								"4. Carnes\n" +
								"5. Azucares\n"+
								"6. Carbohidratos\n");
			opcion = scan.nextInt();
			if (opcion==1 || opcion==2 || opcion==3 || opcion==4 || opcion==5 || opcion==6){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public int Pregunta2(String m){
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			System.out.println(m);
			opcion = scan.nextInt();
			if (opcion==1 || opcion==2 || opcion==3 || opcion==4){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	public void Opcion(String mensaje){
		System.out.println(mensaje);
	}
	}

	
	