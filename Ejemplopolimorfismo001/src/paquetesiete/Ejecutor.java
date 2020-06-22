package paquetesiete;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
         clase uno abstracta llamada Figura; con atributos:
         características y área; la clase debe tener un método
         abstracto calcular_area.
         - clase llamada Triángulo (hereda de Figura); con
         atributos: base y altura.
         - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
         diagonal mayor.
         - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
         - clase Ejecutor, que permite generar:
         4 objetos de tipo Cuadrado
         3 objetos de tipo Rombo
         5 objeto de Triángulo 
         Comprobar el concepto del polimorfismo.
         */

        // inicio de la solución
        String caracteristicas;
        double base;
        double altura;
        double diagonal_menor;
        double diagonal_mayor;
        double lado;
        int contador = 0;
        int lim;
        int tipoFigura;
        ArrayList<Figura> figuras = new ArrayList<>();

        System.out.println("Digite el numero de figuras que decea ingresar ");
        lim = entrada.nextInt();
        while (contador < lim) {
            System.out.println("Tipo de Figura a ingresar\n"
                    + "Ingrese (1) para Cuadrado\n"
                    + "Ingrese (2) para Rombo\n"
                    + "Ingrese (3) para Triangulo\n");
            tipoFigura = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese su caracteristica");
            caracteristicas = entrada.nextLine();

            if (tipoFigura == 1) {
                for (int i = 0; i < 4; i++) {
                    System.out.printf("Cuadrado numero: %d\n", (i + 1));
                    Cuadrado c = new Cuadrado();
                    System.out.println("Ingrese el lado:");
                    lado = entrada.nextDouble();
                    c.establecerCaracteristicas(caracteristicas);         
                    c.establecerLado(lado);
                    
                    figuras.add(c);
                }
            } else {
                if (tipoFigura == 2) {
                    for (int j = 0; j < 3; j++) {
                        System.out.printf("Rombo numero: %d\n", (j + 1));
                        Rombo r = new Rombo();
                        System.out.println("Ingrese el valorde la diagonal menor: ");
                        diagonal_menor = entrada.nextDouble();
                        System.out.println("Ingrese el valorde la diagonal mayor: ");
                        diagonal_mayor = entrada.nextDouble();
                        
                        r.establecerCaracteristicas(caracteristicas);   
                        r.establecerDiagonal_mayor(diagonal_mayor);
                        r.establecerDiagonal_menor(diagonal_menor);
                        
                        figuras.add(r);
                    }
                } else {
                    for (int j = 0; j < 5; j++) {
                        Triangulo t = new Triangulo();
                        System.out.printf("Triangulo numero: %d\n", (j + 1));
                        System.out.println("Ingrese el valor de la base: ");
                        base = entrada.nextDouble();
                        System.out.println("Ingrese el valor de la altura: ");
                        altura = entrada.nextDouble();

                        t.establecerCaracteristicas(caracteristicas);   
                        t.establecerBase(base);
                        t.establecerAltura(altura);
                        
                        figuras.add(t);
                    }
                }

            }
            contador = contador + 1;
        }

        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcular_area();

            System.out.printf("\nDatos de Figura\n"
                    + "%s\n",
                    figuras.get(i));
        }
    }
}
