package Clase4TM.Ejercicio2.Dakar.model;

public class SocorristaMoto extends Moto {

    public SocorristaMoto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente);
    }

    public void socorrer(Moto moto) {
        System.out.println("Socorriendo moto: " + moto.getPatente());
    }
}
