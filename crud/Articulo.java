package crud;

public class Articulo extends Producto {
    private Categoria categoria;

    public Articulo() {
    }

    public Articulo(String nombre, double precio, Categoria categoria) {
        super(nombre, precio);
        this.categoria = categoria;
    }

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
        return "ID: " + getId() + ", Nombre: " + getNombre() + ", Precio: " + getPrecio() + ", Categoría: "
                + categoria.getNombre();
    }

}
