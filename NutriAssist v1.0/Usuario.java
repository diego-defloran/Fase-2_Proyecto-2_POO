/*

 */

/**
 *
 * @author Javie
 */
public class Usuario {
    private String nombreUsuario, contrasena, correo, nombre, apellido;

    /**
     *
     * @param nombreusuario
     * @param contrasena
     * @param correo
     * @param nombre
     */
    public Usuario(String nombreusuario, String contrasena, String correo, String nombre){
        this.nombreUsuario = nombreusuario;
        this.contrasena = contrasena;
        this.correo = correo;
        this.nombre = nombre;
       
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
