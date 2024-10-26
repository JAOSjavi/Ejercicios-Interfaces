package EjercicioLibro;


public class Revista extends Publicacion {
    private int numero;

    public Revista(String codigo, String titulo, int añoPublicacion, int numero) {
        super(codigo, titulo, añoPublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero: " + numero;
    }
}
