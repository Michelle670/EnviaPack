/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author soloa
 */
public class GuiaEnvio 
{
    private int numeroGuia;
    private String descripcion;
    private String tipoEnvio;
    private String codigoSeguimiento;
    private String ciudadDestino;
    private String fechaGeneracion;

    public GuiaEnvio() {
        this.numeroGuia = 0;
        this.descripcion = "";
        this.tipoEnvio = "";
        this.codigoSeguimiento = "";
        this.ciudadDestino = "Pendiente";
        this.fechaGeneracion = "";
    }

    public int getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(int numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public String getCodigoSeguimiento() {
        return codigoSeguimiento;
    }

    public void setCodigoSeguimiento(String codigoSeguimiento) {
        this.codigoSeguimiento = codigoSeguimiento;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(String fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }
}
