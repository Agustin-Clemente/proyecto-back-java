package crud;

public class Articulo extends Producto {
    /* private int id;
    private String nombre;
    private double precio; */
    private Categoria categoria;

    //private static int contador = 1;

    public Articulo() {
    }

    public Articulo(String nombre, double precio, Categoria categoria) {
        /* this.id = contador++;
        this.nombre = nombre;
        this.precio = precio; */
        super(nombre, precio);
        this.categoria = categoria;
    }

    /* public int getId() {
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
    } */

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        if (categoria == null) {
            throw new IllegalArgumentException("La categoría no puede ser nula");
        } else {
            this.categoria = categoria;
        }
    }

    @Override
    public double calcularDescuento() {
        return getPrecio() * 0.90;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", Nombre: " + getNombre() + ", Precio: " + getPrecio() + ", Categoría: " + categoria.getNombre();
    }

}
