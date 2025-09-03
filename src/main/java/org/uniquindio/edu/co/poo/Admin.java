package org.uniquindio.edu.co.poo;

import java.time.LocalDate;

public class Admin extends Persona{
    private String id;
    private String key;
    private String nombre;
    private String apellido;

    public Admin(String id, String key, String nombre, String apellido, String telefono, LocalDate fechaNacimiento, String correo) {
        super(id,apellido,fechaNacimiento,telefono,correo,id);
        this.id = id;
        this.key = key;
        this.nombre = nombre;
        this.apellido = apellido;


    }

    public String getId(){return id;}
    public String getKey(){return key;}
}
