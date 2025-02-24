/*
Crear un package llamado Models dentro de src.
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. 
**Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
//Jorge Gonzalo Hernández Yonemoto
// Importamos la clase Libro del paquete Models
import Models.Libro;
import java.util.Scanner;

// Definimos la clase principal App
public class App {

    // Método principal donde inicia la ejecución del programa
    public static void main(String[] args) throws Exception {
        // Creamos un objeto Scanner para recibir la entrada del usuario
        Scanner opc = new Scanner(System.in);

        // Creamos un objeto de la clase Libro
        Libro libro = new Libro();

        // Solicitamos al usuario que ingrese el ISBN del libro
        System.out.println("Ingresa el ISBN (código identificador) del libro:");

        // Leemos el ISBN ingresado y lo asignamos al objeto libro
        libro.setIsbn(opc.nextInt());

        // Solicitamos al usuario que ingrese el título del libro
        System.out.println("Ingresa el título del libro: ");

        // Leemos el título del libro y lo asignamos al objeto libro
        // Se usa next() pero capturará solo la primera palabra, por lo que sería mejor usar nextLine()
        libro.setTitulo(opc.next());

        // Consumimos el salto de línea que dejó nextInt() para evitar que se salte la siguiente entrada
        opc.nextLine();

        // Solicitamos al usuario que ingrese el nombre del autor del libro
        System.out.println("Ingresa el nombre del autor del libro: ");

        // Leemos el nombre del autor y lo asignamos al objeto libro
        // De nuevo, next() solo captura una palabra, mejor usar nextLine() si se esperan nombres compuestos
        libro.setAutor(opc.next());

        // Solicitamos al usuario que ingrese el número de páginas del libro
        System.out.println("Ingresa el número de páginas del libro: ");

        // Leemos el número de páginas ingresado y lo asignamos al objeto libro
        libro.setNumPags(opc.nextInt());
        opc.nextLine();

        // Llamamos al método consultarLibro() para mostrar los detalles del libro
        libro.consultarLibro();

        // Confirmamos que los datos fueron cargados exitosamente
        System.out.println("Datos cargados con éxito");

        // Cerramos el scanner para liberar recursos
        opc.close();
    }
}
