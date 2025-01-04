package iniciantes;

import java.io.IOException;
import java.util.Scanner;

public class Media1 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas A e B
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        // Cálculo da média ponderada
        double MEDIA = (A * 3.5 + B * 7.5) / 11;

        // Imprimindo o resultado com 5 casas decimais
        System.out.printf("MEDIA = %.5f\n", MEDIA);

        // Fechar o scanner
        scanner.close();
    }
}
