package org.uniquindio.edu.co.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Titular extends Persona {
    private boolean planActivo;
    private List<PlanFunerario> listPlanfunerario;
    private List<Beneficiario> listBeneficiarios;
    private String key;

    public Titular(String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String correo, boolean planActivo) {
        super(nombre,apellido,fechaNacimiento,telefono,correo);
        this.planActivo = true;
        this.listPlanfunerario = new ArrayList<>();

    }
    public List<PlanFunerario> getListPlanFunerario(){return listPlanfunerario;}
    public void setListPlanfunerario (List<PlanFunerario> listPlanfunerario){this.listPlanfunerario = listPlanfunerario;}
    public List<Beneficiario> getListaBeneficiarios(){return listBeneficiarios;}
    public void setListaBeneficiarios(List<Beneficiario> ListBeneficiarios){this.listBeneficiarios=listBeneficiarios;}
    public String getKey(){return key;}
    public void setKey(String key){this.key =key;}


}
