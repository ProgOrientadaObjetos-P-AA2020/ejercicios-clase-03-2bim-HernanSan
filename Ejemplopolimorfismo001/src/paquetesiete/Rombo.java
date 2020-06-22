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
public class Rombo extends Figura {

    private double diagonal_menor;
    private double diagonal_mayor;

    public double obtenerDiagonal_menor() {
        return diagonal_menor;
    }

    public void establecerDiagonal_menor(double diagonal_me) {
        diagonal_menor = diagonal_me;
    }

    public double obtenerDiagonal_mayor() {
        return diagonal_mayor;
    }

    public void establecerDiagonal_mayor(double diagonal_ma) {
        diagonal_mayor = diagonal_ma;
    }

    public double obtenerCalcularArea() {
        return calcular_area;
    }

 
    public void calcular_area() {
        calcular_area = (diagonal_menor * diagonal_mayor) / 2;
    }
}
