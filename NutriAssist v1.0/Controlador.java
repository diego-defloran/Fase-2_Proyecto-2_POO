public class Controlador {
    //Vista vista;
    static Recursos_interes recursos;
    public static void main(String[] args) {
        //Vista vista = new Vista();
        //vista.menu();
        recursos = new Recursos_interes();
        recursos.RecursosDeInteres();
        recursos.Desplegar();
    }
}