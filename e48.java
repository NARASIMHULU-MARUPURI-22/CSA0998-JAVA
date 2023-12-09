public class e48 {

    public static void duplicateZeros(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] == 0) {
                // Shift elements to the right starting from the end
                for (int j = length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                // Duplicate the zero
                arr[i + 1] = 0;
                // Move the index to skip the duplicated zero
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};

        System.out.println("Original array: " + java.util.Arrays.toString(arr));

        duplicateZeros(arr);

        System.out.println("Modified array: " + java.util.Arrays.toString(arr));
    }
}
