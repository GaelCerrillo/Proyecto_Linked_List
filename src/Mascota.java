import java.util.Objects;

public class Mascota {
    private final String nombre;
    private final String especie;
    private final int edadMeses;

    public Mascota(String nombre, String especie, int edadMeses) {
        this.nombre = nombre;
        this.especie = especie;
        this.edadMeses = edadMeses;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdadMeses() {
        return edadMeses;
    }

    @Override
    public String toString() {
        return nombre + " (" + especie + ", " + edadMeses + " meses)";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mascota mascota = (Mascota) o;
        return edadMeses == mascota.edadMeses
                && Objects.equals(nombre, mascota.nombre)
                && Objects.equals(especie, mascota.especie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, especie, edadMeses);
    }
}