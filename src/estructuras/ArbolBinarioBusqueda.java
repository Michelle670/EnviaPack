//==============================================================================
//IMPORTES
//==============================================================================
package estructuras;

import modelo.Paquete;

/**
 * GRUPO 01 PARTICIPANTES: Genesis Delgado,Michelle Guerrero,Camila Marin y
 * Sofia Loaiza PROYECTO_EnvíaPACK:
 */
public class ArbolBinarioBusqueda 
{
  //============================================================================
  //ATRIBUTOS 
  //============================================================================
    private NodoArbol raiz;
  //============================================================================
  //CONSTRUCTOR
  //============================================================================

    public ArbolBinarioBusqueda() 
    {
        this.raiz = null;
    }
  //============================================================================
  //METODO VACIO
  //============================================================================  
    public boolean vacio()
    {
        return raiz == null;
    }
  //============================================================================
  // GET Y SET
  //============================================================================

    public NodoArbol getRaiz() 
    {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz)
    {
        this.raiz = raiz;
    }
  //============================================================================
  // METODOS
  //============================================================================ 
  //****************************************************************************
  //============================================================================
  // METODO INSERTAR DESTINO
  //
  //============================================================================
    private NodoArbol insertarRec(NodoArbol raiz,String destino)
    {
        if (raiz == null) 
        {
            return new NodoArbol(destino);
        }
        if (destino.compareTo(raiz.getDestino())<0) {
            raiz.setEnlaceIzq(insertarRec(raiz.getEnlaceIzq(),destino));
        }else if(destino.compareTo(raiz.getDestino())>0)
        {
            raiz.setEnlaceDer(insertarRec(raiz.getEnlaceDer(),destino));
        }
    //Si es igual, no inserta(no se repiten destinos)
    return raiz;   
    }
    
    public void insertar(String destino)
    {
        raiz = insertarRec(raiz,destino);
    }
  //============================================================================
  // METODO BUSCAR DESTINO
  //
  //============================================================================
  private NodoArbol buscarRec(NodoArbol raiz,String destino)
  {
      if (raiz == null) 
      {
        return null;  
      }
      if (raiz.getDestino().equals(destino)) 
      {
          return raiz;
      }
      if (destino.compareTo(raiz.getDestino())<0) 
      {
          return buscarRec(raiz.getEnlaceIzq(),destino);
      }else
      {
          return buscarRec(raiz.getEnlaceDer(),destino);
      }
  }
  
  public NodoArbol buscarDestino(String destino)
  {
      return buscarRec(raiz,destino);
  }
  //============================================================================
  // METODO AGREGAR PAQUETE A UN DESTINO
  //
  //============================================================================
   public boolean agregarPaquete(String destino,Paquete p)
   {
     NodoArbol nodo = buscarDestino(destino);
       if (nodo != null) 
       {
           nodo.getPaquetes().agregar(p);
           return true;
       }
       return false;
   } 
  //============================================================================
  // METODO BUSCAR PAQUETES POR DESTINO
  //
  //============================================================================
   public String buscarPaquetesPorDestino(String destino)
   {
       NodoArbol nodo = buscarDestino(destino);
       if (nodo != null) 
       {
           return "Paquetes en " + destino + ":" +nodo.getPaquetes().mostrar();
       }
       return "Destino no encontrado";
   }
  //============================================================================
  // METODO RECORRIDOS
  //
  //============================================================================  
    private String enOrden(NodoArbol n)
    {
        if (n == null) 
        {
            return "";
        }
        return enOrden(n.getEnlaceIzq())
                + n.getDestino() + " (" + n.getPaquetes().cantidad() + " paq.) → "
                + enOrden(n.getEnlaceDer());
    }

    private String preOrden(NodoArbol n) 
    {
        if (n == null) {
            return "";
        }
        return n.getDestino() + " (" + n.getPaquetes().cantidad() + " paq.) → "
                + preOrden(n.getEnlaceIzq())
                + preOrden(n.getEnlaceDer());
    }

    private String postOrden(NodoArbol n) 
    {
        if (n == null) 
        {
            return "";
        }
        return postOrden(n.getEnlaceIzq())
                + postOrden(n.getEnlaceDer())
                + n.getDestino() + " (" + n.getPaquetes().cantidad() + " paq.) → ";
    }

    public String recorrerEnOrden() 
    {
        return enOrden(this.raiz);
    }

    public String recorrerPreOrden() 
    {
        return preOrden(this.raiz);
    }

    public String recorrerPostOrden()
    {
        return postOrden(this.raiz);
        
    } 
  //============================================================================
  // METODO OBTENER DESTINOS PARA COMBOBOX
  //
  //============================================================================ 
  // Contar destinos
    private int contarNodos(NodoArbol n) 
    {
        if (n == null) 
        {
            return 0;
        }
        return 1 + contarNodos(n.getEnlaceIzq()) + contarNodos(n.getEnlaceDer());
    }

    // Llenar arreglo en orden
    private int llenarArreglo(NodoArbol n, String[] arreglo, int indice) {
        if (n == null) 
        {
            return indice;
        }
        indice = llenarArreglo(n.getEnlaceIzq(), arreglo, indice);
        arreglo[indice] = n.getDestino();
        indice++;
        indice = llenarArreglo(n.getEnlaceDer(), arreglo, indice);
        return indice;
    }

    public String[] obtenerDestinos() 
    {
        int total = contarNodos(raiz);
        String[] destinos = new String[total];
        llenarArreglo(raiz, destinos, 0);
        return destinos;
    }
}
