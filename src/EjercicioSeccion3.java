import java.util.*;
import java.util.stream.Collectors;

class Pelicula {
    private String titulo;
    private String director;
    private int estreno;

    public Pelicula(String titulo, String director, int estreno) {
        this.titulo = titulo;
        this.director = director;
        this.estreno = estreno;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getEstreno() {
        return estreno;
    }

    @Override
    public String toString() {
        return titulo + " (" + director + ", " + estreno + ")";
    }
}

public class EjercicioSeccion3 {
    public static void main(String[] args) {
        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("E.T.", "Steven Spielberg", 1982));
        peliculas.add(new Pelicula("Avatar", "James Cameron", 2009));
        peliculas.add(new Pelicula("Salvar al soldado Ryan", "Steven Spielberg", 1998));
        peliculas.add(new Pelicula("Origen", "Christopher Nolan", 2010));
        peliculas.add(new Pelicula("L.A. Confidential", "Curtis Hanson", 1997));

        // Peliculas estrenadas siglo XXI
        List<Pelicula> peliculasSigloXXI = peliculas.stream()
                .filter(p -> p.getEstreno() >= 2000)
                .collect(Collectors.toList());

        // Peliculas de Steven Spielberg
        String titulosSpielberg = peliculas.stream()
                .filter(p -> p.getDirector().equals("Steven Spielberg"))
                .map(Pelicula::getTitulo)
                .collect(Collectors.joining(", "));
        System.out.println("Películas de Steven Spielberg: " + titulosSpielberg);

        // Nombres peliculas ordenadas
        List<String> titulosOrdenados = peliculas.stream()
                .map(Pelicula::getTitulo)
                .sorted()
                .collect(Collectors.toList());

        // Mostrar resultados (opcional para verificar)
        System.out.println("Películas del siglo XXI: " + peliculasSigloXXI);
        System.out.println("Películas ordenadas alfabéticamente: " + titulosOrdenados);
    }
}
