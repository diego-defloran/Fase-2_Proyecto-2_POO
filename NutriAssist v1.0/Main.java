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
      //ConsejosNutricionales consejos = null; DeclaraciÃ³n se duplica en lÃ­nea 44
      
      int opcion = 0;
      boolean Acceso = false;
      boolean flag = true;
      while (opcion != 4){
       vista.Nutri();
       opcion = vista.MenuGeneral();
       if (opcion ==1){
          if(cu.VerificarContrasena()){
           System.out.println("ACCESO CONCEDIDO");
           Acceso = true;
       }
       else{
         System.out.println("ACCESO DENEGADO");  
         Acceso = false;
       }
          
      }
      else if( opcion == 2){
          cu.RegistrarUsarioYGuardarDatos();
      }
      else if (opcion == 3){
          //Se inicializa un atributo consejos de tipo ConsejosNutricionales, se inicializa como null ya que no se sabe que opciÃ³n eligirÃ¡ el usuario
          ConsejosNutricionales consejos = null;
         
       //Consejos nutricionales
          while(flag==true){
	//Se utiliza un ciclo para seguir preguntando a menos que el usuario seleccione la opciÃ³n de salir
              String mensaje="";
              int opcionConsejo = vista.PrimerMensaje(); //MenÃº de los tipos de alimentos de los que se ofrecen consejos
              int opcion2=0; //Se utiliza opcion2 para almacenar que tipo de consejo desea el usuario
              if(opcionConsejo==1){
		      //CONSEJOS SOBRE AGUA
                  consejos = new Agua("AGUA");
                  String m = consejos.Bienvenida(); //Se llama al mÃ©todo de la clase madre que contiene el String con el segundo menÃº de los tipos de consejos
                  opcion2 = vista.Pregunta2(m); //Mostrar y elegir que tipo de consejo
                  if(opcion2==1){
                      mensaje = consejos.Beneficios();
                  } else if(opcion2==2){
                      mensaje = consejos.Ejemplos();
                  }  else if (opcion2==3){
                      flag=false;
                      break; //Si el usuario selecciona la opciÃ³n de salir se rompe el ciclo 
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
                  } else if (opcion2==3){
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
                  }  else if (opcion2==3){
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
                  }  else if (opcion2==3){
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
		      } else if (opcion2==3){
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
		      } else if (opcion2==3){
			      flag=false;
			      break; 
		      }
		vista.Opcion(mensaje);
		}
		}
    } else if (opcion==4){
    	//Recursos de interes
        Recursos_interes r = new Recursos_interes();//Llamado al constructor de clase Recursos_interes
        r.RecursosDeInteres();//Emplear metodo RecursosDeInteres
      }

      else if(opcion == 5){
          if (Acceso){
              System.out.println("\nINFO NOTRICIONAL DEL USUARIO: " + cu.getNombreUsuarioActual());
              cu.Datos();
          }

          else{
              System.out.println("\nDEBES INGRESAR EN TU CUENTA PARA VER LA INFORMACION NUTRICIONAL :(");
              System.out.println("\nPUEDES HACERLO DESDE EL MENU PRINCIPAL");
          }
      } 
      
      else if (opcion ==6) {
    	  new Seguimiento();//Llamado a constructor de Seguimiento para la generecion de graficas en beta
    	  System.out.println("Este apartado es una beta. Si desea colaborar con su opinión con respecto a esta funcionabilidad envie un\ncorreo a NutriAssist@gmail.com\nSu opinion nos interesa!");
    	  vista.MenuGeneral();
    	  
      }
	else if (opcion==7) {
    	  java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                  new InterfazConsejos().setVisible(true);
              }
          });
      }

      else if (opcion ==8){
          System.out.println("Gracias por utilizar NutriAssist. Vuelva pronto!");
          System.exit(0);
      }
      
       
    }
}
}
