import java.util.Scanner;

public class lista01_exercicio11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        double num3, resultado1, resultado2, resultado3;

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        num2 = input.nextInt();

        System.out.print("Digite o número real: ");
        num3 = input.nextDouble();

        resultado1 = (num1 * 2) * (num2 / 2.0);
        resultado2 = (num1 * 3) + num3;
        resultado3 = Math.pow(num3, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + resultado1);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + resultado2);
        System.out.println("O terceiro elevado ao cubo é: " + resultado3);
    }
}

