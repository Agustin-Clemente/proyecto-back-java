package crud;

public class Categoria {
    private int id;
    private String nombre;

    private static int contador = 1;

    public Categoria() {    }

    public Categoria(String nombre) {
        this.id = contador++;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }   

    public String getNombre() {
        return nombre;
    }   

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        } else {
            this.nombre = nombre;

        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre;
    }
}
