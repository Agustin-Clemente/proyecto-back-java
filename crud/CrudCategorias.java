package crud;

import java.util.ArrayList;

public class CrudCategorias extends CrudConsola<Categoria> {
    private final ArrayList<Categoria> categorias;

    public CrudCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    @Override
    public void crear() {
        String nombre = leerString("Ingrese el nombre de la categoría: ");
        categorias.add(new Categoria(nombre));
        System.out.println("Categoría creada exitosamente.");
    }

    @Override
    public void verTodos() {
        if (categorias.isEmpty()) {
            System.out.println("No hay categorías disponibles.");
        } else {
            for (Categoria categoria : categorias) {
                System.out.println(categoria);
            }
        }
    }

    @Override
    public void buscar() {
        int id = leerEntero("Ingrese el ID de la categoría a buscar y presione enter: ");
        for (Categoria categoria : categorias) {
            if (categoria.getId() == id) {
                System.out.println(categoria);
                return;
            }
        }
        System.out.println("Categoría no encontrada.");
    }

    @Override
    public void modificar() {
        verTodos();
        int id = leerEntero("Ingrese el ID de la categoría a modificar y presione enter: ");
        for (Categoria categoria : categorias) {
            if (categoria.getId() == id) {
                String nuevoNombre = leerString("Ingrese el nuevo nombre de la categoría: ");
                categoria.setNombre(nuevoNombre);
                System.out.println("Categoría modificada exitosamente.");
                return;
            }
        }
        System.out.println("Categoría no encontrada.");
    }

    @Override
    public void eliminar() {
        verTodos();
        int id = leerEntero("Ingrese el ID de la categoría a eliminar y presione enter: ");
        boolean eliminado = categorias.removeIf(c -> c.getId() == id);
        System.out.println(eliminado ? "Categoría eliminada exitosamente." : "Categoría no encontrada.");
    }
}
