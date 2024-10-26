package EjercicioLibro;

// Clase base Publicacion
public abstract class Publicacion {
    protected String codigo;
    protected String titulo;
    protected int añoPublicacion;

    public Publicacion(String codigo, String titulo, int añoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Título: " + titulo + ", Año de Publicación: " + añoPublicacion;
    }
}