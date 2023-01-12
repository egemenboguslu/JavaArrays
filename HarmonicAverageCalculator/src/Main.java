import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] harmonic = new double[5];
        double total = 0;

        for (int i = 0; i < harmonic.length; i++) {
            System.out.print(i + ". indisli elemanı girin: ");
            harmonic[i] = input.nextDouble();

            total = total + (1 / harmonic[i]);
        }
        
        System.out.println("Sayiların harmonik serisi: " + total);
        System.out.println("Harmonik ortalama: " + (harmonic.length / total));
    }
}