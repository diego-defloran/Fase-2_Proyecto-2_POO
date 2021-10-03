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
    public boolean VerificarContraseña(){
        boolean acceso = false;
        vista.IngresaNombreUsuario();
        String nUsuario = vista.TomarDatos();
        vista.IngresaContraseña();
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
                    for (int b = 0; b < usuariosArray.size(); b++){
                        if (usuariosArray.get(b)[2].equals(contra)){
                           
                            acceso = true;
                            
                        } 

                    }
                }
                 
            }
            
         } catch (FileNotFoundException e){
             e.printStackTrace();
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
         vista.IngresaContraseña();
         String contraseña = vista.TomarDatos();
         vista.IngresaCorreo();
         String correo = vista.TomarDatos();
         Usuario usuario = new Usuario(nombreUsuario, contraseña, correo, nombre);
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
           
            
        }
        salidaCSV.endRecord();
        salidaCSV.close();
        
    } catch(IOException e){
        e.printStackTrace();
    }
        
    }
}
