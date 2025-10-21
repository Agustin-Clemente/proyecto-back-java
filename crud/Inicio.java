package crud;

import java.util.ArrayList;
// import java.util.Scanner;

public class Inicio {

    public static void menu() {
        System.out.println("Menú de opciones:");
        System.out.println("1. CRUD productos");
        System.out.println("2. CRUD Categorías");
        System.out.println("3. Salir");
        System.out.print("Ingrese el número de la opción elegida y presione enter: ");
    }

    /*
     * private static ArrayList<Articulo> productos = new ArrayList<>();
     * private static ArrayList<Categoria> categorias = new ArrayList<>();
     * 
     * static Scanner scanner = new Scanner(System.in);
     * 
     * public static void menu() {
     * System.out.println("Menú de opciones:");
     * System.out.println("1. Agregar producto");
     * System.out.println("2. Modificar producto");
     * System.out.println("3. Ver producto por posición");
     * System.out.println("4. Ver todos los productos");
     * System.out.println("5. Eliminar producto");
     * System.out.println("6. Crear categoría");
     * System.out.println("7. Modificar categoría");
     * System.out.println("8. Ver categorías");
     * System.out.println("9. Eliminar categoría");
     * System.out.println("10. Salir");
     * System.out.print("Ingrese el número de la opción elegida y presione enter: "
     * );
     * }
     * 
     * private static void mostrarCategorias() {
     * System.out.println("Listado de categorías:");
     * for (Categoria categoria : categorias) {
     * System.out.println(categoria.getId() + ". " + categoria.getNombre());
     * }
     * }
     * 
     * private static void crearProducto() {
     * System.out.println("Ingrese el nombre del producto:");
     * String productoNuevoNombre = scanner.nextLine();
     * if (productoNuevoNombre.trim().isEmpty()) {
     * System.out.println("El nombre no puede estar vacío");
     * return;
     * }
     * System.out.println("Ingrese el precio del producto:");
     * double productoNuevoPrecio = scanner.nextDouble();
     * if (productoNuevoPrecio < 0) {
     * System.out.println("El precio no puede ser negativo");
     * return;
     * }
     * scanner.nextLine();
     */
    /*
     * for (Categoria categoria : categorias) {
     * System.out.println(categoria.getId() + ". " + categoria.getNombre());
     * }
     */
    /*
     * mostrarCategorias();
     * System.out.println("Ingrese el ID de la categoría del nuevo producto:");
     * int productoNuevoCategoriaId = scanner.nextInt();
     * scanner.nextLine();
     * 
     * Categoria categoriaSeleccionada = null;
     * for (Categoria categoria : categorias) {
     * if (categoria.getId() == productoNuevoCategoriaId) {
     * categoriaSeleccionada = categoria;
     * break;
     * }
     * }
     * 
     * if (categoriaSeleccionada == null) {
     * System.out.println("Debe elegir una categoría válida");
     * return;
     * }
     * 
     * Articulo nuevoProducto = new Articulo(productoNuevoNombre,
     * productoNuevoPrecio, categoriaSeleccionada);
     * productos.add(nuevoProducto);
     * System.out.println("Producto agregado exitosamente.");
     * }
     * 
     * 
     * private static void modificarProducto() {
     * if (productos.isEmpty()) {
     * System.out.println("No hay productos para modificar.");
     * return;
     * }
     * 
     * verProductos();
     * 
     * System.out.println("Ingrese la posición del producto a modificar (1-" +
     * productos.size() + "):");
     * int posicionModificar = scanner.nextInt();
     * scanner.nextLine();
     * 
     * if (posicionModificar < 1 || posicionModificar > productos.size()) {
     * System.out.println("Posición inválida. Debe estar entre 1 y " +
     * productos.size() + ".");
     * return;
     * }
     * 
     * Articulo productoElegido = productos.get(posicionModificar - 1);
     * System.out.println("Producto elegido: " + productoElegido);
     * System.out.println("Ingrese el nuevo nombre del producto:");
     * String nuevoNombre = scanner.nextLine();
     * 
     * if (nuevoNombre.trim().isEmpty()) {
     * System.out.println("El nombre no puede estar vacío");
     * return;
     * }
     * 
     * System.out.println("Ingrese el nuevo precio del producto:");
     * double nuevoPrecio = scanner.nextDouble();
     * scanner.nextLine();
     * 
     * if (nuevoPrecio < 0) {
     * System.out.println("El precio no puede ser negativo");
     * return;
     * }
     */

    /*
     * for (Categoria categoria : categorias) {
     * System.out.println(categoria.getId() + ". " + categoria.getNombre());
     * }
     */

