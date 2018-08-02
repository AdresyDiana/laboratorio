package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author GLOBAL
 */
public class temp {

    private int noreporte;
    private String Tempmax;
    private String Tempmin;
    private String Tempp;
    private String Templm;
    private String Templmn;
    private String hummax;
    private String hummin;
    private String hump;
    private String humlm;
    private String humlmn;
    private Date finicio;
    private Date ffin;
    private String obser;
    private String tipodetoma;
    private String identificacion;
    private Time tinicio;
    private Time tfin;
    private String tc;
    private String tc2;
    private String c;

    SimpleDateFormat formato4 = new SimpleDateFormat("MM-dd-yy");

    public int getNoreporte() {
        return noreporte;
    }

    public void setNoreporte(int noreporte) {
        this.noreporte = noreporte;
    }

    public String getTempmax() {
        return Tempmax;
    }

    public void setTempmax(String Tempmax) {
        this.Tempmax = Tempmax;
    }

    public String getTempmin() {
        return Tempmin;
    }

    public void setTempmin(String Tempmin) {
        this.Tempmin = Tempmin;
    }

    public String getTempp() {
        return Tempp;
    }

    public void setTempp(String Tempp) {
        this.Tempp = Tempp;
    }

    public String getTemplm() {
        return Templm;
    }

    public void setTemplm(String Templm) {
        this.Templm = Templm;
    }

    public String getTemplmn() {
        return Templmn;
    }

    public void setTemplmn(String Templmn) {
        this.Templmn = Templmn;
    }

    public String getHummax() {
        return hummax;
    }

    public void setHummax(String hummax) {
        this.hummax = hummax;
    }

    public String getHummin() {
        return hummin;
    }

    public void setHummin(String hummin) {
        this.hummin = hummin;
    }

    public String getHump() {
        return hump;
    }

    public void setHump(String hump) {
        this.hump = hump;
    }

    public String getHumlm() {
        return humlm;
    }

    public void setHumlm(String humlm) {
        this.humlm = humlm;
    }

    public String getHumlmn() {
        return humlmn;
    }

    public void setHumlmn(String humlmn) {
        this.humlmn = humlmn;
    }

    public Date getFinicio() {
        return finicio;
    }

    public void setFinicio(Date finicio) {
        this.finicio = finicio;
    }

    public Date getFfin() {
        return ffin;
    }

    public void setFfin(Date ffin) {
        this.ffin = ffin;
    }

    public String getObser() {
        return obser;
    }

    public void setObser(String obser) {
        this.obser = obser;
    }

    public String getTipodetoma() {
        return tipodetoma;
    }

    public void setTipodetoma(String tipodetoma) {
        this.tipodetoma = tipodetoma;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Time getTinicio() {
        return tinicio;
    }

    public void setTinicio(Time tinicio) {
        this.tinicio = tinicio;
    }

    public Time getTfin() {
        return tfin;
    }

    public void setTfin(Time tfin) {
        this.tfin = tfin;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getTc2() {
        return tc2;
    }

    public void setTc2(String tc2) {
        this.tc2 = tc2;
    }

    @Override
    public String toString() {
        return "temp{" + "tipodetoma=" + tipodetoma + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final temp other = (temp) obj;
        if (this.noreporte != other.noreporte) {
            return false;
        }
        return true;
    }

    public Iterator<temp> listar() {
        ArrayList<temp> lostemp = new ArrayList<>();
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("SELECT * FROM temp");
            ResultSet rs = sql.executeQuery();
            temp unTemp;
            while (rs.next()) {
                unTemp = new temp();
                unTemp.setNoreporte(rs.getInt("noreporte"));
                unTemp.setTempmax(rs.getString("tempmax"));
                unTemp.setTempmin(rs.getString("tempmin"));
                unTemp.setTempp(rs.getString("tempp"));
                unTemp.setTemplm(rs.getString("templm"));
                unTemp.setTemplmn(rs.getString("templmn"));
                unTemp.setHummax(rs.getString("hummax"));
                unTemp.setHummin(rs.getString("hummin"));
                unTemp.setHump(rs.getString("hump"));
                unTemp.setHumlm(rs.getString("humlm"));
                unTemp.setHumlmn(rs.getString("humlmn"));
                unTemp.setFinicio(rs.getDate("finicio"));
                unTemp.setFfin(rs.getDate("ffin"));
                unTemp.setObser(rs.getString("obser"));
                unTemp.setTipodetoma(rs.getString("tipodetoma"));
                unTemp.setTinicio(rs.getTime("tinicio"));
                unTemp.setTfin(rs.getTime("tfin"));
                
                c = formato4.format(unTemp.getFinicio());
                c = c.replace('-', '/');
                
                unTemp.setTc(c + " " + String.valueOf(unTemp.getTinicio()));
                unTemp.setTc2(String.valueOf(unTemp.getFfin()) + " " + String.valueOf(unTemp.getTfin()));
                lostemp.add(unTemp);
            }
        } catch (SQLException ex) {
            System.err.println("no se obtienen datos" + ex.getMessage());
        }
        if (lostemp.isEmpty()) {
            temp mitemp = new temp();
            mitemp.setTipodetoma("no hay registros");
            lostemp.add(mitemp);
        }
        return lostemp.iterator();
    }

    public void Insertar() {
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("INSERT INTO temp "
                    + "(tempmax, tempmin, tempp, templm, templmn,hummax, hummin, hump, humlm, humlmn, finicio, ffin, obser, tipodetoma,identificacion,tinicio,tfin) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            sql.setString(1, this.getTempmax());
            sql.setString(2, this.getTempmin());
            sql.setString(3, this.getTempp());
            sql.setString(4, this.getTemplm());
            sql.setString(5, this.getTemplmn());
            sql.setString(6, this.getHummax());
            sql.setString(7, this.getHummin());
            sql.setString(8, this.getHump());
            sql.setString(9, this.getHumlm());
            sql.setString(10, this.getHumlmn());
            sql.setDate(11, this.getFinicio());
            sql.setDate(12, this.getFfin());
            sql.setString(13, this.getObser());
            sql.setString(14, this.getTipodetoma());
            sql.setString(15, this.getIdentificacion());
            sql.setTime(16, this.getTinicio());
            sql.setTime(17, this.getTfin());

            //  identificacion
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName() + "Insertado Correctamente");
            JOptionPane.showMessageDialog(null, "Se ha insertado correctamente");
        } catch (SQLException ex) {
            System.err.println("Error al Insertar" + ex.getMessage());
        }
    }

}
