package tarea;

import java.util.function.BiFunction;

public class IvaVenta {

    private static double porcentajeIva;

    public static double calcularIva(int precio, double... valorImpuesto) {
        // Valida si se ha ingresado un porcentaje variable, de lo contrario asignará siempre el 21%
        double porcentaje = (valorImpuesto.length > 0) ? porcentajeIva : 21;

        //Función lambda para calcular el IVA
        BiFunction<Integer, Double, Double> funcCalcularIva = (p, pct) -> p * (1+(pct/100));

        return funcCalcularIva.apply(precio, porcentaje);
    }

    public static void main(String[] args) {
        porcentajeIva = 8;
        int precioVenta = 100000;

        double ivaFijo = calcularIva(precioVenta);
        double ivaVariable = calcularIva(precioVenta, porcentajeIva);

        System.out.println();
        System.out.println("El precio aplicando el IVA del 21% es: " + ivaFijo);
        System.out.println();
        System.out.println("El precio aplicando IVA variable es: " + ivaVariable);
    }
}
