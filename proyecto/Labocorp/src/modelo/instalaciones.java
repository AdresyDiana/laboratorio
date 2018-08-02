package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author GLOBAL
 */
public class instalaciones {

    private int idinspeccion;
    private String area;
    private String identificacion;
    private Date fecharevision;
    private Time horaderevision;
    private String observacion;
    private String resultadoinspec;
    private String conversion;
    private SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM");

    public int getIdinspeccion() {
        return idinspeccion;
    }

    public void setIdinspeccion(int idinspeccion) {
        this.idinspeccion = idinspeccion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Date getFecharevision() {
        return fecharevision;
    }

    public void setFecharevision(Date fecharevision) {
        this.fecharevision = fecharevision;
    }

    public Time getHoraderevision() {
        return horaderevision;
    }

    public void setHoraderevision(Time horaderevision) {
        this.horaderevision = horaderevision;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getResultadoinspec() {
        return resultadoinspec;
    }

    public void setResultadoinspec(String resultadoinspec) {
        this.resultadoinspec = resultadoinspec;
    }

    @Override
    public String toString() {
        return "instalaciones{" + "area=" + area + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final instalaciones other = (instalaciones) obj;
        if (this.idinspeccion != other.idinspeccion) {
            return false;
        }
        return true;
    }

    public Iterator<instalaciones> listar() {

        ArrayList<instalaciones> losinstalaciones = new ArrayList<>();

        try {
            PreparedStatement sql = conexion.connection.prepareStatement("SELECT * FROM " + this.getClass().getSimpleName());
            ResultSet rs = sql.executeQuery();
            instalaciones unasInstalaciones;
            while (rs.next()) {
                unasInstalaciones = new instalaciones();
                unasInstalaciones.setIdinspeccion(rs.getInt("idinspeccion"));
                unasInstalaciones.setArea(rs.getString("area"));
                unasInstalaciones.setIdentificacion(rs.getString("identificacion"));
                unasInstalaciones.setFecharevision(rs.getDate("fecharevision"));
                unasInstalaciones.setHoraderevision(rs.getTime("horaderevision"));
                unasInstalaciones.setObservacion(rs.getString("obserinsta"));
                unasInstalaciones.setResultadoinspec(rs.getString("resulinsp"));
                losinstalaciones.add(unasInstalaciones);
            }
        } catch (SQLException ex) {
            System.err.println("no se obtienen datos" + ex.getMessage());
        }

        return losinstalaciones.iterator();

    }

    public void Guardar() {
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("INSERT INTO instalaciones" + "(area,identificacion,fecharevision,horaderevision,obserinsta,resulinsp) "
                    + "VALUES(?,?,?,?,?,?)");
            sql.setString(1, this.getArea());
            sql.setString(2, this.getIdentificacion());
            sql.setDate(3, this.getFecharevision());
            sql.setTime(4, this.getHoraderevision());
            sql.setString(5, this.getObservacion());
            sql.setString(6, this.getResultadoinspec());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insertado Correctamente");
            System.out.println(this.getClass().getSimpleName() + "Insertado Correctamente");
        } catch (SQLException ex) {
            System.err.println("Error al Insertar" + ex.getMessage());
        }
    }

}
