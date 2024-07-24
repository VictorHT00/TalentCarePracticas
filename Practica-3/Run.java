import java.util.Scanner;

public class Run{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número como base: ");
        int numeroBase = scanner.nextInt();

        System.out.print("Ingrese un número como exponente: ");
        int numeroExponente = scanner.nextInt();

        scanner.close();

        int resultado = 0;

        for(int i = 0; i < numeroExponente; i++){
            resultado += numeroBase;
        }

        System.out.println("El resultado de " + numeroBase + "^" + numeroExponente + " es: " + resultado);
    }
}