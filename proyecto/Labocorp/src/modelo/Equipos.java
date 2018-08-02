package modelo;

import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Fajardo Casas
 */
public class Equipos {

    private int nu;
    private String nomequipo;
    private String marcaequi;
    private String modeloequi;
    private String noserie;
    private String proveedorequi;
    private String area;
    private String placasena;
    private String contratono;
    private String garantiaequi;
    private String fechacompra;
    private String fechainicion;
    private String accesorios;
    private String frerecomante;
    private String frerecorevi;
    private String frerecocali;
    private String preventivoequi;
    private String verificacionequi;
    private String calibracionequi;
    private String descripcionacti;
    private String especificaciones;
    private String funcionequi;
    private String tempmax;
    private String tempmin;
    private String humax;
    private String humin;
    private String obserequi;
    private FileInputStream foto1;
    private int foto2;
    private String documentos;
    private String idioma;
    private String voltajemax;
    private String voltajemin;
    private String amperajemax;
    private String amperajemin;
    private String potenciamax;
    private String potenciamin;
    private String indet;

    public int getNu() {
        return nu;
    }

    public void setNu(int nu) {
        this.nu = nu;
    }

    public String getNomequipo() {
        return nomequipo;
    }

    public void setNomequipo(String nomequipo) {
        this.nomequipo = nomequipo;
    }

    public String getMarcaequi() {
        return marcaequi;
    }

    public void setMarcaequi(String marcaequi) {
        this.marcaequi = marcaequi;
    }

    public String getModeloequi() {
        return modeloequi;
    }

    public void setModeloequi(String modeloequi) {
        this.modeloequi = modeloequi;
    }

    public String getNoserie() {
        return noserie;
    }

    public void setNoserie(String noserie) {
        this.noserie = noserie;
    }

    public String getProveedorequi() {
        return proveedorequi;
    }

