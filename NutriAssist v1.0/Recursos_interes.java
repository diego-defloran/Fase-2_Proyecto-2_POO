/**
 * 
 * @author Diego
 * @version 1.1
 */
/*NOTA: La clase Recursos_interes se tuvo que modificar para evitar problemas al compilar. El error del código original gira entorno al UTF-8. Revisar y modificar para segunda entrega*/

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursos_interes{
    private int opcion;
    private Desktop d;
    private URI a;
    Scanner scan = new Scanner(System.in);
    private String encabezado = "######    ####     ####    ##  ##   ######    #####    ####     #####\n" + 
  "##  ##  ##  ##   ##  ##   ##  ##    ##  ##  ##       ##  ##   ##\n" +
  "##      ######   ##       ##  ##    ##       #####   ##  ##    #####\n" +
  "##      ##       ##  ##   ##  ##    ##           ##  ##  ##        ##\n" +
 "####      #####    ####     ######  ####     ######    ####    ######\n";



    public void RecursosDeInteres() throws IOException, InputMismatchException{
        System.out.println(encabezado);
        System.out.println("A continuacion tendra a su disposicion una seria de paginas web relacionas con temas relevantes en materai de nutricion y salud.\n Cual desea visitar? Por favor copiar URL");
        System.out.println("1. Organizacion Panamericana de la Salud\n2. Organizaciones de las Naciones Unidas: Problemas Globales - Alimentos\n3. Organizacion de las Naciones Unidas: ODS No. 03 Salud y Bienestar\n4. Nutri Activa UVG\n5. Texas Heart Institute\n6. Salir");
        d = Desktop.getDesktop();
        try {
		opcion = scan.nextInt();
			if (opcion == 1){
				this.a = new URI("https://www.paho.org/es/temas/nutricion");
				d.browse(a);
				RecursosDeInteres();
			}
			else if (opcion == 2){
				this.a = new URI("https://www.un.org/es/global-issues/food");
				d.browse(a);
				RecursosDeInteres();
			}
			else if (opcion == 3){
				this.a = new URI("https://www.un.org/sustainabledevelopment/es/health/");
				d.browse(a);
				RecursosDeInteres();
			}
			else if (opcion == 4){
				this.a = new URI("https://www.uvg.edu.gt/servicios/nutriactiva/");
				d.browse(a);
				RecursosDeInteres();
			}
			else if (opcion == 5){
				this.a = new URI("https://www.texasheart.org/heart-health/heart-information-center/topics/nutricion/"); 
				d.browse(a);
				RecursosDeInteres();
			}
			else if (opcion == 6){
				Vista vista = new Vista();
				vista.MenuGeneral();
			}
			else if (opcion > 6 || opcion <= 0 ){
				RecursosDeInteres();
			}

        }
        catch (InputMismatchException | URISyntaxException t) {
            System.out.println("Uppp! Ha ocurrido un error");
            RecursosDeInteres();
        }

    }
}
