/*

 */

/**
 *
 * @author Javie
 */
public class Usuario {
    private String nombreUsuario, contrasena, correo, nombre, apellido, peso, agua, ejercicio;

    /**
     *
     * @param nombreusuario
     * @param contrasena
     * @param correo
     * @param nombre
     */
    public Usuario(String nombreusuario, String contrasena, String correo, String nombre, String peso, String agua, String ejercicio){
        this.nombreUsuario = nombreusuario;
        this.contrasena = contrasena;
        this.correo = correo;
        this.nombre = nombre;
        this.peso = peso;
        this.agua = agua;
        this.ejercicio = ejercicio;
       
    }

    /**
     *
     * @return
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     *
     * @return
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     *
     * @return
     */
    public String getCorreo() {
        return correo;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @return
     */
    public String getPeso() {
        return peso;
    }

     /**
     *
     * @return
     */
    public String getAgua() {
        return agua;
    }

     /**
     *
     * @return
     */
    public String getEjercicio() {
        return ejercicio;
    }



    /**
     *
     * @param nombreUsuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     *
     * @param contrasena
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     *
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
