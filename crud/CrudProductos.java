package crud;

import java.util.ArrayList;

public class CrudProductos extends CrudConsola<Producto> {
    private final ArrayList<Producto> productos;
    private final ArrayList<Categoria> categorias;

    public CrudProductos(ArrayList<Producto> productos, ArrayList<Categoria> categorias) {
        this.productos = productos;
        this.categorias = categorias;
    }

    @Override
    public void crear() {
        System.out.println("1. Crear Artículo");
        System.out.println("2. Crear Servicio");
        int opcion = leerEntero("Seleccione el tipo de producto a crear y presione enter: ");

        switch (opcion) {
            case 1:
                String nombreProd = leerString("Ingrese el nombre del artículo: ");
                double precioProd = leerDouble("Ingrese el precio del artículo: ");

                if (categorias.isEmpty()) {
                    System.out.println("No hay categorías disponibles. Por favor, cree una categoría primero.");
                    return;
                }
                System.out.println("Categorías disponibles:");
                for (Categoria categoria : categorias) {
                    System.out.println(categoria.getId() + ". " + categoria.getNombre());
                }
                int categoriaId = leerEntero("Ingrese el ID de la categoría y presione enter: ");
                Categoria categoriaSeleccionada = null;
                for (Categoria categoria : categorias) {
                    if (categoria.getId() == categoriaId) {
                        categoriaSeleccionada = categoria;
                        break;
                    }
                }
                if (categoriaSeleccionada != null) {
                    productos.add(new Articulo(nombreProd, precioProd, categoriaSeleccionada));
                    System.out.println("Artículo creado exitosamente.");
                } else {
                    System.out.println("Categoría inválida.");
                }
                break;

            case 2:
                String nombreServ = leerString("Ingrese el nombre del servicio: ");
                double precioServ = leerDouble("Ingrese el precio del servicio: ");
                int duracionServ = leerEntero("Ingrese la duración del servicio en horas: ");
                productos.add(new Servicio(nombreServ, precioServ, duracionServ));
                System.out.println("Servicio creado exitosamente.");
                break;

            default:
                System.out.println("Opción inválida.");
        }
    }

    @Override
    public void verTodos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos disponibles.");
        } else {
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }

    @Override
    public void buscar() {
        int id = leerEntero("Ingrese el ID del producto a buscar y presione enter: ");
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                System.out.println(producto);
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    @Override
    public void modificar() {
        verTodos();
        int id = leerEntero("Ingrese el ID del producto a modificar y presione enter: ");
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                System.out.println("Producto seleccionado: " + producto);
                System.out.println("¿Cambiar nombre? (1-Si/2-No)");
                int cambiarNombre = leerEntero("Opción:");
                if (cambiarNombre == 1) {
                    String nuevoNombre = leerString("Ingrese el nuevo nombre del producto: ");
                    producto.setNombre(nuevoNombre);
                }
                System.out.println("¿Cambiar precio? (1-Si/2-No)");
                int cambiarPrecio = leerEntero("Opción:");
                if (cambiarPrecio == 1) {
                    double nuevoPrecio = leerDouble("Ingrese el nuevo precio del producto: ");
                    producto.setPrecio(nuevoPrecio);
                }
                if (producto instanceof Articulo) {
                    System.out.println("¿Cambiar categoría? (1-Si/2-No)");
                    int cambiarCat = leerEntero("Opción:");
                    if (cambiarCat == 1) {
                        if (categorias.isEmpty()) {
                            System.out.println("No hay categorías disponibles. Por favor, cree una categoría primero.");
                            return;
                        }
                        System.out.println("Categorías disponibles:");
                        for (Categoria categoria : categorias) {
                            System.out.println(categoria.getId() + ". " + categoria.getNombre());
                        }
                        int idCat = leerEntero("Ingrese el ID de la categoría y presione enter: ");
                        for (Categoria categoria : categorias) {
                            if (categoria.getId() == idCat) {
                                ((Articulo) producto).setCategoria(categoria);
                                break;
                            }
                        }
                    }
                }

                else if (producto instanceof Servicio) {
                    System.out.println("Cambiar duración del servicio? (1-Si/2-No)");
                    int cambiarDuracion = leerEntero("Opción:");
                    if (cambiarDuracion == 1) {
                        int nuevaDuracion = leerEntero("Ingrese la nueva duración del servicio en horas: ");
                        ((Servicio) producto).setDuracionHoras(nuevaDuracion);
                    }
                }
                System.out.println("Producto modificado exitosamente.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    @Override
    public void eliminar() {
        verTodos();
        int id = leerEntero("Ingrese el ID del producto a eliminar y presione enter: ");
        boolean eliminado = productos.removeIf(p -> p.getId() == id);
        if (eliminado) {
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
