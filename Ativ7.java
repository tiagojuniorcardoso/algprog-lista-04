import java.util.Scanner;

public class Ativ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maior = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double num = scanner.nextDouble();

            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
        scanner.close();
    }
}
