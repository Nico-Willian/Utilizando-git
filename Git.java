import java.util.Scanner;
/*
git init [iniciar o git]
git status
git log
git add . ou nome do arquivo
git commit -m "mensagem"
git checkout (6 primeiras letras da log ou a branch)
git branch (nome da branch)
git branch -m (nome) [renomear nome da branch]
git merge (nome da branch) [lembrar de voltar para a linha principal]
git clone (url) [instalar as coisas git hub]
*/
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