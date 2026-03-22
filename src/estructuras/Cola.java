package estructuras;

import modelo.Paquete;

/**
 * GRUPO 01 PARTICIPANTES: Genesis Delgado,Michelle Guerrero,Camila Marin y
 * Sofia Loaiza PROYECTO_EnvíaPACK:
 */
public class Cola {

    private Nodo inicio;
    private Nodo fin;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void encolar(Paquete p) {

        Nodo nuevo = new Nodo();
        nuevo.setElemento(p);

        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public Paquete desencolar() {
        if (!vacia()) {

            Paquete p = inicio.getElemento();
            inicio = inicio.getSiguiente();

            if (inicio == null) {
                fin = null;
            }

            return p;
        }

        return null;
    }

    public String mostrar() {

        if (vacia()) {
            return "Cola vacía";
        }

        String s = " ";
        Nodo aux = inicio;

        while (aux != null) {

            Paquete p = aux.getElemento();

            s += "Código: " + p.getCodigo()
                    + " | Descripción: " + p.getDescripcion()
                    + " | Tipo: " + p.getTipoEnvio()
                    + " | Peso: " + p.getPeso()
                    + "\n";

            aux = aux.getSiguiente();
        }

        return s;
    }

    public int cantidad() {

        int cont = 0;
        Nodo aux = inicio;

        while (aux != null) {
            cont++;
            aux = aux.getSiguiente();
        }

        return cont;
    }

    public double pesoTotal() {

        double total = 0;
        Nodo aux = inicio;

        while (aux != null) {
            total += aux.getElemento().getPeso();
            aux = aux.getSiguiente();
        }

        return total;
    }

}

