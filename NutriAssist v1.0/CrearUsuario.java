
import com.csvreader.CsvWriter; 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
public class CrearUsuario {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        ArrayList<String[]> usuariosArray = new ArrayList<>();
        String[][] a;
        String nombreUsuarioActual;
        Vista vista = new Vista();
        
    /**
     *
     */
    public CrearUsuario(){
         
     }
     
    /**
     *
     * @return
     */
    public boolean VerificarContrasena(){
        boolean acceso = false;
        
        vista.IngresaNombreUsuario();
        String nUsuario = vista.TomarDatos();
        vista.IngresaContrasena();
        String contra = vista.TomarDatos();
         
         
         String archivo = "UsuariosRegistrados.csv";
         String line = "";
         try{
             BufferedReader br = new BufferedReader(new FileReader(archivo));
             while((line = br.readLine()) != null){
                 String[] values = line.split(",");
                 usuariosArray.add(values);
             }
             
 
            for (int a = 0; a < usuariosArray.size(); a++){
                if (usuariosArray.get(a)[1].equals(nUsuario)){
                    nombreUsuarioActual = nUsuario;
                    for (int b = 0; b < usuariosArray.size(); b++){
                        if (usuariosArray.get(b)[2].equals(contra)){
                           
                            acceso = true;
                            
                        } 

                    }
                }
                 
            }
            
         } catch (FileNotFoundException e){
             //e.printStackTrace();
             System.out.println("\n******ARCHIVO NO ENCONTRADO, CREE UN USUARIO*******\n");
         }catch (IOException e){
             e.printStackTrace();
         }
         
        return acceso;
     }
     
    /**
     *
     */
    public void RegistrarUsarioYGuardarDatos(){
         /// AQUI SE CREA EL USUARIO
         vista.CrearUsuario();
         vista.IngresaNombre();
         //String corregir = vista.TomarDatos();
         String nombre = vista.TomarDatos();
         vista.IngresaApellido();
         String apellido = vista.TomarDatos();
         vista.IngresaNombreUsuario();
         String nombreUsuario = vista.TomarDatos();
         vista.IngresaContrasena();
         String contrasena = vista.TomarDatos();
         vista.IngresaCorreo();
         String correo = vista.TomarDatos();
         vista.IngresaPeso();
         String pesoUsuario = vista.TomarDatos();
         vista.IngresaConsumoAgua();
         String Agua = vista.TomarDatos();
         vista.IngresaEjercicio();
         String ejercicio = vista.TomarDatos();
         Usuario usuario = new Usuario(nombreUsuario, contrasena, correo, nombre, pesoUsuario, Agua, ejercicio);
         usuarios.add(usuario);
         /// SE GUARDA LA INFORMACION EN UN CSV
         
         ExportarDatos(usuarios);
         
         
     }
     
    /**
     *
     * @param usuarios
     */
    public static void ExportarDatos(List<Usuario> usuarios){
        String archivo = "UsuariosRegistrados.csv";
    try{
        CsvWriter salidaCSV = new CsvWriter(new FileWriter(archivo, true), ',');
        
        
      //salidaCSV.write("NombrenUsuario");
      //salidaCSV.write("contrasena");
      //salidaCSV.write("correo");
      //salidaCSV.write("nombre");
      
        
        
      //salidaCSV.endRecord();
        salidaCSV.write("\n");
        for(Usuario user : usuarios){
            salidaCSV.write(user.getNombreUsuario());
            salidaCSV.write(user.getContrasena());
            salidaCSV.write(user.getCorreo());
            salidaCSV.write(user.getNombre());
            salidaCSV.write(user.getPeso());
            salidaCSV.write(user.getAgua());
            salidaCSV.write(user.getEjercicio());
            
        }
        salidaCSV.endRecord();
        salidaCSV.close();
        
    } catch(IOException e){
        e.printStackTrace();
    }
        
    }

    /**
     *
     * @param usuarios
     */
    public ArrayList<String[]> getUsuarioArray(){
        return usuariosArray;
    }

    public String getNombreUsuarioActual(){
        return nombreUsuarioActual;
    }

    public void Datos(){
        String pesoActual ="";
        String aguaActual = ",";
        String ejercicioActual = "hdf";
        for (int a = 0; a < usuariosArray.size(); a++){
            if (usuariosArray.get(a)[1].equals(nombreUsuarioActual)){
                pesoActual = usuariosArray.get(a)[5];
                aguaActual = usuariosArray.get(a)[6];
                ejercicioActual = usuariosArray.get(a)[7];
            }
             
        }
     
        String separador = "_,.-'~'-.,__,.-'~'-.,__,.-'~'-.,__,.-'~'-.,__,.-'~'-.,_";
        
String ejercicioDibujo = "           _( }\n" +
"   -=  _  <<  \\\n" +
"      `.\\__/`/\\\\\n" +
" -=     '--'\\\\  `\n" +
"      -=    //\n" +
"        \\)";

String infoNutricional = "    _____   ____________     _   ____  ____________  __________________  _   _____    __ \n" +
"   /  _/ | / / ____/ __ \\   / | / / / / /_  __/ __ \\/  _/ ____/  _/ __ \\/ | / /   |  / / \n" +
"   / //  |/ / /_  / / / /  /  |/ / / / / / / / /_/ // // /    / // / / /  |/ / /| | / /  \n" +
" _/ // /|  / __/ / /_/ /  / /|  / /_/ / / / / _, _// // /____/ // /_/ / /|  / ___ |/ /___\n" +
"/___/_/ |_/_/    \\____/  /_/ |_/\\____/ /_/ /_/ |_/___/\\____/___/\\____/_/ |_/_/  |_/_____/";

String aguaDibujo = " .-'\"\"\"`-.\n" +
"(         )\n" +
"|`-.___.-'|\n" +
"|.-'\"\"\"`-.|\n" +
"|         |\n" +
"|`-.___.-'|\n" +
"|         |\n" +
"|. ' \" ` .|\n" +
"|         |\n" +
" `-.___.-'   ";
String pesoDibujo = " /////////////\\\\\\\\\n" +
"(((((((((((((( \\\\\\\\\n" +
"))) ~~      ~~  (((\n" +
"((( (*)     (*) )))\n" +
")))     <       (((\n" +
"((( '\\______/`  )))\n" +
")))\\___________/(((\n" +
"       _) (_\n" +
"      / \\_/ \\";
        System.out.println(separador);
        System.out.println(infoNutricional);
        System.out.println("\n\nPESO ACTUAL : " + pesoActual + "lbs.");
        System.out.println(pesoDibujo);
        System.out.println("\nLTS DE AGUA: " + aguaActual + "lts.");
        System.out.println(aguaDibujo);
        System.out.println("\nHORA DE EJERCICIO ACTUALES: " + ejercicioActual + " HORAS.");
        System.out.println(ejercicioDibujo);
        System.out.println(separador);


    }


}
