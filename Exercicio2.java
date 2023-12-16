import java.util.Objects;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva a temperatura atual:");
        double temperaturaAtual = input.nextDouble();
        System.out.println("Escreva a medida atual: (kelvin, celsius ou fahrenheit)");
        input.nextLine();
        String medidaAtual = input.nextLine().toLowerCase();
        System.out.println("Escreva a medida final: (kelvin, celsius ou fahrenheit)");
        String medidaFinal = input.nextLine().toLowerCase();

        converterTemperatura(temperaturaAtual, medidaAtual, medidaFinal);

        input.close();
    }

    public static void converterTemperatura(double temperaturaAtual,
                                            String medidaAtual,
                                            String medidaFinal) {
        String Tk = "kelvin";
        String Tc = "celsius";
        String Tf = "fahrenheit";
        double output;

        if (Objects.equals(medidaAtual, Tk) && Objects.equals(medidaFinal, Tc)) {
            output = temperaturaAtual - 273;
            System.out.printf("Temperatura atual = %.2f \n", temperaturaAtual);
            System.out.printf("Medida atual = %s \n", medidaAtual);
            System.out.printf("Medida final = %s \n", medidaFinal);
            System.out.printf("Output = %.2f", output);

        } else if (Objects.equals(medidaAtual, Tk) && Objects.equals(medidaFinal, Tf)) {
            output = ((9 * (temperaturaAtual - 273)) / 5) + 32;
            System.out.printf("Temperatura atual = %.2f \n", temperaturaAtual);
            System.out.printf("Medida atual = %s \n", medidaAtual);
            System.out.printf("Medida final = %s \n", medidaFinal);
            System.out.printf("Output = %.2f", output);

        } else if (Objects.equals(medidaAtual, Tc) && Objects.equals(medidaFinal, Tk)) {
            output = temperaturaAtual + 273;
            System.out.printf("Temperatura atual = %.2f \n", temperaturaAtual);
            System.out.printf("Medida atual = %s \n", medidaAtual);
            System.out.printf("Medida final = %s \n", medidaFinal);
            System.out.printf("Output = %.2f", output);

        } else if (Objects.equals(medidaAtual, Tc) && Objects.equals(medidaFinal, Tf)) {
            output = ((9 * temperaturaAtual) / 5) + 32 ;
            System.out.printf("Temperatura atual = %.2f \n", temperaturaAtual);
            System.out.printf("Medida atual = %s \n", medidaAtual);
            System.out.printf("Medida final = %s \n", medidaFinal);
            System.out.printf("Output = %.2f", output);

        } else if (Objects.equals(medidaAtual, Tf) && Objects.equals(medidaFinal, Tc)) {
            output = (5 * (temperaturaAtual - 32)) / 9;
            System.out.printf("Temperatura atual = %.2f \n", temperaturaAtual);
            System.out.printf("Medida atual = %s \n", medidaAtual);
            System.out.printf("Medida final = %s \n", medidaFinal);
            System.out.printf("Output = %.2f", output);

        } else if (Objects.equals(medidaAtual, Tf) && Objects.equals(medidaFinal, Tk)) {
            output = ((5 * (temperaturaAtual - 32)) / 9)  + 273;
            System.out.printf("Temperatura atual = %.2f \n", temperaturaAtual);
            System.out.printf("Medida atual = %s \n", medidaAtual);
            System.out.printf("Medida final = %s \n", medidaFinal);
            System.out.printf("Output = %.2f", output);

        } else {
            System.out.println("Entrada inválida!");
        }
    }
}