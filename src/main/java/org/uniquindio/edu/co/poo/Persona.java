package org.uniquindio.edu.co.poo;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String telefono;
    private String correo;
    private String id;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String correo, String id) {
       this.nombre = nombre;
       this.apellido=apellido;
       this.fechaNacimiento = fechaNacimiento;
       this.telefono = telefono;
       this.correo = correo;
       this.direccion = direccion;
       this.id=id;

    }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public String getCorreo() { return correo; }
    public String getId() { return id; }






}
