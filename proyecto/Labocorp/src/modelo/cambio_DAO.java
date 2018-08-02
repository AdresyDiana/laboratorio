package modelo;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrés Felipe Rincón Sánchez
 */
public class cambio_DAO {

    public int modificar(cambio_C cmb) throws Exception {
        String sql = "UPDATE  usuario  set identificacion=?,tipo= ? WHERE (usuario.identificacion=?)";
        PreparedStatement st = conexion.connection.prepareStatement(sql);
        st.setString(1, cmb.getNuevoident());
        st.setString(2, cmb.getTipo());
        st.setString(3, cmb.getInden());
        
        int exe = st.executeUpdate();

        JOptionPane.showMessageDialog(null, "Datos Actualizados");

        return exe;
    }

    public void buscar(cambio_C cmb) throws Exception {

    }
}
