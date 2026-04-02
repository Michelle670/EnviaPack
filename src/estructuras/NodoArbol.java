//==============================================================================
//IMPORTES
//==============================================================================
package estructuras;
/**
 * GRUPO 01 PARTICIPANTES: Genesis Delgado,Michelle Guerrero,Camila Marin y
 * Sofia Loaiza PROYECTO_EnvíaPACK:
 */
public class NodoArbol 
{
  //============================================================================
  //ATRIBUTOS 
  //============================================================================
    private String destino;
    private ListaPaquetesDestino paquetes;
    private NodoArbol enlaceIzq,enlaceDer;
  //============================================================================
  //CONSTRUCTOR
  //============================================================================  

    public NodoArbol(String destino) 
    {
        this.destino = destino;
        this.paquetes = new ListaPaquetesDestino();
        this.enlaceIzq= null;
        this.enlaceDer = null;
    }
  //============================================================================
  // GET Y SET
  //============================================================================

    public String getDestino() 
    {
        return destino;
    }

    public void setDestino(String destino) 
    {
        this.destino = destino;
    }

    public ListaPaquetesDestino getPaquetes() 
    {
        return paquetes;
    }

    public void setPaquetes(ListaPaquetesDestino paquetes) 
    {
        this.paquetes = paquetes;
    }

    public NodoArbol getEnlaceIzq() 
    {
        return enlaceIzq;
    }

    public void setEnlaceIzq(NodoArbol enlaceIzq)
    {
        this.enlaceIzq = enlaceIzq;
    }

    public NodoArbol getEnlaceDer()
    {
        return enlaceDer;
    }

    public void setEnlaceDer(NodoArbol enlaceDer) 
    {
        this.enlaceDer = enlaceDer;
    }  
}
