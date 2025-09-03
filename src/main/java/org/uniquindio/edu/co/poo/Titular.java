package org.uniquindio.edu.co.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Titular extends Persona {
    private boolean planActivo;
    private PlanFunerario planFunerario;
    private List<Beneficiario> listBeneficiarios;
    private String key;
    private String id;


    public Titular(String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String correo, boolean planActivo, String id) {
        super(nombre, apellido, fechaNacimiento, telefono, correo, id);
        this.planActivo = true;
        this.id = id;
        this.listBeneficiarios = new ArrayList<>();
    }

    public void setPlanFunerario(PlanFunerario planFunerario) {
        this.planFunerario = planFunerario;
        this.planActivo = true;
    }

    public List<Beneficiario> getListaBeneficiarios() {
        return listBeneficiarios;
    }
    public boolean isPlanActivo() {
        return planActivo;
    }

    public void setListaBeneficiarios(List<Beneficiario> ListBeneficiarios) {
        this.listBeneficiarios = listBeneficiarios;
    }

    public String getKey() {
        return key;
    }

    public String getId() {
        return id;
    }
    public PlanFunerario getPlanFunerario(){
        return planFunerario;
    }
    public void agregarBeneficiario(Beneficiario b){
        listBeneficiarios.add(b);
    }
    public List<Beneficiario> getListBeneficiarios(){
        return listBeneficiarios;
    }


    public void setKey(String password) {this.key=key;
    }

}
