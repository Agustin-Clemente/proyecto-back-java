package crud;

public abstract class Persona {
    private int id;
    private String nombre;
    private int edad;
    private String direccion;
    private String dni;

    private static int contador = 1;

    public Persona() {
    }

    public Persona(String nombre, int edad, String direccion, String dni) {
        this.id = contador++;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.dni = dni;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        } else {
            this.edad = edad;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La direccion no puede estar vacía");
        } else {
            this.direccion = direccion;
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni == null || dni.trim().isEmpty()) {
            throw new IllegalArgumentException("El dni no puede estar vacío");
        } else {
            this.dni = dni;
        }
    }

    @Override
    public String toString() {
        return "id= " + id + ", nombre= " + nombre + ", edad= " + edad + ", direccion= " + direccion + ", dni= " + dni;
    }

}