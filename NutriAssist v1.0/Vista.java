import java.util.Scanner;

public class Vista {
	private Scanner scan;
	private Scanner scanner = new Scanner(System.in);
	
	public Vista(){
		//Constructor que inicia el scanner
		scan = new Scanner(System.in);
		
	}
	
	public int MenuGeneral(){
		/** 
		*Método MenuGeneral que le presenta las primeras opciones al usuario 
		*@return opcion int con el numero de la opcion
		*/
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				System.out.println("\n\nSeleccione que la opciÃ³n que le gustarÃ­a:\n" + "1. Ingresar\n"+"2. Registrarte\n"+"3. Consejos\n" +"4. Recursos de interes\n" +"5. Mostrar Info Nutricional personal\n" +"6. Seguimiento de hábitos (BETA)\n" + "7. Salir");
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2 || opcion==3|| opcion==4 || opcion==5 || opcion==6 || opcion==7){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	
	
    public void Nutri(){
       String nutri = "  _   _ _    _ _______ _____  _____              _____ _____ _____  _____ _______ \n" +
" | \\ | | |  | |__   __|  __ \\|_   _|      /\\    / ____/ ____|_   _|/ ____|__   __|\n" +
" |  \\| | |  | |  | |  | |__) | | |______ /  \\  | (___| (___   | | | (___    | |   \n" +
" | . ` | |  | |  | |  |  _  /  | |______/ /\\ \\  \\___ \\\\___ \\  | |  \\___ \\   | |   \n" +
" | |\\  | |__| |  | |  | | \\ \\ _| |_    / ____ \\ ____) |___) |_| |_ ____) |  | |   \n" +
" |_| \\_|\\____/   |_|  |_|  \\_\\_____|  /_/    \\_\\_____/_____/|_____|_____/   |_|  \n\n ";
       System.out.println(nutri);
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
			if (opcion==1 || opcion==2 || opcion==3){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public int Peso(){
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			System.out.println("\nIngrese su peso en libras\n");
			opcion = scan.nextInt();
			if (opcion>0){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public int Altura(){
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			System.out.println("\nIngrese su altura en cm\n");
			opcion = scan.nextInt();
			if (opcion>0){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public int Edad(){
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			System.out.println("\nIngrese su edad\n");
			opcion = scan.nextInt();
			if (opcion>0){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
	}
	
	public int Sexo(){
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			System.out.println("\nIngrese su sexo\n"+"1.Femenino\n"+"2.Masculino\n");
			opcion = scan.nextInt();
			if (opcion==1 || opcion ==2){
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
    public void IngresaContrasena(){
        System.out.println("\nINGRESA TU CONTRASEÃ‘A");
    }

    /**
     *
     */
    public void ConfirmarContrasena(){
        System.out.println("\nRepitetuContraseÃ±a");
    }

    /**
     *
     */
    public void IngresaCorreo(){
        System.out.println("\nINGRESA TU CORREO");
    }
	
    /**
     *
     */
    /*public void IngresaNombreUsuario(){
        System.out.println("\nINGRESA TU NOMBRE DE USUARIO ");
        
    }*/

    /**
     *
     */
    /*public void IngresaContrasena(){
        System.out.println("\nINGRESA TU CONTRASEÃ‘A");
    }*/

    /**
     *
     */
    /*public void ConfirmarContrasena(){
        System.out.println("\nRepitetuContraseÃ±a");
    }*/

    /**
     *
     */
    /*public void IngresaCorreo(){
        System.out.println("\nINGRESA TU CORREO");
    }*/

	/**
     *
     */
    public void IngresaPeso(){
        System.out.println("\nINGRESA TU PESO EN LB ");

    }

	/**
     *
     */
    public void IngresaConsumoAgua(){
        System.out.println("\nINGRESA LOS LT DE AGUA CONSUMIDOS AL DIA ");
    }
	/**
     *
     */
    public void IngresaEjercicio(){
      System.out.println("\nINGRESA LAS HORAS DE EJERICICO AL DIA");

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

	
	
