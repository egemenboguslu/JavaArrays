import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        double total = 0.0;

        for (int j = 0; j < arr.length; j++) {
            System.out.print(j + ". indisli elemanı girin:");
            arr[j] = input.nextInt();
            total = total + arr[j];
        }

        System.out.println("Ortalama: " + (total / arr.length));
    }
}