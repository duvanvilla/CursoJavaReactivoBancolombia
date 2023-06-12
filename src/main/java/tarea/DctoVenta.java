package tarea;

import java.util.Scanner;
import java.util.function.Function;

public class DctoVenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el valor de la venta : ");
        double precioVenta = scanner.nextDouble();

        System.out.println("De cuanto es el descuento a aplicar: ");
        double valorDcto = scanner.nextDouble();

        Function<Double, Double> calcularPrecioFinal = precio -> precio * (1-(valorDcto/100));
        double precioFinal =  calcularPrecioFinal.apply(precioVenta);

        System.out.println("El precio final con descuento es: " + precioFinal);

    }
}
