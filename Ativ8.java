import java.util.Scanner;

public class Ativ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double num = scanner.nextDouble();
            soma += num;
        }

        double media = soma / 5;

        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);

        scanner.close();
    }
}
