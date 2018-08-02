package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrés Felipe Rincón Sánchez
 */
public class usuario_DAO {

    Connection con = conexion.connection;

    public int insertar(usuario_C user) throws Exception {
        String sql = "INSERT INTO usuario(identificacion, nombresus, apellidous, direccion, email, telefono, sexo, cargo, usuario, contrasena, rol,tipo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1, user.getInde());
        st.setString(2, user.getNombre());
        st.setString(3, user.getApellido());
        st.setString(4, user.getDirecc());
        st.setString(5, user.getEmail());
        st.setString(6, user.getTelef());
        st.setString(7, user.getGenero());
        st.setString(8, user.getCargo());
        st.setString(9, user.getUser());
        st.setString(10, user.getPassword());
        st.setString(11, user.getRol());
        st.setString(12, user.getTipo());

        int exe = st.executeUpdate();

        JOptionPane.showMessageDialog(null, "Éxito Al guardar");

        return exe;
    }

    public int modificar(usuario_C user) throws Exception {
        String sql = "UPDATE usuario SET nombresus=?, apellidous=?, direccion=?, email=?, telefono=?, sexo=?, cargo=?, usuario=?, contrasena=?, rol=? ,tipo= ? WHERE identificacion=?";
        PreparedStatement st = con.prepareStatement(sql);

        st.setString(1, user.getNombre());
        st.setString(2, user.getApellido());
        st.setString(3, user.getDirecc());
        st.setString(4, user.getEmail());
        st.setString(5, user.getTelef());
        st.setString(6, user.getGenero());
        st.setString(7, user.getCargo());
        st.setString(8, user.getUser());
        st.setString(9, user.getPassword());
        st.setString(10, user.getRol());
        st.setString(11, user.getTipo());
        st.setString(12, user.getInde());
        int exe = st.executeUpdate();

        JOptionPane.showMessageDialog(null, "Datos Actualizados");

        return exe;
    }

    public void buscar(usuario_C user) throws Exception {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM usuario where identificacion ='" + user.getInde() + "'");
        if (rs.next()) {
            user.setInde(rs.getString("identificacion"));
            user.setNombre(rs.getString("nombresus"));
            user.setApellido(rs.getString("apellidous"));
            user.setDirecc(rs.getString("direccion"));
            user.setEmail(rs.getString("email"));
            user.setTelef(rs.getString("telefono"));
            user.setGenero(rs.getString("sexo"));
            user.setCargo(rs.getString("cargo"));
            user.setUser(rs.getString("usuario"));
            user.setPassword("");
            user.setRol(rs.getString("rol"));
            user.setTipo(rs.getString("tipo"));
        } else {
            JOptionPane.showMessageDialog(null, "Registro Vacío");
        }

    }
}