    public void setProveedorequi(String proveedorequi) {
        this.proveedorequi = proveedorequi;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPlacasena() {
        return placasena;
    }

    public void setPlacasena(String placasena) {
        this.placasena = placasena;
    }

    public String getContratono() {
        return contratono;
    }

    public void setContratono(String contratono) {
        this.contratono = contratono;
    }

    public String getGarantiaequi() {
        return garantiaequi;
    }

    public void setGarantiaequi(String garantiaequi) {
        this.garantiaequi = garantiaequi;
    }

    public String getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(String fechacompra) {
        this.fechacompra = fechacompra;
    }

    public String getFechainicion() {
        return fechainicion;
    }

    public void setFechainicion(String fechainicion) {
        this.fechainicion = fechainicion;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    public String getFrerecomante() {
        return frerecomante;
    }

    public void setFrerecomante(String frerecomante) {
        this.frerecomante = frerecomante;
    }

    public String getFrerecorevi() {
        return frerecorevi;
    }

    public void setFrerecorevi(String frerecorevi) {
        this.frerecorevi = frerecorevi;
    }

    public String getFrerecocali() {
        return frerecocali;
    }

    public void setFrerecocali(String frerecocali) {
        this.frerecocali = frerecocali;
    }

    public String getPreventivoequi() {
        return preventivoequi;
    }

    public void setPreventivoequi(String preventivoequi) {
        this.preventivoequi = preventivoequi;
    }

    public String getVerificacionequi() {
        return verificacionequi;
    }

    public void setVerificacionequi(String verificacionequi) {
        this.verificacionequi = verificacionequi;
    }

    public String getCalibracionequi() {
        return calibracionequi;
    }

    public void setCalibracionequi(String calibracionequi) {
        this.calibracionequi = calibracionequi;
    }

    public String getDescripcionacti() {
        return descripcionacti;
    }

    public void setDescripcionacti(String descripcionacti) {
        this.descripcionacti = descripcionacti;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    public String getFuncionequi() {
        return funcionequi;
    }

    public void setFuncionequi(String funcionequi) {
        this.funcionequi = funcionequi;
    }

    public String getTempmax() {
        return tempmax;
    }

    public void setTempmax(String tempmax) {
        this.tempmax = tempmax;
    }

    public String getTempmin() {
        return tempmin;
    }

    public void setTempmin(String tempmin) {
        this.tempmin = tempmin;
    }

    public String getHumax() {
        return humax;
    }

    public void setHumax(String humax) {
        this.humax = humax;
    }

    public String getHumin() {
        return humin;
    }

    public void setHumin(String humin) {
        this.humin = humin;
    }

    public String getObserequi() {
        return obserequi;
    }

    public void setObserequi(String obserequi) {
        this.obserequi = obserequi;
    }

    public FileInputStream getFoto1() {
        return foto1;
    }

    public void setFoto1(FileInputStream foto1) {
        this.foto1 = foto1;
    }

    public int getFoto2() {
        return foto2;
    }

    public void setFoto2(int foto2) {
        this.foto2 = foto2;
    }

    public String getDocumentos() {
        return documentos;
    }

    public void setDocumentos(String documentos) {
        this.documentos = documentos;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getVoltajemax() {
        return voltajemax;
    }

    public void setVoltajemax(String voltajemax) {
        this.voltajemax = voltajemax;
    }

    public String getVoltajemin() {
        return voltajemin;
    }

    public void setVoltajemin(String voltajemin) {
        this.voltajemin = voltajemin;
    }

    public String getAmperajemax() {
        return amperajemax;
    }

    public void setAmperajemax(String amperajemax) {
        this.amperajemax = amperajemax;
    }

    public String getAmperajemin() {
        return amperajemin;
    }

    public void setAmperajemin(String amperajemin) {
        this.amperajemin = amperajemin;
    }

    public String getPotenciamax() {
        return potenciamax;
    }

    public void setPotenciamax(String potenciamax) {
        this.potenciamax = potenciamax;
    }

    public String getPotenciamin() {
        return potenciamin;
    }

    public void setPotenciamin(String potenciamin) {
        this.potenciamin = potenciamin;
    }

    public String getIndet() {
        return indet;
    }

    public void setIndet(String indet) {
        this.indet = indet;
    }

    public Iterator<Equipos> listar() {
        ArrayList<Equipos> losEquipos = new ArrayList<>();
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("SELECT * FROM  equipos");
            ResultSet rs = sql.executeQuery();
            Equipos unEquipo;
            while (rs.next()) {
                unEquipo = new Equipos();
                unEquipo.setNu(rs.getInt("nu"));
                unEquipo.setNomequipo(rs.getString("nomequipo"));
                unEquipo.setMarcaequi(rs.getString("marcaequi"));
                unEquipo.setModeloequi(rs.getString("modeloequi"));
                unEquipo.setNoserie(rs.getString("noserie"));
                unEquipo.setProveedorequi(rs.getString("proveedorequi"));
                unEquipo.setArea(rs.getString("area"));
                unEquipo.setPlacasena(rs.getString("placasena"));
                unEquipo.setContratono(rs.getString("contratono"));
                unEquipo.setGarantiaequi(rs.getString("garantiaequi"));
                unEquipo.setFechacompra(rs.getString("fechacompra"));
                unEquipo.setFechainicion(rs.getString("fechainicion"));
                unEquipo.setAccesorios(rs.getString("accesorios"));
                unEquipo.setFrerecomante(rs.getString("frerecomante"));
                unEquipo.setFrerecorevi(rs.getString("frerecorevi"));
                unEquipo.setFrerecocali(rs.getString("frerecocali"));
                unEquipo.setPreventivoequi(rs.getString("preventivoequi"));
                unEquipo.setVerificacionequi(rs.getString("verificacionequi"));
                unEquipo.setCalibracionequi(rs.getString("calibracionequi"));
                unEquipo.setDescripcionacti(rs.getString("descripcionacti"));
                unEquipo.setEspecificaciones(rs.getString("especificaciones"));
                unEquipo.setFuncionequi(rs.getString("funcionequi"));
                unEquipo.setTempmax(rs.getString("tempmax"));
                unEquipo.setTempmin(rs.getString("tempmin"));
                unEquipo.setHumax(rs.getString("humax"));
                unEquipo.setHumin(rs.getString("humin"));
                unEquipo.setObserequi(rs.getString("obserequi"));
                unEquipo.setVoltajemax(rs.getString("voltajemax"));
                unEquipo.setVoltajemin(rs.getString("voltajemin"));
                unEquipo.setAmperajemax(rs.getString("amperajemax"));
                unEquipo.setAmperajemin(rs.getString("amperajemin"));
                unEquipo.setPotenciamax(rs.getString("potenciamax"));
                unEquipo.setPotenciamin(rs.getString("potenciamin"));
                losEquipos.add(unEquipo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar equipo: " + ex.getMessage());
        }
        if (losEquipos.isEmpty()) {
            Equipos miEquipo = new Equipos();
            miEquipo.setNomequipo("No hay equipo");
            losEquipos.add(miEquipo);
        }
        return losEquipos.iterator();
    }

    public void insertar() {
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("INSERT INTO equipos "
                    + "(nomequipo, marcaequi, modeloequi, noserie, proveedorequi, area, placasena, contratono, garantiaequi, fechacompra, fechainicion, accesorios, frerecomante, frerecorevi, frerecocali, preventivoequi, verificacionequi, calibracionequi, descripcionacti, especificaciones, funcionequi, tempmax, tempmin, humax, humin, obserequi, foto, voltajemax, voltajemin, amperajemax, amperajemin, potenciamax, potenciamin,identificacion)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            sql.setString(1, this.getNomequipo());
            sql.setString(2, this.getMarcaequi());
            sql.setString(3, this.getModeloequi());
            sql.setString(4, this.getNoserie());
            sql.setString(5, this.getProveedorequi());
            sql.setString(6, this.getArea());
            sql.setString(7, this.getPlacasena());
            sql.setString(8, this.getContratono());
            sql.setString(9, this.getGarantiaequi());
            sql.setString(10, this.getFechacompra());
            sql.setString(11, this.getFechainicion());
            sql.setString(12, this.getAccesorios());
            sql.setString(13, this.getFrerecomante());
            sql.setString(14, this.getFrerecorevi());
            sql.setString(15, this.getFrerecocali());
            sql.setString(16, this.getPreventivoequi());
            sql.setString(17, this.getVerificacionequi());
            sql.setString(18, this.getCalibracionequi());
            sql.setString(19, this.getDescripcionacti());
            sql.setString(20, this.getEspecificaciones());
            sql.setString(21, this.getFuncionequi());
            sql.setString(22, this.getTempmax());
            sql.setString(23, this.getTempmin());
            sql.setString(24, this.getHumax());
            sql.setString(25, this.getHumin());
            sql.setString(26, this.getObserequi());
            sql.setBinaryStream(27, this.getFoto1(), this.getFoto2());
            sql.setString(28, this.getVoltajemax());
            sql.setString(29, this.getVoltajemin());
            sql.setString(30, this.getAmperajemax());
            sql.setString(31, this.getAmperajemin());
            sql.setString(32, this.getPotenciamax());
            sql.setString(33, this.getPotenciamin());
            sql.setString(34, this.getIndet());
            System.out.println(this.getPotenciamax() + "\n" + this.getPotenciamin());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Los datos fueron ingresados correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar " + this.getClass().getSimpleName() + ":" + ex.getMessage());
        }
    }

    public void modificar() {
        if (this.getFoto1() == null || this.getFoto2() == 0) {
            try {
                PreparedStatement sql = conexion.connection.prepareStatement("UPDATE equipos SET nomequipo=?, marcaequi=?, modeloequi=?, noserie=?, proveedorequi=?, area=?, placasena=?, contratono=?, garantiaequi=?, fechacompra=?, fechainicion=?, accesorios=?, frerecomante=?, frerecorevi=?, frerecocali=?, preventivoequi=?, verificacionequi=?, calibracionequi=?, descripcionacti=?, especificaciones=?, funcionequi=?, tempmax=?, tempmin=?, humax=?, humin=?, obserequi=?, voltajemax=?, voltajemin=?, amperajemax=?, amperajemin=?, potenciamax=?, potenciamin=? WHERE nu=?");

                sql.setString(1, this.getNomequipo());
                sql.setString(2, this.getMarcaequi());
                sql.setString(3, this.getModeloequi());
                sql.setString(4, this.getNoserie());
                sql.setString(5, this.getProveedorequi());
                sql.setString(6, this.getArea());
                sql.setString(7, this.getPlacasena());
                sql.setString(8, this.getContratono());
                sql.setString(9, this.getGarantiaequi());
                sql.setString(10, this.getFechacompra());
                sql.setString(11, this.getFechainicion());
                sql.setString(12, this.getAccesorios());
                sql.setString(13, this.getFrerecomante());
                sql.setString(14, this.getFrerecorevi());
                sql.setString(15, this.getFrerecocali());
                sql.setString(16, this.getPreventivoequi());
                sql.setString(17, this.getVerificacionequi());
                sql.setString(18, this.getCalibracionequi());
                sql.setString(19, this.getDescripcionacti());
                sql.setString(20, this.getEspecificaciones());
                sql.setString(21, this.getFuncionequi());
                sql.setString(22, this.getTempmax());
                sql.setString(23, this.getTempmin());
                sql.setString(24, this.getHumax());
                sql.setString(25, this.getHumin());
                sql.setString(26, this.getObserequi());
                sql.setString(27, this.getVoltajemax());
                sql.setString(28, this.getVoltajemin());
                sql.setString(29, this.getAmperajemax());
                sql.setString(30, this.getAmperajemin());
                sql.setString(31, this.getPotenciamax());
                sql.setString(32, this.getPotenciamin());
                sql.setInt(33, this.getNu());
                System.out.println(this.getNu());
                sql.executeUpdate();
                JOptionPane.showMessageDialog(null, " " + this.getClass().getSimpleName() + " fue modificado correctamente");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al modificar1: " + ex.getMessage());
                System.out.println(ex);
            }
        } else {

            try {
                PreparedStatement sql = conexion.connection.prepareStatement("UPDATE equipos SET nomequipo=?, marcaequi=?, modeloequi=?, noserie=?, proveedorequi=?, area=?, placasena=?, contratono=?, garantiaequi=?, fechacompra=?, fechainicion=?, accesorios=?, frerecomante=?, frerecorevi=?, frerecocali=?, preventivoequi=?, verificacionequi=?, calibracionequi=?, descripcionacti=?, especificaciones=?, funcionequi=?, tempmax=?, tempmin=?, humax=?, humin=?, obserequi=?, foto=?, voltajemax=?, voltajemin=?, amperajemax=?, amperajemin=?, potenciamax=?, potenciamin=? WHERE nu=?");

                sql.setString(1, this.getNomequipo());
                sql.setString(2, this.getMarcaequi());
                sql.setString(3, this.getModeloequi());
                sql.setString(4, this.getNoserie());
                sql.setString(5, this.getProveedorequi());
                sql.setString(6, this.getArea());
                sql.setString(7, this.getPlacasena());
                sql.setString(8, this.getContratono());
                sql.setString(9, this.getGarantiaequi());
                sql.setString(10, this.getFechacompra());
                sql.setString(11, this.getFechainicion());
                sql.setString(12, this.getAccesorios());
                sql.setString(13, this.getFrerecomante());
                sql.setString(14, this.getFrerecorevi());
                sql.setString(15, this.getFrerecocali());
                sql.setString(16, this.getPreventivoequi());
                sql.setString(17, this.getVerificacionequi());
                sql.setString(18, this.getCalibracionequi());
                sql.setString(19, this.getDescripcionacti());
                sql.setString(20, this.getEspecificaciones());
                sql.setString(21, this.getFuncionequi());
                sql.setString(22, this.getTempmax());
                sql.setString(23, this.getTempmin());
                sql.setString(24, this.getHumax());
                sql.setString(25, this.getHumin());
                sql.setString(26, this.getObserequi());
                sql.setBinaryStream(27, this.getFoto1(), this.getFoto2());
                sql.setString(28, this.getVoltajemax());
                sql.setString(29, this.getVoltajemin());
                sql.setString(30, this.getAmperajemax());
                sql.setString(31, this.getAmperajemin());
                sql.setString(32, this.getPotenciamax());
                sql.setString(33, this.getPotenciamin());
                sql.setInt(34, this.getNu());
                sql.executeUpdate();
                JOptionPane.showMessageDialog(null, " " + this.getClass().getSimpleName() + " fue modificado correctamente");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al modificar: " + ex.getMessage());
            }
        }
    }

    public void eliminar() {
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("DELETE FROM equipos WHERE noserie = ? ");
            sql.setString(1, this.getNoserie());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Equipo eliminado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el equipo " + ex.getMessage());
        }
    }

    public Iterator<Equipos> buscar(String busqueda) {
        ArrayList<Equipos> losEquipos = new ArrayList<>();
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("SELECT * FROM equipos WHERE noserie = ?");
            sql.setString(1, busqueda);
            ResultSet rs = sql.executeQuery();
            Equipos unEquipos = new Equipos();
            rs.next();
            unEquipos.setNu(rs.getInt("nu"));
            unEquipos.setNomequipo(rs.getString("nomequipo"));
            unEquipos.setMarcaequi(rs.getString("marcaequi"));
            unEquipos.setModeloequi(rs.getString("modeloequi"));
            unEquipos.setNoserie(rs.getString("noserie"));
            unEquipos.setProveedorequi(rs.getString("proveedorequi"));
            unEquipos.setArea(rs.getString("area"));
            unEquipos.setPlacasena(rs.getString("placasena"));
            unEquipos.setContratono(rs.getString("contratono"));
            unEquipos.setGarantiaequi(rs.getString("garantiaequi"));
            unEquipos.setFechacompra(rs.getString("fechacompra"));
            unEquipos.setFechainicion(rs.getString("fechainicion"));
            unEquipos.setAccesorios(rs.getString("accesorios"));
            unEquipos.setFrerecomante(rs.getString("frerecomante"));
            unEquipos.setFrerecorevi(rs.getString("frerecorevi"));
            unEquipos.setFrerecocali(rs.getString("frerecocali"));
            unEquipos.setPreventivoequi(rs.getString("preventivoequi"));
            unEquipos.setVerificacionequi(rs.getString("verificacionequi"));
            unEquipos.setCalibracionequi(rs.getString("calibracionequi"));
            unEquipos.setDescripcionacti(rs.getString("descripcionacti"));
            unEquipos.setEspecificaciones(rs.getString("especificaciones"));
            unEquipos.setFuncionequi(rs.getString("funcionequi"));
            unEquipos.setTempmax(rs.getString("tempmax"));
            unEquipos.setTempmin(rs.getString("tempmin"));
            unEquipos.setHumax(rs.getString("humax"));
            unEquipos.setHumin(rs.getString("humin"));
            unEquipos.setObserequi(rs.getString("obserequi"));
            unEquipos.setVoltajemax(rs.getString("voltajemax"));
            unEquipos.setVoltajemin(rs.getString("voltajemin"));
            unEquipos.setAmperajemax(rs.getString("amperajemax"));
            unEquipos.setAmperajemin(rs.getString("amperajemin"));
            unEquipos.setPotenciamax(rs.getString("potenciamax"));
            unEquipos.setPotenciamin(rs.getString("potenciamin"));
            losEquipos.add(unEquipos);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + ex.getMessage());
        }
        return losEquipos.iterator();
    }

}
