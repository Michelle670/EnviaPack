/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author soloa
 */
public class Paquete {
    private int codigo;
    private String descripcion;
    private String tipoEnvio;
    private double peso;
    private String estado;

    public Paquete() {
        this.codigo = 0;
        this.descripcion = "";
        this.tipoEnvio = "";
        this.peso = 0;
        this.estado = "Registrado";
    }

    public Paquete(int codigo, String descripcion, String tipoEnvio, double peso, String estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipoEnvio = tipoEnvio;
        this.peso = peso;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
