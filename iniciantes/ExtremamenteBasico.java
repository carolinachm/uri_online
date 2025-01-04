package iniciantes;

import java.io.IOException;
import java.util.Scanner;

public class ExtremamenteBasico {
    
    public static void main(String[] args) throws IOException {
         Scanner scanner = new Scanner(System.in);

        // Leitura dos valores inteiros A e B
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Efetuando a soma e armazenando o resultado em X
        int X = A + B;

        // Imprimindo o resultado de forma formatada
        System.out.printf("X = %d\n", X);

        // Fechar o scanner
        scanner.close();
    }
}
