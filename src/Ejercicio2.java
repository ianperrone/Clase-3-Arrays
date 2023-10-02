import java.util.Scanner;

/* Genere una clase que tenga los métodos para realizar la codificación y decodificación
        de un string, dado un número de desplazamiento.
        ● Por ejemplo, con desplazo de 1:
        “hola que tal” -> “ipmbarvfaubm”
        h -> i
        o -> p
        ● con desplazo de 2
        “hola que tal” -> “jqncbswgbvcn”
        h -> j
        o -> q
        */
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la frase a desplazar");
        String stringADesplazar = scanner.nextLine();
        byte[] decodedBytes = stringADesplazar.getBytes();
        for(int i = 0; i < decodedBytes.length; i++)
        {
            decodedBytes[i]++;
        }
        String desplazadoA1 = new String(decodedBytes);
        for(int i = 0; i < decodedBytes.length; i++)
        {
            decodedBytes[i]++;
        }
        String desplazandoA2 = new String(decodedBytes);
        System.out.println("String original: " + stringADesplazar);
        System.out.println("String desplazado a 1: " + desplazadoA1);
        System.out.println("String desplazado a 2: " + desplazandoA2);
    }
}
