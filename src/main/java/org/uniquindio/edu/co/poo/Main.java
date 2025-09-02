package org.uniquindio.edu.co.poo;

public class Main {
    public static void main(String[] args) {
        // El cliente pide un plan básico
        PlanFunerario plan1 = PlanFunerarioFactory.crearPlan("basico");
        System.out.println(plan1);

        // El cliente pide un plan premium
        PlanFunerario plan2 = PlanFunerarioFactory.crearPlan("medio");
        System.out.println(plan2);

        // El cliente pide un plan de cremación
        PlanFunerario plan3 = PlanFunerarioFactory.crearPlan("cremacion");
        System.out.println(plan3);

    }
}
