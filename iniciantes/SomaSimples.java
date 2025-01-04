package iniciantes;

import java.io.IOException;
import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores inteiros A e B
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Calculando a soma e atribuindo à variável SOMA
        int SOMA = A + B;

        // Imprimindo o resultado formatado
        System.out.printf("SOMA = %d\n", SOMA);

        // Fechar o scanner
        scanner.close();
    }
    
}
