package org.uniquindio.edu.co.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.uniquindio.edu.co.poo.*;

public class Funeraria {
    private String nombre;
    private String direccion;
    private List<PlanFunerario> listPlanFunerario;
    private List<Titular>listTitulares;
    private List<Beneficiario>listBeneficiarios;

    public Funeraria(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.listPlanFunerario= new ArrayList<>();
        this.listTitulares= new ArrayList<>();
        this.listBeneficiarios = new ArrayList<>();
    }
    public void registrarUsuario (Titular titular) throws Exception {
        Optional<Titular> titularAux= buscarTitular(titular.getId());
        if(titularAux.isPresent()){
            throw new Exception("El titular ya existe con ese Id");
        }

    }
    public Optional<Titular> buscarTitular(String id){
        return listTitulares.stream().filter((t-> t.getId().equals(id)).
                findFirst().orElse(null));
    }
    public List<Titular>listTitulares(){
        return listTitulares;
    }
    public Titular iniciarSesion(String id, String key){
        for(Titular titular : listTitulares){
            if(titular.getId().equals(id)&&titular.getKey().equals(key)){
                return titular;
            }
        }
        return null;
    }
    public


}
