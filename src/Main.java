import java.util.Scanner;

public class Main {
    static SinglyLinkedList<Mascota> mascotas = new SinglyLinkedList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("=============== Refugio de Mascotas ================");
            System.out.println("1. Agregar mascota");
            System.out.println("2. Eliminar mascota");
            System.out.println("3. Mostrar mascotas");
            System.out.println("4. Calcular edad promedio");
            System.out.println("0. Salir");

            option = leerEntero("Opción: ");

            switch (option) {
                case 1 -> agregar();
                case 2 -> eliminar();
                case 3 -> mostrar();
                case 4 -> calcularEdadPromedio();
                case 0 -> System.out.println("Hasta luego!");
                default -> System.out.println("Opción no válida");
            }

            System.out.println();

        } while (option != 0);
    }

    private static void agregar() {
        String nombre = leerTexto("Ingresa el nombre de la mascota: ");
        String especie = leerEspecie();
        int edad = leerEdad();

        Mascota mascota = new Mascota(nombre, especie, edad);
        mascotas.insertLast(mascota);

        System.out.println(mascota + " agregada correctamente!");
    }

    private static void eliminar() {
        if (mascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas.");
            return;
        }

        mostrar();

        String nombre = leerTexto("Ingresa el nombre de la mascota a eliminar: ");

        Mascota encontrada = null;
        Node<Mascota> current = mascotas.getHead();

        while (current != null && encontrada == null) {
            if (current.getData().getNombre().equalsIgnoreCase(nombre)) {
                encontrada = current.getData();
            }
            current = current.getNext();
        }

        if (encontrada == null) {
            System.out.println("La mascota no existe.");
            return;
        }

        mascotas.remove(encontrada);
        System.out.println(encontrada + " eliminada correctamente.");
    }

    private static void mostrar() {
        if (mascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas.");
            return;
        }

        System.out.println("Mascotas del refugio: ");
        Node<Mascota> current = mascotas.getHead();
        int i = 1;

        while (current != null) {
            System.out.println(i + ". " + current.getData());
            current = current.getNext();
            i++;
        }
    }

    private static void calcularEdadPromedio() {
        if (mascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas.");
            return;
        }

        int suma = 0;
        Node<Mascota> current = mascotas.getHead();

        while (current != null) {
            suma += current.getData().getEdadMeses();
            current = current.getNext();
        }

        double promedio = (double) suma / mascotas.getSize();
        System.out.printf("Edad promedio del refugio: %.1f meses%n", promedio);
    }

    private static String leerTexto(String mensaje) {
        String texto;

        do {
            System.out.print(mensaje);
            texto = sc.nextLine().trim();

            if (texto.isEmpty()) {
                System.out.println("El campo no puede estar vacío.");
            }
        } while (texto.isEmpty());

        return texto;
    }

    private static String leerEspecie() {
        while (true) {
            System.out.print("Ingresa la especie (Perro/Gato): ");
            String especie = sc.nextLine().trim();

            if (especie.equalsIgnoreCase("perro")) {
                return "Perro";
            }

            if (especie.equalsIgnoreCase("gato")) {
                return "Gato";
            }

            System.out.println("Especie no válida. Escribe Perro o Gato.");
        }
    }

    private static int leerEdad() {
        int edad;

        do {
            edad = leerEntero("Ingresa la edad en meses: ");

            if (edad < 0) {
                System.out.println("La edad no puede ser negativa.");
            }
        } while (edad < 0);

        return edad;
    }

    private static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);

            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un número entero válido.");
            }
        }
    }
}