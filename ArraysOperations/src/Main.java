import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {9,3,54,-6,7,23,230,4,1,134,6};
        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[0];

        System.out.print("Girilen sayı: ");
        int number= input.nextInt();

        for(int i = 0;i< arr.length;i++){
            if(arr[i] < number){
                min = arr[i];
            }
            if(arr[i] > number){
                max = arr[i];
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}