package Clase4TM.Ejercicio2.Dakar.model;

public class SocorristaAuto extends Auto {

    public SocorristaAuto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        super(velocidad, aceleracion, anguloDeGiro, patente);
    }

    public void socorrer(Auto auto) {
        System.out.println("Ayudando auto: "+auto.getPatente());
    }
}
