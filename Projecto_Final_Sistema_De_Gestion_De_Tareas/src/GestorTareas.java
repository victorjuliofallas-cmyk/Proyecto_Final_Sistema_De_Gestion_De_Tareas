import java.util.ArrayList;

public class GestorTareas {
    private ArrayList<Tarea> listaTareas;

    public GestorTareas() {
        this.listaTareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea t) {
        listaTareas.add(t);
        // No imprimimos mensaje aquí para que no moleste al cargar los datos de prueba
    }

    public void mostrarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println(">>> No hay tareas registradas por el momento.");
        } else {
            System.out.println("\n--- LISTADO DE TAREAS ACTUALES ---");
            for (Tarea t : listaTareas) {
                System.out.println(t.toString());
            }
            System.out.println("----------------------------------");
        }
    }

    public Tarea buscar(int id) {
        for (Tarea t : listaTareas) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    public void marcar(int id) {
        Tarea tareaEncontrada = buscar(id);
        if (tareaEncontrada != null) {
            tareaEncontrada.setCompletada(true);
            System.out.println(">>> ¡Listo! La tarea ID " + id + " fue completada.");
        } else {
            System.out.println(">>> Error: No existe una tarea con ID " + id);
        }
    }

    public void eliminar(int id) {
        Tarea tareaEncontrada = buscar(id);
        if (tareaEncontrada != null) {
            listaTareas.remove(tareaEncontrada);
            System.out.println(">>> La tarea ID " + id + " fue eliminada correctamente.");
        } else {
            System.out.println(">>> Error: No existe una tarea con ID " + id);
        }
    }
}