package Clase2.Modelado;

public class Contador {

    private int cont;

    public Contador(){
        this.cont = 0;
    }

    public Contador(int numeroInicial){
        this.cont = numeroInicial;
    }

    public Contador(Contador otro){
        this.cont = otro.getCont();
    }

    public void aumentar(){
        this.cont++;
    }

    public void disminuir(){
        this.cont--;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
}
