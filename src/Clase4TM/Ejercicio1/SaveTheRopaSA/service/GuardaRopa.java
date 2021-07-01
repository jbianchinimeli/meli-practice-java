package Clase4TM.Ejercicio1.SaveTheRopaSA.service;

import Clase4TM.Ejercicio1.SaveTheRopaSA.entity.Prenda;

import java.util.HashMap;
import java.util.List;

public class GuardaRopa {

    private static HashMap<Integer, List<Prenda>> prendas = new HashMap<>();
    private static Integer contador = 0;

    public static Integer guardarPrendas(List<Prenda> listaDePrendas){
        prendas.put(contador + 1, listaDePrendas);
        return contador;
    }

    public static void mostrarPrendas(){
        if(prendas.isEmpty()){
            System.out.println("No hay prendas");
        }
        prendas.entrySet().forEach(entry-> System.out.println(entry));
    }

    public static List<Prenda> devolverPrendas(Integer numero)throws Exception{
        if (prendas.containsKey(numero)){
            return prendas.remove(numero);
        }else{
            throw new Exception("Numero de prendas invalido.");
        }
    }




}
