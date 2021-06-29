package Clase2.Modelado;

import java.util.Objects;

public class CuentaCorriente {

    private Long id;

    private double saldo;

    public CuentaCorriente(){
        this.saldo = 0;
    }

    public CuentaCorriente(Long id){
        this.id = id;
    }

    public CuentaCorriente(CuentaCorriente otra){
        this.id = otra.getId();
        this.saldo = otra.getSaldo();
    }

    public boolean ingreso(double ingreso){
        if(this.montoMayorQueCero(ingreso)){
            this.saldo += ingreso;
            return true;
        }
        return false;
    }

    public boolean egreso(double egreso){
        if(this.montoMayorQueCero(egreso) && this.egresoValido(egreso)){
            this.saldo -= egreso;
            return true;
        }
        return false;

    }

    public boolean reintegro(double reintegro){
        return this.ingreso(reintegro);
    }

    public boolean transferencia(CuentaCorriente cc, double monto){
        if (!this.mismaCuenta(cc) && this.egreso(monto)){
            return cc.ingreso(monto);
        }
        return false;
    }

    private boolean mismaCuenta(CuentaCorriente cc){
        return cc.equals(this);
    }

    private boolean montoMayorQueCero(double monto){
        return monto > 0;
    }

    private boolean egresoValido(double egreso){
        return egreso <= this.saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuentaCorriente that = (CuentaCorriente) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
