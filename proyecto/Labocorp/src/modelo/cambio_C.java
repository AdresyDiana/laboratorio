package modelo;

/**
 *
 * @author Andrés Felipe Rincón Sánchez
 */
public class cambio_C {

    String inden;
    String tipo;
    String nombre;
    String apellido;
    String nuevoident;

    public cambio_C(String inden, String tipo, String nombre, String apellido, String nuevoident) {
        this.inden = inden;
        this.tipo = tipo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nuevoident = nuevoident;
    }

    public String getInden() {
        return inden;
    }

    public void setInden(String inden) {
        this.inden = inden;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNuevoident() {
        return nuevoident;
    }

    public void setNuevoident(String nuevoident) {
        this.nuevoident = nuevoident;
    }
    
    
}
