public class Main {

    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 2, 4, 6, 7, 2, 1, 3, 6, 4};

        int[] newArray = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j]) && arr[i] % 2 == 0) {
                    newArray[index++] = arr[i];
                    break;
                }
            }
        }
        System.out.print(" [ ");

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] != 0) {
                System.out.print(newArray[i] + " ");
            }
        }
        System.out.print(" ] ");
    }
}