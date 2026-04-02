
package estructuras;
//==============================================================================
//IMPORTES
//==============================================================================
import modelo.Paquete;
//==============================================================================
/**
 * GRUPO 01 PARTICIPANTES: Genesis Delgado,Michelle Guerrero,Camila Marin y
 * Sofia Loaiza PROYECTO_EnvíaPACK:
 */
public class NodoPaqueteDestino 
{
  //============================================================================
  //ATRIBUTOS 
  //============================================================================
     private Paquete dato;
     private NodoPaqueteDestino siguiente;
  //============================================================================
  //CONSTRUCTOR
  //============================================================================  
    public NodoPaqueteDestino() 
    {
        this.dato = null;
        this.siguiente = null;
    }
  //============================================================================
  // GET Y SET
  //============================================================================ 

    public Paquete getDato() 
    {
        return dato;
    }

    public void setDato(Paquete dato) 
    {
        this.dato = dato;
    }

    public NodoPaqueteDestino getSiguiente() 
    {
        return siguiente;
    }

    public void setSiguiente(NodoPaqueteDestino siguiente) 
    {
        this.siguiente = siguiente;
    }  
}
