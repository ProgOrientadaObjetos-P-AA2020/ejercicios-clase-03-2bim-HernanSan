package paquetesiete;

/**
 *
 * @author reroes
 */
public  abstract class Figura {
    protected String caracteristicas;
    protected double area;
    protected double calcular_area;
    String cadena;
    public abstract void calcular_area();

    public String obtenerCaracteristicas() {
        return caracteristicas;
    }

    public void establecerCaracteristicas(String c) {
      caracteristicas = c;
    }

    public double obtenerCalcularArea() {
        return calcular_area;
    }

     @Override
    public String toString() {
        cadena = String.format("Caracteristica: %s\n"
                + "Area: %.2f",
                obtenerCaracteristicas(),
                obtenerCalcularArea());
       return cadena;
    }

}
