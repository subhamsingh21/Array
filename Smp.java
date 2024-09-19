public class Smp {
    public static boolean twiceValue(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    // System.out.println("ture");
                    return true;
                }

            }

        }
        return false;

    }

    public static void main(String ar[]) {
        int arr[] = { 1, 2, 3, 1, 4 };
        System.out.println(twiceValue(arr));
    }
}