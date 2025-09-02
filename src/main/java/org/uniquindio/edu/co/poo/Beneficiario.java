package org.uniquindio.edu.co.poo;

import java.time.LocalDate;

public class Beneficiario extends Titular {
    private String parentesco;

    public Beneficiario(String nombre, String parentesco,String telefono, String correo, LocalDate fechaNacimiento, boolean planActivo) {
        super(nombre,parentesco,fechaNacimiento,telefono,correo,planActivo);
        this.parentesco = parentesco;
    }


}
