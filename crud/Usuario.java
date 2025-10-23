package crud;

public class Usuario extends Persona {
    private String username;
    private String password;
    private String rol;

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String direccion, String dni, String username, String password,
            String rol) {
        super(nombre, edad, direccion, dni);
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de usuario no puede estar vacío");
        } else {
            this.username = username;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede estar vacía");
        } else {
            this.password = password;
        }
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        if (rol == null || rol.trim().isEmpty()) {
            throw new IllegalArgumentException("El rol no puede estar vacío");
        } else {
            this.rol = rol;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", username= " + username + ", password= " + password + ", rol= " + rol;
    }
}
