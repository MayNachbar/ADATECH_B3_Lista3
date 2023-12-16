import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o tempo gasto na viagem (em horas):");
        Double tempoGasto = input.nextDouble();
        System.out.println("Insira a velocidade média durante a mesma (em km/h):");
        Double velocidadeMedia = input.nextDouble();

        calculaQuantidadeDeLitros(tempoGasto, velocidadeMedia);

        input.close();
    }
    
    public static void calculaQuantidadeDeLitros(Double tempoGasto, Double velocidadeMedia) {

        double distanciaPercorrida = velocidadeMedia * tempoGasto;
        double quantidadeDeLitros = distanciaPercorrida / 12.0;

        System.out.printf("A distância percorrida na viagem foi de %.2f metros.%n", distanciaPercorrida);
        System.out.printf("A quantidade de litros de combustível gastos na viagem foi de %.3f.", quantidadeDeLitros);
    }
}
