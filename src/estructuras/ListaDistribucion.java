//==============================================================================
//IMPORTES
//==============================================================================
package estructuras;
import modelo.Paquete;
/**
 * GRUPO 01 PARTICIPANTES: Genesis Delgado,Michelle Guerrero,Camila Marin y
 * Sofia Loaiza PROYECTO_EnvíaPACK:
 */
public class ListaDistribucion {
    
    //==========================================================================
    // ATRIBUTO
    //==========================================================================
    private NodoListaDistribucion inicio;

    //==========================================================================
    // CONSTRUCTOR
    //==========================================================================
    public ListaDistribucion() {
        this.inicio = null;
    }

    //==========================================================================
    // MÉTODOS
    //==========================================================================
    public boolean vacia() {
        return inicio == null;
    }

    //==========================================================================
    // METODO AGREGAR PAQUETE AL FINAL DE LA LISTA DE DISTRIBUCION
    //==========================================================================
    public void agregar(Paquete p) {
        NodoListaDistribucion nuevo = new NodoListaDistribucion();
        nuevo.setDato(p);

        if (vacia()) {
            inicio = nuevo;
        } else {
            NodoListaDistribucion aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    //==========================================================================
    // METODO BUSCAR PAQUETE POR CODIGO
    //==========================================================================
    public Paquete buscarPorCodigo(int codigo) {
        NodoListaDistribucion aux = inicio;
        while (aux != null) {
            if (aux.getDato().getCodigo() == codigo) {
                return aux.getDato();
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    //==========================================================================
    // METODO ACTUALIZAR ESTADO DE UN PAQUETE
    //==========================================================================
    public boolean actualizarEstado(int codigo, String nuevoEstado) {
        NodoListaDistribucion aux = inicio;
        while (aux != null) {
            if (aux.getDato().getCodigo() == codigo) {
                aux.getDato().setEstado(nuevoEstado);
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }
    
    //==========================================================================
    // METODO CONTAR TOTAL DE PAQUETES EN LA LISTA
    //==========================================================================
    public int cantidad() {
        int cont = 0;
        NodoListaDistribucion aux = inicio;
        while (aux != null) {
            cont++;
            aux = aux.getSiguiente();
        }
        return cont;
    }

    //==========================================================================
    // METODO OBTENER PAQUETE POR POSICION
    //==========================================================================
    public Paquete obtenerPorPosicion(int pos) {
        NodoListaDistribucion aux = inicio;
        int i = 0;
        while (aux != null) {
            if (i == pos) {
                return aux.getDato();
            }
            aux = aux.getSiguiente();
            i++;
        }
        return null;
    }

    //==========================================================================
    // METODO CONTAR PAQUETES POR ESTADO
    //==========================================================================
    public int contarPorEstado(String estado) {
        int cont = 0;
        NodoListaDistribucion aux = inicio;
        while (aux != null) {
            if (aux.getDato().getEstado().equals(estado)) {
                cont++;
            }
            aux = aux.getSiguiente();
        }
        return cont;
    }
}

