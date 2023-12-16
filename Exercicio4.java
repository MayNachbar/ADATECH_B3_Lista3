import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o nome do funcionário:");
        String nome = input.nextLine();
        System.out.println("Insira o número de horas trabalhadas por mês:");
        Integer numeroDeHorasPorMes = input.nextInt();
        System.out.println("Insira o valor da hora:");
        Double valorDaHora = input.nextDouble();

        calculaSalarioAnual(nome, numeroDeHorasPorMes, valorDaHora);

        input.close();
    }

    public static void calculaSalarioAnual(String nome, Integer numeroDeHorasPorMes, Double valorDaHora){
        double salarioAnual = numeroDeHorasPorMes * valorDaHora;
        System.out.printf("O salário anual do(a) funcionário(a) %s é R$%.2f.", nome, salarioAnual);
    }
}
