package modelo;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Andrés Felipe Rincón Sánchez
 */
public class muestra_DAO {

    Connection con = conexion.connection;

    public int insertar(muestra_C must) throws Exception {
        String sql = "INSERT INTO custodia_muestra(numregistro, empresa, solicitante,  direccion,  municipio,   cargo,  telefono, email, nitcc, medio_recep, fecha_recep, cargo_lab, hora_recep, total_muestra, preservacion, descrip, recibio_muestra, obs_adicionales, area_evaluada, vereda, num_muestra, codigo_muestra, punto_muest, repons_toma, fecha_recolec, hora_recolec, tipo_muestra, volumen_muestra, analisis, obsMuestra, num_custodia, num_referencia, fecha_reporte, fecha_entrega_aprox, medio_entrega_repor, num_reporte, recib_report, fecha_entrega, obs, entregado, fecha_eliminacion, estado_cuenta,entrega_repor,identificacion) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement sc = con.prepareStatement(sql);
        sc.setString(1, must.getNumregistro());
        sc.setString(2, must.getEmpresa());
        sc.setString(3, must.getSolicitante());
        sc.setString(4, must.getDireccion());
        sc.setString(5, must.getMunicipio());
        sc.setString(6, must.getCargo());
        sc.setString(7, must.getTelefono());
        sc.setString(8, must.getEmail());
        sc.setString(9, must.getNitcc());

        sc.setString(10, must.getMedio_recep());
        sc.setString(11, must.getFecha_recep());
        sc.setString(12, must.getCargo_lab());
        sc.setString(13, must.getHora_recep());
        sc.setString(14, must.getTotal_muestra());
        sc.setString(15, must.getPreservacion());
        sc.setString(16, must.getDescrip());
        sc.setString(17, must.getRecibio_muestra());
        sc.setString(18, must.getObs_adicionales());

        sc.setString(19, must.getArea_evaluada());
        sc.setString(20, must.getVereda());
        sc.setString(21, must.getNum_muestra());
        sc.setString(22, must.getCodigo_muestra());
        sc.setString(23, must.getPunto_muest());
        sc.setString(24, must.getRepons_toma());
        sc.setString(25, must.getFecha_recolec());
        sc.setString(26, must.getHora_recolec());
        sc.setString(27, must.getTipo_muestra());
        sc.setString(28, must.getVolumen_muestra());
        sc.setString(29, must.getAnalisis());
        sc.setString(30, must.getObsMuestra());

        sc.setString(31, must.getNum_custodia());
        sc.setString(32, must.getNum_referencia());
        sc.setString(33, must.getFecha_reporte());
        sc.setString(34, must.getFecha_entrega_aprox());
        sc.setString(35, must.getMedio_entrega_repor());
        sc.setString(36, must.getNum_reporte());
        sc.setString(37, must.getRecib_report());
        sc.setString(38, must.getFecha_entrega());
        sc.setString(39, must.getObs());
        sc.setString(40, must.getEntregado());
        sc.setString(41, must.getFecha_eliminacion());
        sc.setString(42, must.getEstado_cuenta());
        sc.setString(43, must.getEntrega_repor());
        sc.setString(44, must.getIdent());

        int exe = sc.executeUpdate();

        JOptionPane.showMessageDialog(null, "Registro Guardado Con Éxito");

        return exe;

    }

