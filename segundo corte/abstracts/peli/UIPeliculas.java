package movie.ui;

import movie.modelo.*;
import javax.swing.JOptionPane;

public class UIPeliculas {
    public static void interfazUsuario() {
        ICatalogoPeliculas peliculas = new ImplementacionCatalogoPelicula();
        Pelicula pelicula;
        CERRAR:
        while (true) {
            String opcion = JOptionPane.showInputDialog(null, """
                                                              1 - Insertar Pelicula
                                                              2 - Listar Pelicula
                                                              3 - Buscar Pelicula
                                                              4 - Salir""",
                    "Ingrese una opción",
                    3
            );
            switch (opcion) {
                case "1" -> {
                    String nombrePelicula = JOptionPane.showInputDialog(
                            null,
                            "INGRESE EL NOMBRE DE LA PELICULA",
                            "Entrada",
                            3
                    );
                    pelicula = new Pelicula(nombrePelicula);
                    peliculas.insertarPelicula(pelicula);
                }
                case "2" -> peliculas.listarPelicula();
                case "3" -> {
                    String nombrePelicula = JOptionPane.showInputDialog(
                            null,
                            "INGRESE EL NOMBRE DE LA PELICULA",
                            "Ingrese",
                            3
                    );
                    peliculas.buscarPelicula(nombrePelicula);
                }
                case "4" -> {
                    break CERRAR;
                }
                default -> JOptionPane.showMessageDialog(null, """
                                                               OPCION INCORRECTA
                                                               VULEVE A INGRESAR UNA 
                                                               OPCION CORRECTA
                                                               LAS OPCIONES SON DE 1 A 4""",
                            "ERROR",
                            JOptionPane.ERROR_MESSAGE
                    );
            }
        }
    }
}