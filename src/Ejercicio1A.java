import java.util.Scanner;

 /* a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String */


public class Ejercicio1A {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Escriba una frase: ");
        String frase = scaner.nextLine();
        System.out.println("Escriba una letra a buscar: ");
        char letra = scaner.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < frase.length(); i++)
        {
            if(frase.charAt(i) == letra)
            {
                contador++;
            }
        }
        System.out.println("La letra: " + letra + ", aparece " + contador + " veces en la frase: " + frase);
    }
}