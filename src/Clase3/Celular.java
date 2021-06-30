package Clase3;

import Clase3.Interfaces.IPrecedable;

public class Celular implements IPrecedable<Celular> {

    private Persona titular;
    private Integer numero;

    public Celular(Persona titular, Integer numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.numero.compareTo(celular.getNumero());
    }

    @Override
    public String toString() {
        return "Celular{" +
                "titular=" + titular +
                ", numero=" + numero +
                '}';
    }
}
