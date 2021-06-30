package Clase2.Encapsulamiento;

public class Fraccion implements IFraccion{
    private int numerador;
    private int denominador;

    public Fraccion(){
        numerador = 1;
        denominador = 1;
    }

    public Fraccion(int n, int d){
        this.numerador = n;
        this.denominador = d;
    }

    @Override
    public Fraccion sumar(Fraccion a, Fraccion b){
        return null;
    }

    @Override
    public Fraccion restar(Fraccion a, Fraccion b) {
        return null;
    }

    @Override
    public Fraccion multiplicar(Fraccion a, Fraccion b) {
        return null;
    }

    @Override
    public Fraccion dividir(Fraccion a, Fraccion b) {
        return null;
    }


}
