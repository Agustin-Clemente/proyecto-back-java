package crud;

import java.util.Scanner;

public abstract class CrudConsola<T> {
    protected final Scanner scanner = new Scanner(System.in);

    public abstract void crear();
    public abstract void modificar();
    public abstract void buscar();
    public abstract void verTodos();
    public abstract void eliminar();

    public void menu(){
        System.out.println("Menú de opciones:");
        System.out.println("1. Crear");
        System.out.println("2. Ver Todos");
        System.out.println("3. Buscar");
        System.out.println("4. Modificar");
        System.out.println("5. Eliminar");
        System.out.println("6. Salir");
        System.out.print("Ingrese el número de la opción elegida y presione enter: ");
    }

    protected int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                String valor = scanner.nextLine();
                return Integer.parseInt(valor.trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            }
        }
    }

    protected double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                String valor = scanner.nextLine();
                return Double.parseDouble(valor.trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número decimal (use punto).");
            }
        }
    }

    protected String leerString(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
    
}
