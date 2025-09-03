package org.uniquindio.edu.co.poo;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funeraria funeraria = new Funeraria("Funeraria La Paz", "Calle 123");

        // Se registra un admin por defecto
        Admin admin1 = new Admin(
                "001",                // id
                "1234",               // key
                "Carlos",             // nombre
                "Ramírez",            // apellido
                "3101234567",         // telefono
                LocalDate.of(1980, 5, 20), // fechaNacimiento
                "admin@funeraria.com" // correo
        );
        funeraria.getListAdmins().add(admin1);

        int opcion;
        do {
            System.out.println("\n===== SISTEMA FUNERARIA =====");
            System.out.println("1. Ingresar como Admin");
            System.out.println("2. Ingresar como Titular");
            System.out.println("3. Registrar Titular");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1: // LOGIN ADMIN
                    System.out.print("Ingrese ID del admin: ");
                    String idAdmin = sc.nextLine();
                    System.out.print("Ingrese clave: ");
                    String keyAdmin = sc.nextLine();

                    Admin adminLog = funeraria.iniciarSesionA(idAdmin, keyAdmin);
                    if (adminLog != null) {
                        System.out.println("Bienvenido Admin: " + adminLog.getNombre());
                        System.out.println("Lista de titulares registrados:");
                        for (Titular t : funeraria.listTitulares()) {
                            System.out.println("- " + t.getNombre() + " " + t.getApellido() + " | ID: " + t.getId());
                        }
                    } else {
                        System.out.println("Credenciales inválidas para Admin.");
                    }
                    break;

                case 2: // LOGIN TITULAR
                    System.out.print("Ingrese su ID: ");
                    String idT = sc.nextLine();
                    System.out.print("Ingrese su clave: ");
                    String keyT = sc.nextLine();

                    Titular titularLog = funeraria.iniciarSesionT(idT, keyT);
                    if (titularLog != null) {
                        System.out.println("Bienvenido Titular: " + titularLog.getNombre());
                        System.out.println("Plan funerario asignado: " + titularLog.getPlanFunerario());
                    } else {
                        System.out.println("Credenciales inválidas para Titular.");
                    }
                    break;

                case 3: // REGISTRAR TITULAR
                    try {
                        System.out.print("Ingrese ID: ");
                        String id = sc.nextLine();
                        System.out.print("Ingrese nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese apellido: ");
                        String apellido = sc.nextLine();
                        System.out.print("Ingrese dirección: ");
                        String direccion = sc.nextLine();
                        System.out.print("Ingrese correo: ");
                        String correo = sc.nextLine();
                        System.out.print("Ingrese teléfono: ");
                        String telefono = sc.nextLine();
                        System.out.print("Cree su contraseña: ");
                        String password = sc.nextLine();

                        // Para simplificar: usamos fecha actual como nacimiento
                        LocalDate fechaNacimiento = LocalDate.now();

                        // Mostrar planes disponibles
                        System.out.println("Seleccione un plan funerario:");
                        System.out.println("1. Plan Básico");
                        System.out.println("2. Plan Premium");
                        int opcionPlan = sc.nextInt();
                        sc.nextLine(); // limpiar buffer

                        PlanFunerario planSeleccionado = null;
                        switch (opcionPlan) {
                            case 1:
                                planSeleccionado = new PlanFunerario.Builder()
                                        .ataud("Ataúd sencillo")
                                        .ceremonia("Ceremonia básica")
                                        .flores("Sin flores")
                                        .transporte(false)
                                        .cremacion(false)
                                        .build();
                                break;
                            case 2:
                                planSeleccionado = new PlanFunerario.Builder()
                                        .ataud("Ataúd de lujo")
                                        .ceremonia("Ceremonia especial")
                                        .flores("Arreglo premium")
                                        .transporte(true)
                                        .cremacion(true)
                                        .build();
                                break;
                            default:
                                System.out.println("Opción inválida, se asignará el Plan Básico por defecto.");
                                planSeleccionado = new PlanFunerario.Builder()
                                        .ataud("Ataúd sencillo")
                                        .ceremonia("Ceremonia básica")
                                        .flores("Sin flores")
                                        .transporte(false)
                                        .cremacion(false)
                                        .build();
                        }

                        Titular titularNuevo = new Titular(nombre, apellido, fechaNacimiento, telefono, correo, true, direccion);
                        titularNuevo.setPlanFunerario(planSeleccionado); // 🔹 Aquí guardas el plan en el titular
                        funeraria.getListTitulares().add(titularNuevo);

                        System.out.println("Titular registrado con éxito:");
                        System.out.println(titularNuevo.getNombre() + " - Plan: " + titularNuevo.getPlanFunerario());

                    }
            }



    }
}

