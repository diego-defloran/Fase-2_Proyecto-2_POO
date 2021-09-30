import com.csvreader.CsvWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javie
 */
public class Main {
    public static void main(String[] args){
      Vista vista = new Vista();CrearUsuario cu = new CrearUsuario();
      ConsejosNutricionales consejos = null;
      
      int opcion = 0;
      while (opcion != 4){
       opcion = vista.MenuGeneral();
       if (opcion ==1){
          if(cu.VerificarContraseña()){
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
          /// AQUI VA TU PARTE DEL CODIGO
          ConsejosNutricionales consejos = null;
          vista.menu();
          int peso = vista.Peso();
          int altura = vista.Altura(); 
          int edad = vista.Edad();
          int sexo = vista.Sexo();
       //Consejos nutricionales
          while(flag==true){
              String mensaje="";
              int opcionConsejo = vista.PrimerMensaje();
              int opcion2=0;
              if(opcionConsejo==1){
                  consejos = new Agua("AGUA");
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
               } else if(opcionConsejo==2){
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
    }
      }
      else if (opcion ==4){
          
      }
      }
      
       
    }
}
