
package estructuras;
import modelo.Paquete;

/**
 * GRUPO 01 PARTICIPANTES: Genesis Delgado,Michelle Guerrero,Camila Marin y
 * Sofia Loaiza PROYECTO_EnvíaPACK:
 */
public class Nodo {
    //==========================================================================
    //ATRIBUTO
    //==========================================================================
    private Paquete dato;
    private Nodo siguiente;

    
    //==========================================================================
    //CONSTRUCTOR
    //==========================================================================
    public Nodo() {
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

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
