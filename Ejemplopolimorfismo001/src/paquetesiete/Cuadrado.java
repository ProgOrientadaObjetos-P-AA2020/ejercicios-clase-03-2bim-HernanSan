/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

/**
 *
 * @author reroes
 */
public class Cuadrado extends Figura {

    private double lado;

    public double obtenerLado() {
        return lado;
    }

    public void establecerLado(double l) {
        lado = l;
    }
    
    public double obtenerCalcularArea() {
        return calcular_area;
    }
     public void calcular_area() {
        calcular_area = lado * lado;
    }
  
}
