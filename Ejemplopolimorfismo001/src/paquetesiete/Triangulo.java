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
public class Triangulo extends Figura {

    private double base;
    private double altura;

    public double obtenerBase() {
        return base;
    }

    public void establecerBase(double b) {
        base = b;
    }

    public double obtenerAltura() {
        return altura;
    }

    public void establecerAltura(double a) {
        altura = a;
    }

    public double obtenerCalcularArea() {
        return calcular_area;
    }

 
    public void calcular_area() {
        calcular_area = base * altura;
    }
    
}
