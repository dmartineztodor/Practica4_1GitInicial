import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de usuarios que deseas crear: ");
        int cantidad = teclado.nextInt();
        teclado.nextLine(); // Limpiar Buffer
        Usuario[] usuarios = crearUsuarios(cantidad);

        System.out.println("Hola mundo.");
        mostrarFechaHora();
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.nombre + " " + usuario.apellidos + " " + usuario.email);
        }

        teclado.close();
    }

    public static void mostrarFechaHora() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Fecha y hora actual: " + ahora.format(formato));
    }

    public static Usuario[] crearUsuarios(int cantidad) {
        Scanner teclado = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[cantidad];

        for (int i = 0; i < cantidad; i++) {
            usuarios[i] = new Usuario();
            System.out.println("Nombre: ");
            usuarios[i].nombre = teclado.nextLine();
            System.out.println("Apellidos: ");
            usuarios[i].apellidos = teclado.nextLine();
            System.out.println("Email: ");
            usuarios[i].email = teclado.nextLine();
        }
        teclado.close();
        return usuarios;
    }
}