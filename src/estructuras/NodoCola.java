
package estructuras;

import modelo.Paquete;

/**
 * GRUPO 01 PARTICIPANTES: Genesis Delgado,Michelle Guerrero,Camila Marin y
 * Sofia Loaiza PROYECTO_EnvíaPACK:
 */
public class NodoCola {
    //==========================================================================
    //ATRIBUTO
    //==========================================================================
    private Paquete dato;
    private NodoCola siguiente;
    
    //==========================================================================
    //CONSTRUCTOR
    //==========================================================================

    public NodoCola() {
        this.dato = null;
        this.siguiente = null;
    }

    //==========================================================================
    // GET Y SET
    //==========================================================================

    public Paquete getDato() {
        return dato;
    }

    public void setDato(Paquete dato) {
        this.dato = dato;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
    
}


