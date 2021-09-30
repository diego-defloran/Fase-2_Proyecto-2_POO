import java.util.ArrayList;

public class Recursos_interes{
    public ArrayList<String> Recursos;
    int e;

    public void RecursosDeInteres(){
        Recursos = new ArrayList<String>();
        System.out.println("RECURSOS DE INTERÉS");
        Recursos.add("https://www.paho.org/es/temas/nutricion");
        Recursos.add("https://www.un.org/es/global-issues/food");
        Recursos.add("https://www.un.org/sustainabledevelopment/es/hunger/");
        Recursos.add("https://www1.undp.org/content/undp/es/home/sustainable-development-goals/goal-3-good-health-and-well-being.html");    
    }

    public void Desplegar() throws IndexOutOfBoundsException{
        try {
            System.out.println("A continuación se desplegará un listado con todos los hipervínculos de interés relacionados con su nutrición y salud.");
            for (int a =0; a<=Recursos.size(); a++){;
                System.out.println(Recursos.get(a));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("FINALIZADO!");
            //TODO: handle exception
        }

    }

}

