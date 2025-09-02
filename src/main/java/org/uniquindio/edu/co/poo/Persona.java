package org.uniquindio.edu.co.poo;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String telefono;
    private String correo;
    public Persona(String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String correo) {
       this.nombre = nombre;
       this.apellido=apellido;
       this.fechaNacimiento = fechaNacimiento;
       this.telefono = telefono;
       this.correo = correo;
    }



}
