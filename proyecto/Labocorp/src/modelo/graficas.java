/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

/**
 *
 * @author GLOBAL
 */
public class graficas {

    private Date fechacre;
    private Date fechaterm;
    private FileInputStream grafic;
    private int tamaño;
    private FileInputStream grafic2;
    private int tamaño2;
    private String tpt;

    Connection con = conexion.connection;

    public Date getFechacre() {
        return fechacre;
    }

    public void setFechacre(Date fechacre) {
        this.fechacre = fechacre;
    }

    public Date getFechaterm() {
        return fechaterm;
    }

    public void setFechaterm(Date fechaterm) {
        this.fechaterm = fechaterm;
    }

    public FileInputStream getGrafic() {
        return grafic;
    }

    public void setGrafic(FileInputStream grafic) {
        this.grafic = grafic;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public FileInputStream getGrafic2() {
        return grafic2;
    }

    public void setGrafic2(FileInputStream grafic2) {
        this.grafic2 = grafic2;
    }

    public int getTamaño2() {
        return tamaño2;
    }

    public void setTamaño2(int tamaño2) {
        this.tamaño2 = tamaño2;
    }

    public String getTpt() {
        return tpt;
    }

    public void setTpt(String tpt) {
        this.tpt = tpt;
    }

    public void insertar() {

        try {

            if (tpt.equals("Nevera")) {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("Select From graficas WHERE fechacre ='" + getFechacre() + "'"+"AND tipotoma='"+getTpt()+"'");
                if (rs.next()) {
                    PreparedStatement sql = conexion.connection.prepareStatement("UPDATE graficas SET fechaterm=?, grafica=?,tipotoma=? where fechacre ='" + fechacre + "'"+"AND tipotoma='"+tpt+"'");
                    sql.setDate(1, getFechaterm());
                    sql.setBinaryStream(2, this.getGrafic(), this.getTamaño());
                    sql.setString(3, getTpt());
                    sql.executeUpdate();
                    
                }else{
                    PreparedStatement sql = conexion.connection.prepareStatement("INSERT INTO graficas "
                        + "(fechacre, fechaterm, grafica, tipotoma)"
                        + " VALUES (?,?,?,?)");
                sql.setDate(1, getFechacre());
                sql.setDate(2, getFechaterm());
                sql.setBinaryStream(3, this.getGrafic(), this.getTamaño());
                sql.setString(4, getTpt());
                sql.executeUpdate();
                }

                
            } else if (tpt.equals("Dataloyed")) {
                Statement st2 = con.createStatement();
                ResultSet rs2 = st2.executeQuery("Select From graficas WHERE fechacre ='" + getFechacre() + "'"+"AND tipotoma='"+getTpt()+"'");
                if (rs2.next()) {
                PreparedStatement sql = conexion.connection.prepareStatement("UPDATE graficas SET fechaterm=?, grafica=?, grafica2=?, tipotoma=? WHERE fechacre ='" + getFechacre() + "' AND tipotoma='"+getTpt()+"' ");
                sql.setDate(1, getFechaterm());
                sql.setBinaryStream(2, this.getGrafic(), this.getTamaño());
                sql.setBinaryStream(3, this.getGrafic2(), this.getTamaño2());
                sql.setString(4, getTpt());
                sql.executeUpdate();
                }else{
                    PreparedStatement sql = conexion.connection.prepareStatement("INSERT INTO graficas "
                        + "(fechacre, fechaterm, grafica, grafica2, tipotoma)"
                        + " VALUES (?,?,?,?,?)");
                sql.setDate(1, getFechacre());
                sql.setDate(2, getFechaterm());
                sql.setBinaryStream(3, this.getGrafic(), this.getTamaño());
                sql.setBinaryStream(4, this.getGrafic2(), this.getTamaño2());
                sql.setString(5, getTpt());
                sql.executeUpdate();
                }
                
            }

            JOptionPane.showMessageDialog(null, "Los datos fueron ingresados correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar " + this.getClass().getSimpleName() + ":" + ex.getMessage());
        }
    }
    
    public Iterator<graficas> buscar(Date busqueda, String tom) {
        ArrayList<graficas> lasgraficas = new ArrayList<>();
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("SELECT * FROM graficas WHERE fechacre = ? AND tipotoma = ?");
            sql.setDate(1, busqueda);
            sql.setString(2, tom);
            ResultSet rs = sql.executeQuery();
            graficas unagrafica = new graficas();

                if (rs.next()) {
                    unagrafica = new graficas();
                    unagrafica.setFechaterm(rs.getDate("fechaterm"));
                    lasgraficas.add(unagrafica);
                }else{
                    JOptionPane.showMessageDialog(null, "El registro no existe");
                }
           

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + ex.getMessage());
        }
        return lasgraficas.iterator();
    }

}
