public class SubArray {
    public static void main(String ar[]) {
        int array[] = { 2, 3, 4, 5 };
        for (int k = 0; k < array.length; k++) {
            for (int i = k; i < array.length; i++) {
                for (int j = k; j <= i; j++) {
                    System.out.print(array[j]);
                }
                System.out.println();
            }

        }
    }
}