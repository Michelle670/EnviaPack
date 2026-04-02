//==============================================================================
//IMPORTES
//==============================================================================
package estructuras;
import modelo.Paquete;

/**
 * GRUPO 01 PARTICIPANTES: Genesis Delgado,Michelle Guerrero,Camila Marin y
 * Sofia Loaiza PROYECTO_EnvíaPACK:
 */
public class ListaPaquetesDestino 
{
  //============================================================================
  //ATRIBUTOS 
  //============================================================================
    private NodoPaqueteDestino inicio;
    private int tamanno;
  //============================================================================
  //CONSTRUCTOR
  //============================================================================  
    public ListaPaquetesDestino()
    {
        this.inicio = null;
        this.tamanno = 0;
    }
  //============================================================================
  // METODOS
  //============================================================================ 
  //****************************************************************************
  //============================================================================
  // METODO VACIA
  // Funciona para  verificar si el nodo esta vacio o tine datos ya
  //============================================================================ 
    public boolean vacia()
    {
        return inicio == null;
    }
  //============================================================================
  // METODO AGREGAR
  //
  //============================================================================ 
    public void agregar(Paquete p)
    {
        NodoPaqueteDestino nuevo = new NodoPaqueteDestino();
        nuevo.setDato(p);
        if (vacia()) 
        {
            inicio = nuevo;
        }else{
         NodoPaqueteDestino aux = inicio;
         while(aux.getSiguiente() != null)
         {
             aux = aux.getSiguiente();
         }
         aux.setSiguiente(nuevo);
        }
        tamanno++;
    }
  //============================================================================
  // METODO CANTIDAD
  //
  //============================================================================
    public int cantidad()
    {
        return tamanno;
    }
  //============================================================================
  // METODO OBTENER POR POSICION
  //
  //============================================================================
    public Paquete obtenerPorPosicion(int posicion)
    {
        int i = 0;
        NodoPaqueteDestino aux = inicio;
        while(aux != null)
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
  //============================================================================
  // METODO MOSTRAR
  //
  //============================================================================
    
    public String mostrar()
    {
        if (vacia()) 
        {
            return "(sin paquetes)";
        }
        String s ="";
        NodoPaqueteDestino aux = inicio;
        while(aux != null)
        {
            s += "EP-"+aux.getDato().getCodigo()+" "+aux.getDato().getDescripcion();
            if (aux.getSiguiente() != null) 
            {
                s += ", ";
            }
            aux = aux.getSiguiente();
        }
        return s;
    }
   
    
    
    
    
    
    
    
}
