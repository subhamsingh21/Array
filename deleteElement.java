public class deleteElement {
    public static void deleteArrayElelment(int array[], int element) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];

                }
                count++;
                break;
            }

        }
        if (count == 0) {
            System.out.println("element not found in array");
        } else {
            System.out.print("element deleted ");
            for (int i = 0; i < array.length - 1; i++) {
                // System.out.print("element deleted - ");
                System.out.print(array[i] + " ");
            }
        }

    }

    public static void main(String ar[]) {
        int array[] = { 3, 4, 5, 6, 7, 8 };
        int element = 5;
        deleteArrayElelment(array, element);
    }
}
