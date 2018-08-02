package modelo;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrés Felipe Rincón Sánchez
 */
public class reactivo_DAO {

    Connection con = conexion.connection;

    public int insertar(reactivo_C rect) throws Exception {

        String sql = "INSERT INTO reactivos(interno, nomreactivo, codfabricante, cas, marcafabricante, numlote, fechavencimiento, estado, cantidad, ubicacion, envase, clasifriesgo, certifalisis, hojaseguridad, observaciones,  sustcontrolada,identificacion,totalcomprado) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement st = con.prepareStatement(sql);

        st.setString(1, rect.getNum_interno());
        st.setString(2, rect.getNom_react());
        st.setString(3, rect.getCod_product());
        st.setString(4, rect.getCas());
        st.setString(5, rect.getMarca());
        st.setString(6, rect.getLote());
        st.setDate(7, (Date) rect.getFecha_vencimiento());
        st.setString(8, rect.getEstado_fisico());
        st.setString(9, rect.getCantidad());
        st.setString(10, rect.getUbicaion());
        st.setString(11, rect.getEnvase());
        st.setString(12, rect.getRiesgo());
        st.setString(13, rect.getAnalisis());
        st.setString(14, rect.getHoja_de_vida());
        st.setString(15, rect.getObs());
        st.setString(16, rect.getSustancia_controlada());
        st.setString(17, rect.getIdent());
        st.setString(18, rect.getCantidad());

        int exe = st.executeUpdate();

        JOptionPane.showMessageDialog(null, "Registro Guardado Con Éxito");

        return exe;
    }

    public int modificar(reactivo_C rect) throws Exception {
        String sql = "UPDATE reactivos SET nomreactivo=?, codfabricante=?, cas=?, marcafabricante=?, numlote=?, fechavencimiento=?, estado=?, cantidad=?, ubicacion=?, envase=?, clasifriesgo=?, certifalisis=?, hojaseguridad=?, observaciones=?,  sustcontrolada=?, totalcomprado=?,interno=? WHERE num=?";

        PreparedStatement st = con.prepareStatement(sql);

        st.setString(1, rect.getNom_react());
        st.setString(2, rect.getCod_product());
        st.setString(3, rect.getCas());
        st.setString(4, rect.getMarca());
        st.setString(5, rect.getLote());
        st.setDate(6, (Date) rect.getFecha_vencimiento());
        st.setString(7, rect.getEstado_fisico());
        st.setString(8, rect.getCantidad());
        st.setString(9, rect.getUbicaion());
        st.setString(10, rect.getEnvase());
        st.setString(11, rect.getRiesgo());
        st.setString(12, rect.getAnalisis());
        st.setString(13, rect.getHoja_de_vida());
        st.setString(14, rect.getObs());
        st.setString(15, rect.getSustancia_controlada());
        st.setString(16, rect.getCantidad());
        st.setString(17, rect.getNum_interno());
        st.setInt(18, rect.getDescuento());

        int exe = st.executeUpdate();

        JOptionPane.showMessageDialog(null, "Registro Modificado Con Éxito");

        return exe;
    }

    public void buscar(reactivo_C rect) throws Exception {
        String sql = "SELECT * FROM reactivos WHERE num ='" + rect.descuento + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if (rs.next()) {
            rect.setDescuento(rs.getInt("num"));
            rect.setNom_react(rs.getString("nomreactivo"));
            rect.setCod_product(rs.getString("codfabricante"));
            rect.setCas(rs.getString("cas"));
            rect.setMarca(rs.getString("marcafabricante"));
            rect.setLote(rs.getString("numlote"));
            rect.setFecha_vencimiento(rs.getDate("fechavencimiento"));
            rect.setEnvase(rs.getString("envase"));
            rect.setCantidad(rs.getString("cantidad"));
            rect.setUbicaion(rs.getString("ubicacion"));
            rect.setEstado_fisico(rs.getString("estado"));
            rect.setRiesgo(rs.getString("clasifriesgo"));
            rect.setAnalisis(rs.getString("certifalisis"));
            rect.setHoja_de_vida(rs.getString("hojaseguridad"));
            rect.setObs(rs.getString("observaciones"));
            rect.setSustancia_controlada(rs.getString("sustcontrolada"));

        } else {
            JOptionPane.showMessageDialog(null, "Registro Vacío");
        }
    }
}
