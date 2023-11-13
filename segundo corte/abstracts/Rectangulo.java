package Abstracts;

public class Rectangulo extends FiguraGeometrica {
    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("se dibuja un: " + this.getClass().getSimpleName());
    }
    
}