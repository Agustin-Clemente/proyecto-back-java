package crud;

import java.util.ArrayList;

public class CrudUsuarios extends CrudConsola<Usuario> {
    private final ArrayList<Usuario> usuarios;

    public CrudUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public void crear() {
        String nombre = leerString("Ingrese el nombre del usuario y presione enter: ");
        int edad = leerEntero("Ingrese la edad del usuario y presione enter: ");
        String direccion = leerString("Ingrese la dirección del usuario y presione enter: ");
        String dni = leerString("Ingrese el DNI del usuario y presione enter: ");
        String username = leerString("Ingrese el username y presione enter: ");
        String password = leerString("Ingrese la contraseña y presione enter: ");
        String rol = leerString("Ingrese el rol del usuario y presione enter 1-ADMIN, 2-USER: : ");
        switch (rol) {
            case "1" -> rol = "ADMIN";
            case "2" -> rol = "USER";
            default -> {
                System.out.println("Rol inválido. Se genera rol USER.");
                rol = "USER";
            }
        }

        usuarios.add(new Usuario(nombre, edad, direccion, dni, username, password, rol));
        System.out.println("Usuario creado exitosamente.");
    }

    @Override
    public void verTodos() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios disponibles.");
        } else {
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }

    @Override
    public void buscar() {
        int id = leerEntero("Ingrese el ID del usuario a buscar y presione enter: ");
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                System.out.println(usuario);
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }

    @Override
    public void modificar() {
        verTodos();
        int id = leerEntero("Ingrese el ID del usuario a modificar y presione enter: ");
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                System.out.println("Usuario seleccionado: " + usuario);
                System.out.println("¿Cambiar nombre? (1-Si/2-No)");
                int cambiarNombre = leerEntero("Opción:");
                if (cambiarNombre == 1) {
                    String nuevoNombre = leerString("Ingrese el nuevo nombre del usuario y presione enter: ");
                    usuario.setNombre(nuevoNombre);
                }
                System.out.println("¿Cambiar edad? (1-Si/2-No)");
                int cambiarEdad = leerEntero("Opción:");
                if (cambiarEdad == 1) {
                    int nuevaEdad = leerEntero("Ingrese la nueva edad del usuario y presione enter: ");
                    usuario.setEdad(nuevaEdad);
                }
                System.out.println("¿Cambiar dirección? (1-Si/2-No)");
                int cambiarDireccion = leerEntero("Opción:");
                if (cambiarDireccion == 1) {
                    String nuevaDireccion = leerString("Ingrese la nueva dirección del usuario y presione enter: ");
                    usuario.setDireccion(nuevaDireccion);
                }
                System.out.println("¿Cambiar DNI? (1-Si/2-No)");
                int cambiarDni = leerEntero("Opción:");
                if (cambiarDni == 1) {
                    String nuevoDni = leerString("Ingrese el nuevo DNI del usuario y presione enter: ");
                    usuario.setDni(nuevoDni);
                }
                System.out.println("¿Cambiar username? (1-Si/2-No)");
                int cambiarUsername = leerEntero("Opción:");
                if (cambiarUsername == 1) {
                    String nuevoUsername = leerString("Ingrese el nuevo username y presione enter: ");
                    usuario.setUsername(nuevoUsername);
                }
                System.out.println("¿Cambiar contraseña? (1-Si/2-No)");
                int cambiarPassword = leerEntero("Opción:");
                if (cambiarPassword == 1) {
                    String nuevaPassword = leerString("Ingrese la nueva contraseña y presione enter: ");
                    usuario.setPassword(nuevaPassword);
                }
                System.out.println("¿Cambiar rol? (1-Si/2-No)");
                int cambiarRol = leerEntero("Opción:");
                if (cambiarRol == 1) {
                    String nuevoRol = leerString("Ingrese el nuevo rol del usuario: 1-ADMIN, 2-USER: ");
                    switch (nuevoRol) {
                        case "1" -> nuevoRol = "ADMIN";
                        case "2" -> nuevoRol = "USER";
                        default -> {
                            System.out.println("Rol inválido. Se mantiene el rol anterior.");
                            nuevoRol = usuario.getRol();
                        }
                    }
                    usuario.setRol(nuevoRol);
                    System.out.println("Usuario modificado exitosamente.");
                    return;
                }
                System.out.println("Usuario no encontrado.");
            }
        }
    }

    @Override
    public void eliminar() {
        verTodos();
        int id = leerEntero("Ingrese el ID del usuario a eliminar y presione enter: ");
        boolean eliminado = usuarios.removeIf(u -> u.getId() == id);
        System.out.println(eliminado ? "Usuario eliminado exitosamente." : "Usuario no encontrado.");
    }
}