    public int modificar(muestra_C must) throws Exception {
        String sql = "UPDATE custodia_muestra SET empresa=?, solicitante=?,  direccion=?,  municipio=?,   cargo=?,  telefono=?, email=?, nitcc=?, medio_recep=?, fecha_recep=?, cargo_lab=?, hora_recep=?, total_muestra=?, preservacion=?, descrip=?, recibio_muestra=?, obs_adicionales=?, area_evaluada=?, vereda=?, num_muestra=?, codigo_muestra=?, punto_muest=?, repons_toma=?, fecha_recolec=?, hora_recolec=?, tipo_muestra=?, volumen_muestra=?, analisis=?, obsMuestra=?, num_custodia=?, num_referencia=?, fecha_reporte=?, fecha_entrega_aprox=?, medio_entrega_repor=?, num_reporte=?, recib_report=?, fecha_entrega=?, obs=?, entregado=?, fecha_eliminacion=?, estado_cuenta=?, entrega_repor=? WHERE numregistro=?";
        PreparedStatement sc = con.prepareStatement(sql);

        sc.setString(1, must.getEmpresa());
        sc.setString(2, must.getSolicitante());
        sc.setString(3, must.getDireccion());
        sc.setString(4, must.getMunicipio());
        sc.setString(5, must.getCargo());
        sc.setString(6, must.getTelefono());
        sc.setString(7, must.getEmail());
        sc.setString(8, must.getNitcc());
        sc.setString(9, must.getMedio_recep());
        sc.setString(10, must.getFecha_recep());
        sc.setString(11, must.getCargo_lab());
        sc.setString(12, must.getHora_recep());
        sc.setString(13, must.getTotal_muestra());
        sc.setString(14, must.getPreservacion());
        sc.setString(15, must.getDescrip());
        sc.setString(16, must.getRecibio_muestra());
        sc.setString(17, must.getObs_adicionales());
        sc.setString(18, must.getArea_evaluada());
        sc.setString(19, must.getVereda());
        sc.setString(20, must.getNum_muestra());
        sc.setString(21, must.getCodigo_muestra());
        sc.setString(22, must.getPunto_muest());
        sc.setString(23, must.getRepons_toma());
        sc.setString(24, must.getFecha_recolec());
        sc.setString(25, must.getHora_recolec());
        sc.setString(26, must.getTipo_muestra());
        sc.setString(27, must.getVolumen_muestra());
        sc.setString(28, must.getAnalisis());
        sc.setString(29, must.getObsMuestra());
        sc.setString(30, must.getNum_custodia());
        sc.setString(31, must.getNum_referencia());
        sc.setString(32, must.getFecha_reporte());
        sc.setString(33, must.getFecha_entrega_aprox());
        sc.setString(34, must.getMedio_entrega_repor());
        sc.setString(35, must.getNum_reporte());
        sc.setString(36, must.getRecib_report());
        sc.setString(37, must.getFecha_entrega());
        sc.setString(38, must.getObs());
        sc.setString(39, must.getEntregado());
        sc.setString(40, must.getFecha_eliminacion());
        sc.setString(41, must.getEstado_cuenta());
        sc.setString(42, must.getEntrega_repor());
        sc.setString(43, must.getNumregistro());

        int exe = sc.executeUpdate();

        JOptionPane.showMessageDialog(null, "Registro Modificado Con Éxito");

        return exe;
    }

    public void buscar(muestra_C must) throws Exception {

        String sql = "select * from custodia_muestra where numregistro ='" + must.getNumregistro() + "' ";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if (rs.next()) {

            must.setNumregistro(rs.getString("numregistro"));
            must.setEmpresa(rs.getString("empresa"));
            must.setSolicitante(rs.getString("solicitante"));
            must.setDireccion(rs.getString("direccion"));
            must.setMunicipio(rs.getString("municipio"));
            must.setCargo(rs.getString("cargo"));
            must.setTelefono(rs.getString("telefono"));
            must.setEmail(rs.getString("email"));
            must.setNitcc(rs.getString("nitcc"));

            must.setMedio_recep(rs.getString("medio_recep"));
            must.setFecha_recep(rs.getString("fecha_recep"));
            must.setCargo_lab(rs.getString("cargo_lab"));
            must.setHora_recep(rs.getString("hora_recep"));
            must.setTotal_muestra(rs.getString("total_muestra"));
            must.setPreservacion(rs.getString("preservacion"));
            must.setDescrip(rs.getString("descrip"));
            must.setRecibio_muestra(rs.getString("recibio_muestra"));
            must.setObs_adicionales(rs.getString("obs_adicionales"));

            must.setArea_evaluada(rs.getString("area_evaluada"));
            must.setVereda(rs.getString("vereda"));
            must.setNum_muestra(rs.getString("num_muestra"));
            must.setCodigo_muestra(rs.getString("codigo_muestra"));
            must.setPunto_muest(rs.getString("punto_muest"));
            must.setRepons_toma(rs.getString("repons_toma"));
            must.setFecha_recolec(rs.getString("fecha_recolec"));
            must.setHora_recolec(rs.getString("hora_recolec"));
            must.setTipo_muestra(rs.getString("tipo_muestra"));
            must.setVolumen_muestra(rs.getString("volumen_muestra"));
            must.setAnalisis(rs.getString("analisis"));
            must.setObsMuestra(rs.getString("obsmuestra"));

            must.setNum_custodia(rs.getString("num_custodia"));
            must.setNum_referencia(rs.getString("num_referencia"));
            must.setFecha_reporte(rs.getString("fecha_reporte"));
            must.setFecha_entrega_aprox(rs.getString("fecha_entrega_aprox"));
            must.setMedio_entrega_repor(rs.getString("medio_entrega_repor"));
            must.setNum_reporte(rs.getString("num_reporte"));
            must.setRecib_report(rs.getString("recib_report"));
            must.setFecha_entrega(rs.getString("fecha_entrega"));
            must.setObs(rs.getString("obs"));
            must.setEntregado(rs.getString("entregado"));
            must.setFecha_eliminacion(rs.getString("fecha_eliminacion"));
            must.setEstado_cuenta(rs.getString("estado_cuenta"));
            must.setEntrega_repor(rs.getString("entrega_repor"));

        } else {
            JOptionPane.showMessageDialog(null, "Registro Vacío");
        }

    }
}
