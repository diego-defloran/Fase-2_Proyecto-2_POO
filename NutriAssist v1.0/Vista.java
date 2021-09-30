import java.util.Scanner;

class Vista{
	private Scanner scan;
	private Scanner scanner = new Scanner(System.in);
	
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
	
	 /**
     *
     */
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
    public void Patron(){
        String Patron = "\n      /  \\        /  \\        /  \\        /  \\        /  \\        /  \\\n" +
"__/        \\__/        \\__/        \\__/        \\__/        \\__/       \n" +
"  \\        /  \\        /  \\        /  \\        /  \\        /  \\       \n" +
"     \\__/        \\__/        \\__/        \\__/        \\__/        \\__/";
        
        
       System.out.println(Patron);
    }
    
    /**
     *
     */
    public void CrearUsuario(){
        Patron();
        String registrate = "______ _____ _____ _____ _____ ___________  ___ _____ _____  \n" +
"| ___ \\  ___|  __ \\_   _/  ___|_   _| ___ \\/ _ \\_   _|  ___| \n" +
"| |_/ / |__ | |  \\/ | | \\ `--.  | | | |_/ / /_\\ \\| | | |__   \n" +
"|    /|  __|| | __  | |  `--. \\ | | |    /|  _  || | |  __|  \n" +
"| |\\ \\| |___| |_\\ \\_| |_/\\__/ / | | | |\\ \\| | | || | | |___  \n" +
"\\_| \\_\\____/ \\____/\\___/\\____/  \\_/ \\_| \\_\\_| |_/\\_/ \\____/  ";
       System.out.println("\n\n" + registrate);
        
    }
    
    /**
     *
     */
    public void IngresaNombre(){
        System.out.println("\n\nINGRESA TU NOMBRE: ");
    }
    
    /**
     *
     */
    public void IngresaApellido(){
        System.out.println("\nINGRESA TU APELLIDO ");
    }
    
    /**
     *
     */
    public void IngresaNombreUsuario(){
        System.out.println("\nINGRESA TU NOMBRE DE USUARIO ");
        
    }

    /**
     *
     */
    public void IngresaContraseña(){
        System.out.println("\nINGRESA TU CONTRASEÑA");
    }

    /**
     *
     */
    public void ConfirmarContraseña(){
        System.out.println("\nRepitetuContraseña");
    }

    /**
     *
     */
    public void IngresaCorreo(){
        System.out.println("\nINGREA TU CORREO");
    }

    /**
     *
     * @return
     */
    public String TomarDatos(){
        String dato = scanner.nextLine();
        return dato;
    }
    }

	
	
