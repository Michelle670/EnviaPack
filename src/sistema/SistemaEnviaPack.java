package sistema;

import estructuras.Cola;
import estructuras.Pila;

/**
 * GRUPO 01 PARTICIPANTES: Genesis Delgado,Michelle Guerrero,Camila Marin y
 * Sofia Loaiza PROYECTO_EnvíaPACK:
 */
public class SistemaEnviaPack {

    private Cola cola;
    private Pila pila;

    public SistemaEnviaPack() {
        cola = new Cola();
        pila = new Pila(); // esta vacía por ahora
    }

    public Cola getCola() {
        return cola;
    }

    public Pila getPila() {
        return pila;
    }
}
