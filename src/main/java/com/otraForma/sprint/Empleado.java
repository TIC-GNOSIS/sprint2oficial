package com.otraForma.sprint;

public class Empleado {

    private String nombre;
    private String correoElectronico;
    private String empresa;
    private String rol;

    public Empleado(String nombre, String correoElectronico, String empresa, String rol) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.empresa = empresa;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
