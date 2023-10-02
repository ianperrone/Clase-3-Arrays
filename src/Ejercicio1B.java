import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
        mismos y los retorne en un vector de 3 */


public class Ejercicio1B {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Escriba el primer número: ");
        Integer numero1 = scaner.nextInt();
        System.out.println("Escriba el segundo número: ");
        Integer numero2 = scaner.nextInt();
        System.out.println("Escriba el tercer número: ");
        Integer numero3 = scaner.nextInt();
        Integer numeros[] = new Integer[]{numero1, numero2, numero3};
        System.out.println("Desea ordernarlo de forma ascendente? Escriba 1. Sino, otro número:  ");
        int ascendente = scaner.nextInt();
        if (ascendente == 1)
        {
            Arrays.sort(numeros);
        }
        else {Arrays.sort(numeros, Collections.reverseOrder());}
        System.out.println("El Array ordenado: ");
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print(numeros[i] + " - ");
        }
    }
}
