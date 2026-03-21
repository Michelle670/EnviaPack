package estructuras;

import modelo.Paquete;

public class NodoPila {

    private Paquete dato;
    private NodoPila siguiente;

    public NodoPila() {
        dato = null;
        siguiente = null;
    }

    public Paquete getDato() {
        return dato;
    }

    public void setDato(Paquete dato) {
        this.dato = dato;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }

}
