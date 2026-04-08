//==============================================================================
//IMPORTES
//==============================================================================
package estructuras;
import modelo.Paquete;
/**
 * GRUPO 01 PARTICIPANTES: Genesis Delgado,Michelle Guerrero,Camila Marin y
 * Sofia Loaiza PROYECTO_EnvíaPACK:
 */
public class ListaEnlazada 
{
    private Nodo inicio;

    public ListaEnlazada() 
    {
        this.inicio = null;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public void insertar(Paquete paquete) 
    {
        Nodo nuevo = new Nodo();
        nuevo.setDato(paquete);

        if (vacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public Paquete buscar(int codigo) {
        Nodo aux = inicio;

        while (aux != null) {
            if (aux.getDato().getCodigo() == codigo) {
                return aux.getDato();
            }
            aux = aux.getSiguiente();
        }

        return null;
    }

    public boolean existeCodigo(int codigo) {
        Nodo aux = inicio;

        while (aux != null) {
            if (aux.getDato().getCodigo() == codigo) {
                return true;
            }
            aux = aux.getSiguiente();
        }

        return false;
    }

    public boolean editar(int codigo, String descripcion, String tipoEnvio, double peso) {
        Nodo aux = inicio;

        while (aux != null) {
            if (aux.getDato().getCodigo() == codigo) {
                aux.getDato().setDescripcion(descripcion);
                aux.getDato().setTipoEnvio(tipoEnvio);
                aux.getDato().setPeso(peso);
                return true;
            }
            aux = aux.getSiguiente();
        }

        return false;
    }

    public boolean eliminar(int codigo) {
        if (vacia()) {
            return false;
        }

        if (inicio.getDato().getCodigo() == codigo) {
            inicio = inicio.getSiguiente();
            return true;
        }

        Nodo aux = inicio;

        while (aux.getSiguiente() != null) {
            if (aux.getSiguiente().getDato().getCodigo() == codigo) {
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                return true;
            }
            aux = aux.getSiguiente();
        }

        return false;
    }

    public int cantidad() {
        int contador = 0;
        Nodo aux = inicio;

        while (aux != null) {
            contador++;
            aux = aux.getSiguiente();
        }

        return contador;
    }

    public Paquete obtenerPorPosicion(int posicion) {
        int i = 0;
        Nodo aux = inicio;

        while (aux != null) {
            if (i == posicion) {
                return aux.getDato();
            }
            i++;
            aux = aux.getSiguiente();
        }

        return null;
    }

  public Paquete buscarPorCodigo(int codigo) {
    Nodo aux = inicio;
    while (aux != null) {
        if (aux.getDato().getCodigo() == codigo) {
            return aux.getDato();
        }
        aux = aux.getSiguiente();
    }
    return null;
} 
}
