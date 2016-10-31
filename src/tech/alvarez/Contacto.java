package tech.alvarez;

public class Contacto implements Comparable<Contacto> {

    private String nombre;
    private int telefono;
    private String correo;

    public Contacto(String nombre, int telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int compareTo(Contacto o) {
        String nombre1 = nombre.toLowerCase();
        String nombre2 = o.nombre.toLowerCase();
        return nombre1.compareTo(nombre2);
    }
}
