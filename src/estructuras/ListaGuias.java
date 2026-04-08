//==============================================================================
//IMPORTES
//==============================================================================
package estructuras;
import modelo.GuiaEnvio;
/**
 * GRUPO 01 PARTICIPANTES: Genesis Delgado,Michelle Guerrero,Camila Marin y
 * Sofia Loaiza PROYECTO_EnvíaPACK:
 */
public class ListaGuias 
{
    //==========================================================================
    //ATRIBUTO
    //==========================================================================
    private NodoGuia inicio;

    public ListaGuias() 
    {
        this.inicio = null;
    }

    public boolean vacia() 
    {
        return inicio == null;
    }

    public void insertar(GuiaEnvio guia)
    {
        NodoGuia nuevo = new NodoGuia();
        nuevo.setDato(guia);

        if (vacia()) 
        {
            inicio = nuevo;
        } else 
        {
            NodoGuia aux = inicio;
            while (aux.getSiguiente() != null) 
            {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public int cantidad() 
    {
        int contador = 0;
        NodoGuia aux = inicio;

        while (aux != null) 
        {
            contador++;
            aux = aux.getSiguiente();
        }

        return contador;
    }

    public GuiaEnvio obtenerPorPosicion(int posicion) 
    {
        int i = 0;
        NodoGuia aux = inicio;

        while (aux != null) 
        {
            if (i == posicion) 
            {
                return aux.getDato();
            }
            i++;
            aux = aux.getSiguiente();
        }

        return null;
    }
    
    public GuiaEnvio buscarPorCodigoSeguimiento(String codigo) 
    {
    NodoGuia aux = inicio;

    while (aux != null) 
    {
        if (aux.getDato().getCodigoSeguimiento().equalsIgnoreCase(codigo)) 
        {
            return aux.getDato();
        }
        aux = aux.getSiguiente();
    }

    return null;
}
    
}
