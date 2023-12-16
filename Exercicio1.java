import java.util.Objects;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a operação:\n" +
                           "somar: +\n" +
                           "subtrair: -\n" +
                           "dividir: /\n" +
                           "multiplicar: *");
        String operacao = input.nextLine();
        if (Objects.equals(operacao, "/")){
            System.out.println("Insira o primeiro número:");
            double num1 = input.nextDouble();
            System.out.println("Insira o segundo número:");
            double num2 = input.nextDouble();
            dividir(num1, num2);
        } else {
            System.out.println("Insira quantos números quer utilizar na operação:");
            int quantidadeDeNumeros = input.nextInt();
            double[] numeros = new double[quantidadeDeNumeros];

            for (int i = 0; i < quantidadeDeNumeros; i++){
                System.out.printf("Insira o número %d:\n", i+1);
                numeros[i] = input.nextDouble();
            }

            if (Objects.equals(operacao, "+")) {
                somar(numeros, quantidadeDeNumeros);
            }else if (Objects.equals(operacao, "-")) {
                subtrair(numeros, quantidadeDeNumeros);
            } else if (Objects.equals(operacao, "*")) {
                multiplicar(numeros, quantidadeDeNumeros);
            } else {
                System.out.println("Operação inválida!");
            }
        }

        input.close();
    }

    public static void somar(double[] numeros, int quantidadeDeNumeros) {
        double soma = 0;
        for (int i = 0; i < quantidadeDeNumeros; i++){
            soma += numeros[i];
        }
        System.out.printf("Soma: %.2f", soma);
    }

    public static void subtrair(double[] numeros, int quantidadeDeNumeros) {
        double subtracao = 0;
        for (int i = 0; i < quantidadeDeNumeros; i++){
            subtracao -= numeros[i];
        }
        System.out.printf("Subtração: %.2f", subtracao);
    }

    public static void dividir(double num1, double num2) {
        if (num2 != 0) {
            double divisao = num1 / num2;
            System.out.printf("Divisão: %.2f\n", divisao);
        } else{
            System.out.println("Divisão por zero!");
        }
    }

    public static void multiplicar(double[] numeros, int quantidadeDeNumeros) {
        double multiplicacao = 1;
        for (int i = 0; i < quantidadeDeNumeros; i++){
            multiplicacao *= numeros[i];
        }
        System.out.printf("Multiplicação: %.2f", multiplicacao);
    }
}
