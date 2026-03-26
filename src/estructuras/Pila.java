
package estructuras;
import modelo.Paquete;
public class Pila {
    //Atributo
    private NodoPila cima;
    
    //Constructor
    public Pila() {
        cima = null;
    }
    
    //Preguntamos si la pila está vacía
    public boolean vacia() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }
    
    //Método para apilar de forma directa 
    public void apilar(Paquete p) {
        NodoPila nuevo = new NodoPila();
        nuevo.setDato(p);

        if (vacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }
    
    //Método para desapilar
    public void desapilar() {
        if (!vacia()) {
            cima = cima.getSiguiente();
        }
    }

    //Método para mostar
    public String mostrar() {
        String s = "";
        NodoPila aux = cima;

        while (aux != null) {
            s += aux.getDato().toString() + "\n";
            aux = aux.getSiguiente();
        }

        return s;
    }

    public Paquete desapilarRetornando() {
        if (!vacia()) {
            Paquete p = cima.getDato();
            cima = cima.getSiguiente();
            return p;
        }
        return null;
    }
    
    
    public Paquete verCima() {
    if (!vacia()) {
        return cima.getDato();
    }
    return null;
}

public int cantidad() {
    int cont = 0;
    NodoPila aux = cima;
    while (aux != null) {
        cont++;
        aux = aux.getSiguiente();
    }
    return cont;
}

public double pesoTotal() {
    double total = 0;
    NodoPila aux = cima;
    while (aux != null) {
        total += aux.getDato().getPeso();
        aux = aux.getSiguiente();
    }
    return total;
}

public Paquete obtenerPorPosicion(int posicion) {
    int i = 0;
    NodoPila aux = cima;
    while (aux != null) {
        if (i == posicion) {
            return aux.getDato();
        }
        i++;
        aux = aux.getSiguiente();
    }
    return null;
}

}
