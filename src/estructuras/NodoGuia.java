
package estructuras;
import modelo.GuiaEnvio;

/**
 *
 * @author soloa
 */
public class NodoGuia {
    private GuiaEnvio dato;
    private NodoGuia siguiente;

    public NodoGuia() {
        this.siguiente = null;
    }

    public GuiaEnvio getDato() {
        return dato;
    }

    public void setDato(GuiaEnvio dato) {
        this.dato = dato;
    }

    public NodoGuia getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoGuia siguiente) {
        this.siguiente = siguiente;
    }
}
