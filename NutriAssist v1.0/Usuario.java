/*

 */

/**
 *
 * @author Javie
 */
public class Usuario {
    private String nombreUsuario, contraseña, correo, nombre, apellido;

    /**
     *
     * @param nombreusuario
     * @param contraseña
     * @param correo
     * @param nombre
     */
    public Usuario(String nombreusuario, String contraseña, String correo, String nombre){
        this.nombreUsuario = nombreusuario;
        this.contraseña = contraseña;
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
    public String getContraseña() {
        return contraseña;
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
     * @param contraseña
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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
