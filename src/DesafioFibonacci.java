import java.util.Scanner;

public class DesafioFibonacci {
    public static void main(String[] args) {
       //Criar Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um numero abaixo:");
        int fibonacci = scanner.nextInt();

        if(scannerFibonati(fibonacci)) {
            System.out.println("(" + fibonacci + ")" + "\sPertence a sequencia de Fibonacci!");
        } else {
            System.out.println("Não pertence!");
        }
        scanner.close();
    }
    private static boolean scannerFibonati(int fibonacci) {
        if(fibonacci <= 1) {
            return fibonacci == 1;
        }
        int f = 0, i = 1;

        while (i <= fibonacci) {
            if (i == fibonacci)
                return true;
        }
        int looping = f + i;
        f = i;
        i = looping;
        return false;
        }
    }
