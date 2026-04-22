package LISTAREVISAOJAVA;
import java.util.Scanner;

public class CalculadoraPintura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double alturaParede = 2.7;
        double rendimento_litro = 10.0;
        double desconto_abertura = 0.10;

        System.out.println("Digite a largura da parede em metros: ");
        double larguraParede = entrada.nextDouble();

        double areaParede = alturaParede * larguraParede;
        double areaTotal = areaParede * 4;

        double areaLiquida = areaTotal * (1 - desconto_abertura);

        double litrosNecessarios = areaLiquida / rendimento_litro;

        System.out.println("Área total da parede: " + areaTotal + " metros quadrados");
        System.out.println("Área liquida da parede: " + areaLiquida + " metros quadrados");
        System.out. println("Litros necessários: " + litrosNecessarios + " litros");
        
        entrada.close();

    }
    
}
