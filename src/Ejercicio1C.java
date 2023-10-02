//c. dado un vector de números, y un número X, que sume todos los números > X y
//      retorne el resultado


import java.util.Scanner;

public class Ejercicio1C {
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        int numeros[] = new int[]{12, 40, 55, 92, 13, 5, 20};
        System.out.println("Ingrese el número que que debe ser menor: ");
        int menor = scaner.nextInt();
        int suma = 0;
        for (int i = 0; i < numeros.length; i++)
        {
            if(numeros[i] > menor)
            {
                suma += numeros[i];
            }
        }
        System.out.println("La suma total de los números mayores a " + menor + " es de: " + suma);
    }
}
