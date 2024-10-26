package EjercicioLibro;


// Clase principal para probar el programa
public class Biblioteca {
    public static void main(String[] args) {

        // Crear un libro
        Libro libro = new Libro("L001", "Cien años de Soledad", 1967);
        System.out.println(libro.toString());
        libro.prestar();
        System.out.println("Estado de prestamo: " + libro.prestado());
        libro.devolver();
        System.out.println("Estado de prestamo: " + libro.prestado());
        
        // Crear una revista
        Revista revista = new Revista("R001", "Tech Monthly", 2021, 15);
        System.out.println(revista.toString());

    }
}