    /*
     * mostrarCategorias();
     * System.out.println("Ingrese el ID de la nueva categoría del producto:");
     * int categoriaId = scanner.nextInt();
     * scanner.nextLine();
     * 
     * Categoria categoriaSeleccionada = null;
     * for (Categoria categoria : categorias) {
     * if (categoria.getId() == categoriaId) {
     * categoriaSeleccionada = categoria;
     * break;
     * }
     * }
     * 
     * if (categoriaSeleccionada == null) {
     * System.out.println("Debe elegir una categoría válida");
     * return;
     * }
     * 
     * productoElegido.setNombre(nuevoNombre);
     * productoElegido.setPrecio(nuevoPrecio);
     * productoElegido.setCategoria(categoriaSeleccionada);
     * 
     * productos.set(posicionModificar - 1, productoElegido);
     * System.out.println("Producto modificado exitosamente.");
     * }
     * 
     * private static void verProducto() {
     * if (productos.isEmpty()) {
     * System.out.println("No hay productos para mostrar.");
     * return;
     * }
     * 
     * System.out.println("Ingrese la posición del producto a ver (1-" +
     * productos.size() + "):");
     * int posicionVer = scanner.nextInt();
     * scanner.nextLine();
     * 
     * if (posicionVer < 1 || posicionVer > productos.size()) {
     * System.out.println("Posición inválida. Debe estar entre 1 y " +
     * productos.size() + ".");
     * return;
     * }
     * 
     * Articulo producto = productos.get(posicionVer - 1);
     * System.out.println("Producto en la posición " + posicionVer + ": " +
     * producto);
     * }
     * 
     * private static void verProductos() {
     * if (productos.isEmpty()) {
     * System.out.println("No hay productos para mostrar.");
     * return;
     * }
     * 
     * System.out.println("Listado de productos:");
     * for (int i = 0; i < productos.size(); i++) {
     * System.out.println((i + 1) + ". " + productos.get(i));
     * }
     * }
     * 
     * private static void eliminarProducto() {
     * if (productos.isEmpty()) {
     * System.out.println("No hay productos para eliminar.");
     * return;
     * }
     * 
     * verProductos();
     * 
     * System.out.println("Ingrese la posición del producto a eliminar (1-" +
     * productos.size() + "):");
     * int posicionEliminar = scanner.nextInt();
     * scanner.nextLine();
     * 
     * if (posicionEliminar < 1 || posicionEliminar > productos.size()) {
     * System.out.println("Posición inválida. Debe estar entre 1 y " +
     * productos.size() + ".");
     * return;
     * }
     * 
     * productos.remove(posicionEliminar - 1);
     * System.out.println("Producto eliminado exitosamente.");
     * }
     * 
     * private static void crearCategoria() {
     * mostrarCategorias();
     * System.out.println("Ingrese el nombre de la nueva categoría:");
     * String categoriaNuevoNombre = scanner.nextLine();
     * if (categoriaNuevoNombre.trim().isEmpty()) {
     * System.out.println("El nombre no puede estar vacío");
     * return;
     * }
     * 
     * Categoria nuevaCategoria = new Categoria(categoriaNuevoNombre);
     * categorias.add(nuevaCategoria);
     * System.out.println("Categoría agregada exitosamente.");
     * }
     * 
     * 
     * private static void modificarCategoria() {
     * mostrarCategorias();
     * 
     * System.out.println("Ingrese la posición de la categoría a modificar:");
     * int categoriaPosModificar = scanner.nextInt();
     * scanner.nextLine();
     * 
     * if (categoriaPosModificar < 1 || categoriaPosModificar > categorias.size()) {
     * System.out.println("Posición inválida. Debe estar entre 1 y " +
     * categorias.size() + ".");
     * return;
     * }
     * 
     * Categoria categoriaSeleccionada = categorias.get(categoriaPosModificar - 1);
     * 
     * System.out.println("Ingrese el nuevo nombre de la categoría:");
     * String nuevoNombreCategoria = scanner.nextLine();
     * if (nuevoNombreCategoria.trim().isEmpty()) {
     * System.out.println("El nombre no puede estar vacío");
     * return;
     * }
     * 
     * categoriaSeleccionada.setNombre(nuevoNombreCategoria);
     * System.out.println("Categoría modificada exitosamente.");
     * }
     * 
     * private static void eliminarCategoria() {
     * mostrarCategorias();
     * 
     * System.out.println("Ingrese la posición de la categoría a eliminar:");
     * int categoriaPosEliminar = scanner.nextInt();
     * scanner.nextLine();
     * 
     * if (categoriaPosEliminar < 1 || categoriaPosEliminar > categorias.size()) {
     * System.out.println("Posición inválida. Debe estar entre 1 y " +
     * categorias.size() + ".");
     * return;
     * }
     * 
     * categorias.remove(categoriaPosEliminar - 1);
     * System.out.println("Categoría eliminada exitosamente.");
     * }
     */

