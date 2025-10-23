package crud;

public abstract class Producto implements Vendible {
    private int id;
    private String nombre;
    private double precio;

    private static int contador = 1;

    public Producto() {
    }

    public Producto(String nombre, double precio) {
        this.id = contador++;
        this.nombre = nombre;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        } else {
            this.precio = precio;
        }
    }

    public abstract double calcularDescuento();

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Precio: " + precio;
    }

}
