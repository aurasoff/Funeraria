package org.uniquindio.edu.co.poo;

public class PlanFunerarioFactory {


    public static PlanFunerario crearPlan(String tipo) throws IllegalArgumentException {
        switch (tipo.toLowerCase()) {
            case "basico":
                return new PlanFunerario.Builder()
                        .ataud("Ataud sencillo")
                        .build();
                case "medio":
                return new PlanFunerario.Builder()
                        .ataud("Ataud de lujo")
                        .flores("flores amarillas")
                        .build();
                case "cremacion":
                    return new PlanFunerario.Builder()
                            .ataud("Ataud premium")
                            .transporte(true)
                            .cremacion(true)
                            .build();
            default:
                throw new IllegalArgumentException("tipo de plan no valido");
        }

    }

 }
