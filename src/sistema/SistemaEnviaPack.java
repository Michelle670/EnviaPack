package sistema;

import estructuras.ArbolBinarioBusqueda;
import estructuras.Cola;
import estructuras.ListaEnlazada;
import estructuras.Pila;
import modelo.Paquete;

/**
 * GRUPO 01 PARTICIPANTES: Genesis Delgado,Michelle Guerrero,Camila Marin y
 * Sofia Loaiza PROYECTO_EnvíaPACK:
 */
public class SistemaEnviaPack 
{
    private ListaEnlazada lista;
    private Cola cola;
    private Pila pila;
    private ArbolBinarioBusqueda arbolDestinos;
    private int codigoAuto = 1;

    public SistemaEnviaPack() 
    {
        lista = new ListaEnlazada();
        cola = new Cola();
        pila = new Pila();
        arbolDestinos = new ArbolBinarioBusqueda();
    }

    public ListaEnlazada getLista() 
    {
        return lista;
    }

    public Cola getCola() 
    {
        return cola;
    }

    public Pila getPila() 
    {
        return pila;
    }

    public int getCodigoAuto() 
    {
        return codigoAuto;
    }

    public ArbolBinarioBusqueda getArbolDestinos() 
    {
        return arbolDestinos;
    }
    
    public void incrementarCodigo()
    {
        codigoAuto++;
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
}
}
