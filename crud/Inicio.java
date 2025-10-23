package crud;

import java.util.ArrayList;

public class Inicio {

    public static void menu() {
        System.out.println("Menú de opciones:");
        System.out.println("1. CRUD productos");
        System.out.println("2. CRUD Categorías");
        System.out.println("3. CRUD Usuarios");
        System.out.println("4. Salir");
        System.out.print("Ingrese el número de la opción elegida y presione enter: ");
    }

    public static void main(String[] args) {

        final ArrayList<Producto> productos = new ArrayList<>();
        final ArrayList<Categoria> categorias = new ArrayList<>();
        final ArrayList<Usuario> usuarios = new ArrayList<>();

        categorias.add(new Categoria("Tecnología"));
        categorias.add(new Categoria("Indumentaria"));
        categorias.add(new Categoria("Hogar"));

        usuarios.add(new Usuario("Admin", 30, "Calle Falsa 123", "12345678", "admin", "admin123", "ADMIN"));
        usuarios.add(new Usuario("User", 25, "Avenida Siempre Viva 742", "87654321", "user", "user123", "USER"));

        final CrudProductos crudProductos = new CrudProductos(productos, categorias);
        final CrudCategorias crudCategorias = new CrudCategorias(categorias);
        final CrudUsuarios crudUsuarios = new CrudUsuarios(usuarios);

        int opcion = 0;

        do {
            menu();

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
                    int opcionCategoria;
                    do {
                        crudCategorias.menu();
                        opcionCategoria = crudCategorias.leerEntero("");
                        switch (opcionCategoria) {
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
                    } while (opcionCategoria != 6);
                }
                case 3 -> {
                    int opcionUsuario;
                    do {
                        crudUsuarios.menu();
                        opcionUsuario = crudUsuarios.leerEntero("");
                        switch (opcionUsuario) {
                            case 1:
                                crudUsuarios.crear();
                                break;
                            case 2:
                                crudUsuarios.verTodos();
                                break;
                            case 3:
                                crudUsuarios.buscar();
                                break;
                            case 4:
                                crudUsuarios.modificar();
                                break;
                            case 5:
                                crudUsuarios.eliminar();
                                break;
                            case 6:
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, ingrese un número entre 1 y 6.");
                        }
                    } while (opcionUsuario != 6);
                }
                case 4 -> System.out.println("¡Gracias, vuelva pronto!");
                default -> System.out.println("Opción inválida. Por favor, ingrese un número entre 1 y 4.");
            }
        } while (opcion != 4);

    }

}