    public static void main(String[] args) {

        final ArrayList<Producto> productos = new ArrayList<>();
        final ArrayList<Categoria> categorias = new ArrayList<>();

        categorias.add(new Categoria("Tecnología"));
        categorias.add(new Categoria("Indumentaria"));
        categorias.add(new Categoria("Hogar"));

        final CrudProductos crudProductos = new CrudProductos(productos, categorias);
        final CrudCategorias crudCategorias = new CrudCategorias(categorias);

        // int cantidadProductos = 0;

        int opcion = 0;

        do {
            menu();

            // Scanner scanner = new Scanner(System.in);
            // System.out.println("Ingrese el número de la opción elegida y presione
            // enter:");
            String eleccion = crudProductos.scanner.nextLine();
            try {
                opcion = Integer.parseInt(eleccion.trim());
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1 -> {
                    int opcionProducto;
                    do {
                        crudProductos.menu();
                        opcionProducto = crudProductos.leerEntero("");
                        switch (opcionProducto) {
                            case 1 -> crudProductos.crear();
                            case 2 -> crudProductos.verTodos();
                            case 3 -> crudProductos.buscar();
                            case 4 -> crudProductos.modificar();
                            case 5 -> crudProductos.eliminar();
                            case 6 -> System.out.println("Regresando al menú principal...");
                            default -> System.out.println("Opción inválida. Por favor, ingrese un número entre 1 y 6.");
                        }
                    } while (opcionProducto != 6);
                }
                case 2 -> {
                    int opcionProducto;
                    do {
                        crudCategorias.menu();
                        opcionProducto = crudCategorias.leerEntero("");
                        switch (opcionProducto) {
                            case 1:
                                crudCategorias.crear();
                                break;
                            case 2:
                                crudCategorias.verTodos();
                                break;
                            case 3:
                                crudCategorias.buscar();
                                break;
                            case 4:
                                crudCategorias.modificar();
                                break;
                            case 5:
                                crudCategorias.eliminar();
                                break;
                            case 6:
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, ingrese un número entre 1 y 6.");
                        }
                    } while (opcionProducto != 6);
                }
                case 3 -> System.out.println("¡Gracias, vuelva pronto!");
                default -> System.out.println("Opción inválida. Por favor, ingrese un número entre 1 y 3.");
            }
        } while (opcion != 3);

        /*
         * case 3 -> {
         * int opcionProducto;
         * do {
         * crudCategorias.menu();
         * opcionProducto = crudCategorias.leerEntero("");
         * switch (opcionProducto) {
         * case 1:
         * crudCategorias.crear();
         * break;
         * case 2:
         * crudCategorias.verTodos();
         * break;
         * case 3:
         * crudCategorias.buscar();
         * break;
         * case 4:
         * crudCategorias.modificar();
         * break;
         * case 5:
         * crudCategorias.eliminar();
         * break;
         * case 6:
         * System.out.println("Regresando al menú principal...");
         * break;
         * default:
         * 
         * if (nuevoProducto.trim().isEmpty()) {
         * System.out.println("El nombre no puede estar vacío");
         * break;
         * };
         * 
         * boolean guardado = false;
         * for (int i = 0; i < productos.length; i++) {
         * if (productos[i] == null) {
         * productos[i] = nuevoProducto;
         * cantidadProductos++;
         * guardado = true;
         * System.out.println("Producto agregado exitosamente en la posición " + (i +
         * 1));
         * break;
         * }
         * }
         * 
         * if (!guardado) {
         * System.out.
         * println("No se pueden agregar más productos. Capacidad máxima alcanzada.");
         * }
         * 
         * break;
         * 
         * case 2:
         * modificarProducto();
         * /*
         * System.out.println("Ingrese la posición del producto a modificar (1-10):");
         * int posicionModificar = scanner.nextInt();
         * scanner.nextLine();
         * 
         * if (posicionModificar < 1 || posicionModificar > 10) {
         * System.out.println("Posición inválida. Debe estar entre 1 y 10.");
         * break;
         * }
         * 
         * System.out.println("Ingrese el nuevo nombre del producto:");
         * String nuevoNombre = scanner.nextLine();
         * 
         * if (nuevoNombre.trim().isEmpty()) {
         * System.out.println("El nombre no puede estar vacío");
         * break;
         * }
         * 
         * productos[posicionModificar - 1] = nuevoNombre;
         * System.out.println("Producto modificado exitosamente.");
         * 
         * break;
         * 
         * case 3:
         * verProducto();
         * break;
         * case 4:
         * verProductos();
         * break;
         * case 5:
         * eliminarProducto();
         * break;
         * case 6:
         * crearCategoria();
         * break;
         * case 7:
         * modificarCategoria();
         * break;
         * case 8:
         * mostrarCategorias();
         * break;
         * case 9:
         * eliminarCategoria();
         * break;
         * case 10:
         * System.out.println("¡Gracias, vuelva pronto!");
         * scanner.close();
         * return;
         * 
         * default:
         * System.out.
         * println("Opción inválida. Por favor, ingrese un número entre 1 y 10.");
         * 
         * }
         */

        // System.out.println("La opción ingresada es: " + opcion);
        // scanner.close();
        // } while (!(opcion < 1) || !(opcion > 10));

    }

}
