import java.util.Scanner;

public class Informacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validação do Nome
        String nome;
        do {
            System.out.print("Digite o nome (mais de 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);

        // Validação da Idade
        int idade;
        do {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        // Validação do Salário
        double salario;
        do {
            System.out.print("Digite o salário (maior que 0): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        // Validação do Sexo
        char sexo;
        do {
            System.out.print("Digite o sexo ('f' ou 'm'): ");
            sexo = scanner.next().toLowerCase().charAt(0);
        } while (sexo != 'f' && sexo != 'm');

        // Validação do Estado Civil
        char estadoCivil;
        do {
            System.out.print("Digite o estado civil ('s', 'c', 'v', 'd'): ");
            estadoCivil = scanner.next().toLowerCase().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("\n--- Dados Validados com Sucesso ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}