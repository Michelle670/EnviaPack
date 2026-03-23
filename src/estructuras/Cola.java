package estructuras;

import modelo.Paquete;

/**
 * GRUPO 01 PARTICIPANTES: Genesis Delgado,Michelle Guerrero,Camila Marin y
 * Sofia Loaiza PROYECTO_EnvíaPACK:
 */
public class Cola {

    private NodoCola inicio;
    private NodoCola fin;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }

    public NodoCola getInicio() {
        return inicio;
    }

    public NodoCola getFin() {
        return fin;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public void encolar(Paquete p) {

        NodoCola nuevo = new NodoCola();
        nuevo.setDato(p);

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

            Paquete p = inicio.getDato();
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
        NodoCola aux = inicio;

        while (aux != null) {

            Paquete p = aux.getDato();

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
        NodoCola aux = inicio;

        while (aux != null) {
            cont++;
            aux = aux.getSiguiente();
        }

        return cont;
    }

    public double pesoTotal() {

        double total = 0;
        NodoCola aux = inicio;

        while (aux != null) {
            total += aux.getDato().getPeso();
            aux = aux.getSiguiente();
        }

        return total;
    }

}

