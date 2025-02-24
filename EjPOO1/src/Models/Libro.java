// Definimos el paquete donde se encuentra la clase Libro
package Models;

// Definimos la clase Libro
public class Libro {

    // Atributos privados de la clase (encapsulación)
    private int isbn, numPags; // Almacena el código identificador (ISBN) y el número de páginas del libro
    private String titulo, autor; // Almacena el título y el autor del libro

    // Constructor con parámetros que permite inicializar un libro con sus datos
    public Libro(int isbn, String titulo, int numPags, String autor) {
        this.isbn = isbn; // Asigna el ISBN recibido al atributo de la clase
        this.titulo = titulo; // Asigna el título recibido al atributo de la clase
        this.numPags = numPags; // Asigna el número de páginas recibido al atributo de la clase
        this.autor = autor; // Asigna el autor recibido al atributo de la clase
    }

    // Constructor vacío que permite crear un objeto sin inicializar atributos
    public Libro() {
    }

    // Método que imprime la información del libro en la consola
    public void consultarLibro() {
        System.out.println("ISBN: " + isbn); // Muestra el ISBN del libro
        System.out.println("Título: " + titulo); // Muestra el título del libro
        System.out.println("Autor: " + autor); // Muestra el autor del libro
        System.out.println("Número de páginas: " + numPags); // Muestra el número de páginas del libro
    }

    // Métodos Getter y Setter para acceder y modificar los atributos de la clase

    // Obtiene el valor del ISBN
    public int getIsbn() {
        return isbn;
    }

    // Modifica el valor del ISBN
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    // Obtiene el número de páginas
    public int getNumPags() {
        return numPags;
    }

    // Modifica el número de páginas
    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    // Obtiene el título del libro
    public String getTitulo() {
        return titulo;
    }

    // Modifica el título del libro
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Obtiene el autor del libro
    public String getAutor() {
        return autor;
    }

    // Modifica el autor del libro
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
