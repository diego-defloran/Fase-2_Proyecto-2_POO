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
      }
      else if (opcion ==4){
          
      }
      }
      
       
    }
}
