package modelo;

import java.util.Date;

/**
 *
 * @author Andrés Felipe Rincón Sánchez
 */
public class reactivo_C {

    String num_interno;
    String nom_react;
    String cod_product;
    String cas;
    String marca;
    String lote;
    Date fecha_vencimiento;
    String sustancia_controlada;
    String envase;
    String cantidad;
    String ubicaion;
    String estado_fisico;
    String riesgo;
    String analisis;
    String hoja_de_vida;
    String obs;
    String ident;
    int descuento;

    public reactivo_C(String num_interno, String nom_react, String cod_product, String cas, String marca, String lote, Date fecha_vencimiento, String sustancia_controlada, String envase, String cantidad, String ubicaion, String estado_fisico, String riesgo, String analisis, String hoja_de_vida, String obs, String ident, int descuento) {
        this.num_interno = num_interno;
        this.nom_react = nom_react;
        this.cod_product = cod_product;
        this.cas = cas;
        this.marca = marca;
        this.lote = lote;
        this.fecha_vencimiento = fecha_vencimiento;
        this.sustancia_controlada = sustancia_controlada;
        this.envase = envase;
        this.cantidad = cantidad;
        this.ubicaion = ubicaion;
        this.estado_fisico = estado_fisico;
        this.riesgo = riesgo;
        this.analisis = analisis;
        this.hoja_de_vida = hoja_de_vida;
        this.obs = obs;
        this.ident = ident;
        this.descuento = descuento;
    }

    

    public String getNum_interno() {
        return num_interno;
    }

    public void setNum_interno(String num_interno) {
        this.num_interno = num_interno;
    }

    public String getNom_react() {
        return nom_react;
    }

    public void setNom_react(String nom_react) {
        this.nom_react = nom_react;
    }

    public String getCod_product() {
        return cod_product;
    }

    public void setCod_product(String cod_product) {
        this.cod_product = cod_product;
    }

    public String getCas() {
        return cas;
    }

    public void setCas(String cas) {
        this.cas = cas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getSustancia_controlada() {
        return sustancia_controlada;
    }

    public void setSustancia_controlada(String sustancia_controlada) {
        this.sustancia_controlada = sustancia_controlada;
    }

    public String getEnvase() {
        return envase;
    }

    public void setEnvase(String envase) {
        this.envase = envase;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getUbicaion() {
        return ubicaion;
    }

    public void setUbicaion(String ubicaion) {
        this.ubicaion = ubicaion;
    }

    public String getEstado_fisico() {
        return estado_fisico;
    }

    public void setEstado_fisico(String estado_fisico) {
        this.estado_fisico = estado_fisico;
    }

    public String getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
    }

    public String getAnalisis() {
        return analisis;
    }

    public void setAnalisis(String analisis) {
        this.analisis = analisis;
    }

    public String getHoja_de_vida() {
        return hoja_de_vida;
    }

    public void setHoja_de_vida(String hoja_de_vida) {
        this.hoja_de_vida = hoja_de_vida;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

}
