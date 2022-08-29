package com.otraForma.sprint;

public class MovimientoDinero {

    private float montoDelMovimiento;
    private String conceptoDelMovimiento;

    public MovimientoDinero(float montoDelMovimiento, String conceptoDelMovimiento) {
        this.montoDelMovimiento = montoDelMovimiento;
        this.conceptoDelMovimiento = conceptoDelMovimiento;
    }

    public float getMontoDelMovimiento() {
        return montoDelMovimiento;
    }

    public void setMontoDelMovimiento(float montoDelMovimiento) {
        this.montoDelMovimiento = montoDelMovimiento;
    }

    public String getConceptoDelMovimiento() {
        return conceptoDelMovimiento;
    }

    public void setConceptoDelMovimiento(String conceptoDelMovimiento) {
        this.conceptoDelMovimiento = conceptoDelMovimiento;
    }

    public double montos(){
        return -1;
    }

    public String usuarioEncargado(){
        return "-1";
    }
}
