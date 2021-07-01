package Clase4TM.Ejercicio1.SaveTheRopaSA.app;

import Clase4TM.Ejercicio1.SaveTheRopaSA.entity.Abrigo;
import Clase4TM.Ejercicio1.SaveTheRopaSA.entity.Prenda;
import Clase4TM.Ejercicio1.SaveTheRopaSA.entity.Sueter;
import Clase4TM.Ejercicio1.SaveTheRopaSA.service.GuardaRopa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Prenda sueter = new Sueter("Miss Twid", "Cachemire");
        Prenda abrigo = new Abrigo("Bremer", "Merino y Angora");

        //Guarda ropas vacío
        GuardaRopa.mostrarPrendas();

        GuardaRopa.guardarPrendas(Arrays.asList(sueter, abrigo));

        //Guarda ropas lleno
        GuardaRopa.mostrarPrendas();

        try{
            //intento quitar una prenda que no exite en el set
            GuardaRopa.devolverPrendas(2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        //Sigue estando lleno
        GuardaRopa.mostrarPrendas();

        try{
            //devuelvo una prenda que sí esta
            GuardaRopa.devolverPrendas(1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //Ahora esta vacio
        GuardaRopa.mostrarPrendas();
    }
}
