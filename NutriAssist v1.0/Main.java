import com.csvreader.CsvWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Dulce Gonzales, Diego DeFloran, Elena Rodriguez, Javier Rucal 
 */
public class Main {
    public static void main(String[] args) throws InputMismatchException, IOException{
      Vista vista = new Vista();CrearUsuario cu = new CrearUsuario();
      //ConsejosNutricionales consejos = null; Declaración se duplica en línea 44
      
      int opcion = 0;
      boolean flag = true;
      while (opcion != 4){
       vista.Nutri();
       opcion = vista.MenuGeneral();
       if (opcion ==1){
          if(cu.VerificarContrasena()){
           System.out.println("ACCESO");
       }
       else{
         System.out.println("ACCESO DENEGADO");  
       }
          
      }
      else if( opcion == 2){
          cu.RegistrarUsarioYGuardarDatos();
      }
      else if (opcion == 3){
          //Se inicializa un atributo consejos de tipo ConsejosNutricionales, se inicializa como null ya que no se sabe que opción eligirá el usuario
          ConsejosNutricionales consejos = null;
          //vista.menu();
	  //Se piden los datos al usuario para realizar el cálculo de las calorías
          int peso = vista.Peso();
          int altura = vista.Altura(); 
          int edad = vista.Edad();
          int sexo = vista.Sexo();
       //Consejos nutricionales
          while(flag==true){
	//Se utiliza un ciclo para seguir preguntando a menos que el usuario seleccione la opción de salir
              String mensaje="";
              int opcionConsejo = vista.PrimerMensaje(); //Menú de los tipos de alimentos de los que se ofrecen consejos
              int opcion2=0; //Se utiliza opcion2 para almacenar que tipo de consejo desea el usuario
              if(opcionConsejo==1){
		      //CONSEJOS SOBRE AGUA
                  consejos = new Agua("AGUA");
                  String m = consejos.Bienvenida(); //Se llama al método de la clase madre que contiene el String con el segundo menú de los tipos de consejos
                  opcion2 = vista.Pregunta2(m); //Mostrar y elegir que tipo de consejo
                  if(opcion2==1){
                      mensaje = consejos.Beneficios();
                  } else if(opcion2==2){
                      mensaje = consejos.Ejemplos();
                  } else if(opcion2==3){
                      mensaje = consejos.Cantidad(peso,altura,edad,sexo);
                  } else if (opcion2==4){
                      flag=false;
                      break; //Si el usuario selecciona la opción de salir se rompe el ciclo 
                  }
               vista.Opcion(mensaje);
               } else if(opcionConsejo==2){
		      //CONSEJOS SOBRE GRASAS
                  consejos = new Grasas("GRASAS");
                  String m = consejos.Bienvenida();
                  opcion2 = vista.Pregunta2(m);
                  if(opcion2==1){
                      mensaje = consejos.Beneficios();
                  } else if(opcion2==2){
                      mensaje = consejos.Ejemplos();
                  } else if(opcion2==3){
                      mensaje = consejos.Cantidad(peso,altura,edad,sexo);
                  } else if (opcion2==4){
                      flag=false;
                      break; 
                  }
              vista.Opcion(mensaje);
              } else if(opcionConsejo==3){
		      //CONSEJOS SOBRE FRUTAS Y VERDURAS
                  consejos = new FrutasVerduras("FRUTAS Y VERDURAS");
                  String m = consejos.Bienvenida();
                  opcion2 = vista.Pregunta2(m);
                  if(opcion2==1){
                      mensaje = consejos.Beneficios();
                  } else if(opcion2==2){
                      mensaje = consejos.Ejemplos();
                  } else if(opcion2==3){
                      mensaje = consejos.Cantidad(peso,altura,edad,sexo);
                  } else if (opcion2==4){
                      flag=false;
                      break; 
				}
              vista.Opcion(mensaje);
              } else if(opcionConsejo==4){
		      //CONSEJOS SOBRE CARNES
                  consejos = new Carnes("CARNES");
                  String m = consejos.Bienvenida();
                  opcion2 = vista.Pregunta2(m);
                  if(opcion2==1){
                      mensaje = consejos.Beneficios();
                  } else if(opcion2==2){
                      mensaje = consejos.Ejemplos();
                  } else if(opcion2==3){
                      mensaje = consejos.Cantidad(peso,altura,edad,sexo);
                  } else if (opcion2==4){
                      flag=false;
                      break; 
                  }
		vista.Opcion(mensaje);
	      } else if(opcionConsejo==5){
		      //CONSEJOS SOBRE AZUCARES
		      consejos = new Azucares("AZUCARES");
		      String m = consejos.Bienvenida();
		      opcion2 = vista.Pregunta2(m);
		      if(opcion2==1){
			      mensaje = consejos.Beneficios();
		      } else if(opcion2==2){
			      mensaje = consejos.Ejemplos();
		      } else if(opcion2==3){
			      mensaje = consejos.Cantidad(peso,altura,edad,sexo);
		      } else if (opcion2==4){
			      flag=false;
			      break; 
		      }
		vista.Opcion(mensaje);
	      } else if(opcionConsejo==6){
		      //CONSEJOS SOBRE CARBOHIDRATOS
		      consejos = new Carbohidratos("CARBOHIDRATOS");
		      String m = consejos.Bienvenida();
		      opcion2 = vista.Pregunta2(m);
		      if(opcion2==1){
			      mensaje = consejos.Beneficios();
		      } else if(opcion2==2){
			      mensaje = consejos.Ejemplos();
		      } else if(opcion2==3){
			      mensaje = consejos.Cantidad(peso,altura,edad,sexo);
		      } else if (opcion2==4){
			      flag=false;
			      break; 
		      }
		vista.Opcion(mensaje);
		}
		}
    } else if (opcion==4){
        Recursos_interes r = new Recursos_interes();
        r.RecursosDeInteres();
      }

      else if (opcion ==5){
          System.out.println("Gracias por utilizar NutriAssist. Vuelva pronto!");
          System.exit(0);
      }
      
       
    }
}
}
