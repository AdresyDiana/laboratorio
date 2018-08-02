package modelo;

/**
 *
 * @author Andrés Felipe Rincón Sánchez
 */
public class usuario_C {

    String Inde;
    String nombre;
    String apellido;
    String direcc;
    String email;
    String telef;
    String genero;
    String cargo;
    String user;
    String password;
    String rol;
    String tipo;

    public usuario_C(String Inde, String nombre, String apellido, String direcc, String email, String telef, String genero, String cargo, String user, String password, String rol, String tipo) {
        this.Inde = Inde;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direcc = direcc;
        this.email = email;
        this.telef = telef;
        this.genero = genero;
        this.cargo = cargo;
        this.user = user;
        this.password = password;
        this.rol = rol;
        this.tipo = tipo;
    }

    public String getInde() {
        return Inde;
    }

    public void setInde(String Inde) {
        this.Inde = Inde;
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

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
