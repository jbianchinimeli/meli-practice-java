package Clase4TM.Ejercicio2.Dakar.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Carrera {
    private Double distancia;
    private Double premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo> listaDeVehiculos;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    public Carrera(Double distancia, Double premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos,
                   List<Vehiculo> listaDeVehiculos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos = listaDeVehiculos;
        socorristaAuto = new SocorristaAuto(100.00, 50.00, 25.00, "AUTOHELP123");
        socorristaMoto = new SocorristaMoto(100.00, 50.00, 25.00, "MOTOHELP123");
    }

    public void darDeAltaAuto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente)
            throws Exception {
        if (hayCupo()) {
            this.listaDeVehiculos.add(new Auto(velocidad, aceleracion, anguloDeGiro, patente));
        } else {
            this.noHayCupoException();
        }
    }

    public void darDeAltaMoto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente)
            throws Exception {
        if (this.hayCupo()) {
            this.listaDeVehiculos.add(new Moto(velocidad, aceleracion, anguloDeGiro, patente));
        } else {
            this.noHayCupoException();
        }
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        this.listaDeVehiculos.remove(vehiculo);
    }

    public void eliminarVehiculoConPatente(String unaPatente) throws Exception {
        Optional<Vehiculo> vehiculo =
                this.listaDeVehiculos.stream().filter(v -> unaPatente.equals(v.getPatente())).findFirst();
        if (vehiculo.isPresent()) {
            this.listaDeVehiculos.remove(vehiculo.get());
        } else {
            this.noExisteElVehiculoException();
        }
    }

    //    Velocidad * ½ Aceleracion / (AnguloDeGiro*(Peso-Cantidad de Ruedas * 100)
    public Vehiculo ganador() {
        //Obtener test para cada vehiculo
        Map<Vehiculo, Double> vehiculosTesteados = this.testearVehiculos();

        //Ordenarlos de mayor a menor
        return vehiculosTesteados.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ?
                1 : -1).get().getKey();
    }

    private Map<Vehiculo, Double> testearVehiculos() {
        Map<Vehiculo, Double> tests = new HashMap<>();

        for (Vehiculo v : this.listaDeVehiculos) {
            tests.put(v, this.testRendimiento(v));
        }

        return tests;
    }

    private Double testRendimiento(Vehiculo vehiculo) {
        return (vehiculo.getVelocidad() * vehiculo.getAceleracion()) /
                (vehiculo.getAnguloDeGiro() * (vehiculo.getPeso() - (vehiculo.getRuedas() * 100)));
    }

    private boolean hayCupo() {
        return this.cantidadDeVehiculosPermitidos > this.listaDeVehiculos.size();
    }

    public void socorrerAuto(String patente){
        Optional<Vehiculo> vehiculo =
                this.listaDeVehiculos.stream().filter(v -> patente.equals(v.getPatente())).findFirst();
        if (vehiculo.isPresent() && vehiculo.get().getClass().equals(Auto.class)) {
            this.socorristaAuto.socorrer((Auto) vehiculo.get());
        }
    }

    public void socorrerMoto(String patente){
        Optional<Vehiculo> vehiculo =
                this.listaDeVehiculos.stream().filter(v -> patente.equals(v.getPatente())).findFirst();
        if (vehiculo.isPresent() && vehiculo.get().getClass().equals(Moto.class)) {
            this.socorristaMoto.socorrer((Moto) vehiculo.get());
        }
    }

    private Exception noHayCupoException() throws Exception {
        throw new Exception("No hay cupo.");
    }

    private Exception noExisteElVehiculoException() throws Exception {
        throw new Exception("No existe el vehiculo con la patente ingresada.");
    }

}
