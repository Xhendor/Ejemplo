package com.uabc.edu.appsw.ejemplo;

public class Alumno {

    private Integer matricula;
    private String  nombre;
    private String  apellidoMaterno;
    private String  apellidoPaterno;
    private String  correoElectronico;

    public Alumno(Integer matricula, String nombre, String apellidoMaterno, String apellidoPaterno, String correoElectronico) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.correoElectronico = correoElectronico;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public boolean reprobar(){

        return true;

    }
}
