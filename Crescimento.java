import java.util.Scanner;

public class Crescimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repetir;

        do {
            double popA, taxaA, popB, taxaB;

            // Entrada População A
            do {
                System.out.print("Informe a população do País A (maior que 0): ");
                popA = scanner.nextDouble();
            } while (popA <= 0);

            // Entrada Taxa A
            do {
                System.out.print("Informe a taxa de crescimento do País A (%): ");
                taxaA = scanner.nextDouble();
            } while (taxaA <= 0);

            // Entrada População B
            do {
                System.out.print("Informe a população do País B (maior que 0): ");
                popB = scanner.nextDouble();
            } while (popB <= 0);

            // Entrada Taxa B
            do {
                System.out.print("Informe a taxa de crescimento do País B (%): ");
                taxaB = scanner.nextDouble();
            } while (taxaB <= 0);

            int anos = 0;
            double taxaAFormatada = taxaA / 100;
            double taxaBFormatada = taxaB / 100;

            while (popA < popB) {
                popA += popA * taxaAFormatada;
                popB += popB * taxaBFormatada;
                anos++;
            }

            System.out.println("\nTempo necessário: " + anos + " anos.");

            System.out.print("\nDeseja repetir a operação? (s/n): ");
            repetir = scanner.next().toLowerCase().charAt(0);

        } while (repetir == 's');

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
