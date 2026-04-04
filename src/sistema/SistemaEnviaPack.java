//==============================================================================
//IMPORTES
//==============================================================================
package sistema;

import estructuras.ArbolBinarioBusqueda;
import estructuras.Cola;
import estructuras.ListaEnlazada;
import estructuras.ListaDistribucion;
import estructuras.Pila;
import modelo.Paquete;
import estructuras.ListaGuias;

/**
 * GRUPO 01 PARTICIPANTES: Genesis Delgado,Michelle Guerrero,Camila Marin y
 * Sofia Loaiza PROYECTO_EnvíaPACK:
 */
public class SistemaEnviaPack {

    private ListaEnlazada lista;
    private Cola cola;
    private Pila pila;
    private ArbolBinarioBusqueda arbolDestinos;
    private int codigoAuto = 1;
    private ListaGuias listaGuias;
    private ListaDistribucion listaDistribucion;

    public SistemaEnviaPack() {
        lista = new ListaEnlazada();
        cola = new Cola();
        pila = new Pila();
        arbolDestinos = new ArbolBinarioBusqueda();
        listaGuias = new ListaGuias();
        listaDistribucion = new ListaDistribucion();
    }

    public ListaEnlazada getLista() {
        return lista;
    }

    public Cola getCola() {
        return cola;
    }

    public Pila getPila() {
        return pila;
    }

    public int getCodigoAuto() {
        return codigoAuto;
    }

    public ArbolBinarioBusqueda getArbolDestinos() {
        return arbolDestinos;
    }

    public ListaGuias getListaGuias() {
        return listaGuias;
    }

    public ListaDistribucion getListaDistribucion() {
        return listaDistribucion;

    }

    public void incrementarCodigo() {
        codigoAuto++;
    }

    //==========================================================================
    // MÉTODO DE DISTRIBUCIÓN
    //==========================================================================
    public void asignarDistribucion(int codigo, String ciudad, String direccion, String fecha, String repartidor) {
        Paquete p = lista.buscarPorCodigo(codigo);
        if (p != null) {
            p.setCiudadDestino(ciudad);
            p.setDireccionEntrega(direccion);
            p.setFechaEstimadaEntrega(fecha);
            p.setNombreRepartidor(repartidor);
            p.setEstado("En tránsito");
            listaDistribucion.agregar(p);
        }
    }

    public boolean actualizarEstado(int codigo, String nuevoEstado) {
        return listaDistribucion.actualizarEstado(codigo, nuevoEstado);
    }

    //==========================================================================
    //CARGAR DATOS DE PRUEBA
    //Carga los datos de paquetes para que para la defensa ya tengamos
    //datos arriba, para no meter uno por uno
    //==========================================================================
    public void cargarDatosPrueba() {
        // Paquetes de prueba
        Paquete p1 = new Paquete();
        p1.setCodigo(1);
        p1.setDescripcion("Documentos legales");
        p1.setTipoEnvio("Express");
        p1.setPeso(0.5);
        p1.setEstado("Registrado");
        lista.insertar(p1);

        Paquete p2 = new Paquete();
        p2.setCodigo(2);
        p2.setDescripcion("Ropa deportiva");
        p2.setTipoEnvio("Estándar");
        p2.setPeso(2.3);
        p2.setEstado("Registrado");
        lista.insertar(p2);

        Paquete p3 = new Paquete();
        p3.setCodigo(3);
        p3.setDescripcion("Laptop HP");
        p3.setTipoEnvio("Express");
        p3.setPeso(3.1);
        p3.setEstado("Registrado");
        lista.insertar(p3);

        Paquete p4 = new Paquete();
        p4.setCodigo(4);
        p4.setDescripcion("Libros universitarios");
        p4.setTipoEnvio("Internacional");
        p4.setPeso(4.8);
        p4.setEstado("Registrado");
        lista.insertar(p4);

        Paquete p5 = new Paquete();
        p5.setCodigo(5);
        p5.setDescripcion("Zapatos Nike");
        p5.setTipoEnvio("Estándar");
        p5.setPeso(1.2);
        p5.setEstado("Registrado");
        lista.insertar(p5);

        // Actualizar código auto para que el siguiente sea 6
        for (int i = 0; i < 5; i++) {
            incrementarCodigo();
        }

        // Destinos de prueba
        arbolDestinos.insertar("Heredia");
        arbolDestinos.insertar("Alajuela");
        arbolDestinos.insertar("San José");
        arbolDestinos.insertar("Cartago");
        arbolDestinos.insertar("Limón");

        //Destinos de prueba con paquetes 
        arbolDestinos.agregarPaquete("Heredia", p1);
        arbolDestinos.agregarPaquete("Alajuela", p2);
        arbolDestinos.agregarPaquete("San José", p3);
        arbolDestinos.agregarPaquete("Cartago", p4);
        arbolDestinos.agregarPaquete("Limón", p5);
    }

}
