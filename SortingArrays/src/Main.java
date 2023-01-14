import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n: ");
        int number = input.nextInt();

        int[] matrix = new int[number];
        int temp = matrix[0];

        System.out.println("Dizinin elemanlarını giriniz : ");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + 1 + ". elemanı: ");
            matrix[i] = input.nextInt();
        }

        System.out.print("Sıralama:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i] < matrix[j]) {
                    temp = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = temp;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(" " + matrix[i]);
        }
    }
}