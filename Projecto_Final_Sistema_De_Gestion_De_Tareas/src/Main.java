import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        boolean continuar = true;

        // --- CARGA DE DATOS INICIALES ---
        // Cargamos 5 tareas, pero TODAS empezarán como PENDIENTES
        gestor.agregarTarea(new Tarea(1, "Estudiar Programación", "Repasar conceptos de POO y ArrayList"));
        gestor.agregarTarea(new Tarea(2, "Renovar Pasaporte", "Sacar cita en Migración"));
        gestor.agregarTarea(new Tarea(3, "Hacer compras", "Leche, huevos y pan"));
        gestor.agregarTarea(new Tarea(4, "Taller mecánico", "Revisión de frenos"));
        gestor.agregarTarea(new Tarea(5, "Pagar internet", "Vence el viernes"));

        // (Borré la línea que marcaba la tarea 3 como completada)

        // --- ENCABEZADO DEL SISTEMA ---
        System.out.println("=========================================");
        System.out.println("      SISTEMA DE GESTIÓN DE TAREAS");
        System.out.println("=========================================");

        while (continuar) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Mostrar todas las tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n--- NUEVA TAREA ---");
                    System.out.print("Ingrese el ID (número único): ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = scanner.nextLine();

                    Tarea nuevaTarea = new Tarea(id, titulo, descripcion);
                    gestor.agregarTarea(nuevaTarea);
                    System.out.println(">>> Tarea guardada con éxito.");
                    break;

                case 2:
                    gestor.mostrarTareas();
                    break;

                case 3:
                    // Opción para cancelar con '0' si te arrepientes
                    System.out.print("\nIngrese el ID de la tarea a completar (0 para cancelar): ");
                    int idCompletar = scanner.nextInt();

                    if (idCompletar == 0) {
                        System.out.println(">>> Acción cancelada.");
                    } else {
                        gestor.marcar(idCompletar);
                    }
                    break;

                case 4:
                    // Opción para cancelar con '0' si te arrepientes
                    System.out.print("\nIngrese el ID de la tarea a eliminar (0 para cancelar): ");
                    int idEliminar = scanner.nextInt();

                    if (idEliminar == 0) {
                        System.out.println(">>> Acción cancelada.");
                    } else {
                        gestor.eliminar(idEliminar);
                    }
                    break;

                case 5:
                    continuar = false;
                    System.out.println("\nCerrando sistema... ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        }
        scanner.close();
    }
}