public class Main {
    public static void main(String[] args) {
        Persona Leo = new Persona();

        Leo.setEdad(33);

        System.out.println(Leo.getEdad());

        Leo.setNombre("Leonardo");

        System.out.println(Leo.getNombre());

        Leo.setTelefono(112233);

        System.out.println(Leo.getTelefono());

        Persona Flor = new Persona();

        Flor.setEdad(30);
        System.out.println(Flor.getEdad());
        Flor.setNombre("Florencia");
        System.out.println(Flor.getNombre());
        Flor.setTelefono(223344);
        System.out.println(Flor.getTelefono());

    }

}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return telefono;
    }
}