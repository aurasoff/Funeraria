package org.uniquindio.edu.co.poo;

import java.time.LocalDate;
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
    private List<Admin>listAdmins;

    public Funeraria(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.listPlanFunerario= new ArrayList<>();
        this.listTitulares= new ArrayList<>();
        this.listBeneficiarios = new ArrayList<>();
        this.listAdmins = new ArrayList<>();

        public String getListTitulares(){
            return listTitulares;
        }
    }
    public void registrarUsuario (Titular titular) throws Exception {
        Optional<Titular> titularAux= buscarTitular(titular.getId());
        if(titularAux.isPresent()){
            throw new Exception("El titular ya existe con ese Id");
        }

    }
    public Optional<Titular> buscarTitular(String id){
        return listTitulares.stream()
                .filter(titular -> titular.getId().equals(id))
                .findFirst();
    }

    public List<Titular>listTitulares(){
        return listTitulares;
    }
    public Titular iniciarSesionT(String id, String key){
        for(Titular titular : listTitulares){
            if(titular.getId().equals(id)&&titular.getKey().equals(key)){
                return titular;
            }
        }
        return null;
    }
    public Admin iniciarSesionA(String id, String key){
        for(Admin admin : listAdmins){
            if(admin.getId().equals(id)&&admin.getKey().equals(key)){
                return admin;
            }
        }
        return null;
    }
    public List<Beneficiario> listaBeneficiariosTitular(Titular titular){
        return titular.getListaBeneficiarios();

    }

    public List<Admin> getListAdmins() {
        return listAdmins;
    }
    public Titular registrarTitular(String id, String nombre, String apellido,
                                    LocalDate fechaNacimiento, String telefono, String correo,
                                    String password, String tipoPlan) throws Exception {

        if (id == null || id.isEmpty()) {
            throw new Exception("El id es obligatorio");
        }
        if (nombre == null || nombre.isEmpty()) {
            throw new Exception("El nombre es obligatorio");
        }
        if (correo == null || correo.isEmpty()) {
            throw new Exception("El email es obligatorio");
        }
        if (password == null || password.isEmpty()) {
            throw new Exception("La contraseña es obligatoria");
        }
        if (buscarTitular(id).isPresent()) {
            throw new Exception("El usuario ya existe");
        }

        // Crear titular
        Titular titular = new Titular(nombre, apellido, fechaNacimiento, telefono, correo, true, id);
        titular.setKey(password);

        // Asignar plan funerario elegido
        PlanFunerario plan = PlanFunerarioFactory.crearPlan(tipoPlan);
        titular.setPlanFunerario(plan);

        // Agregar titular a la lista
        listTitulares.add(titular);

        return titular;
    }
}
