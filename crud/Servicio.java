package crud;

public class Servicio extends Producto {
    private int duracionHoras;

    public Servicio() {
    }

    public Servicio(String nombre, double precio, int duracionHoras) {
        super(nombre, precio);

        this.duracionHoras = duracionHoras;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        if (duracionHoras <= 0) {
            throw new IllegalArgumentException("La duración debe ser mayor que cero");
        } else {
            this.duracionHoras = duracionHoras;
        }
    }

    @Override
    public double calcularDescuento() {
        return getPrecio() * 0.85;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", Nombre: " + getNombre() + ", Precio: " + getPrecio() + ", Duración (horas): "
                + getDuracionHoras();
    }

}
