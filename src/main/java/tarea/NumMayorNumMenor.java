package tarea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumMayorNumMenor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Ingresa la cantidad de números que deseas evaluar: ");
        int cantNumeros = scanner.nextInt();

        System.out.println("Ingresa los números uno por uno: ");
        for (int i = 0; i < cantNumeros; i++){
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        int numMayor = numeros.stream().max(Integer::compare).orElse(0);
        int numMenor = numeros.stream().min(Integer::compare).orElse(0);

        System.out.println("El número mayor es: " + numMayor);
        System.out.println("El número menor es: " + numMenor);
    }
}
