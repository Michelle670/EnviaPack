//==============================================================================
//IMPORTES
//==============================================================================
package estructuras;
import modelo.Paquete;
/**
 * GRUPO 01 PARTICIPANTES: Genesis Delgado,Michelle Guerrero,Camila Marin y
 * Sofia Loaiza PROYECTO_EnvíaPACK:
 */
public class NodoListaDistribucion {
    
    //==========================================================================
    //ATRIBUTO
    //==========================================================================
    private Paquete dato;
    private NodoListaDistribucion siguiente; 

    //==========================================================================
    //CONSTRUCTOR
    //==========================================================================
    public NodoListaDistribucion() {
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

    public NodoListaDistribucion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDistribucion siguiente) {
        this.siguiente = siguiente;
    }
}

