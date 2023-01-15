import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] newArray = new int[arr.length];

        int count = 0;

        System.out.println("Tekrar Sayıları");

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    newArray[i] = ++count;
                }
            }
            i += newArray[i];

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " sayısı " + newArray[i] + " kez tekrar edildi.");
            i += newArray[i];
        }
    }
}