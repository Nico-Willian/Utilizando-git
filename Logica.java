import java.util.Scanner;

public class Logica{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = input.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = input.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma dos numeros é: " + soma);
        input.close();
    }
}