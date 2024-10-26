package EjercicioLibro;

// Clase Libro que extiende Publicacion e implementa Prestable
public class Libro extends Publicacion implements Prestable {
    private boolean prestado;

    public Libro(String codigo, String titulo, int añoPublicacion) {
        super(codigo, titulo, añoPublicacion);
        this.prestado = false; 
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro no estaba prestado.");
        }
    }

    @Override
    public boolean prestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Prestado: " + prestado;
    }
}
