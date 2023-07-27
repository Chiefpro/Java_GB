public class SortUtils {

    /**
     * Сортировка выбором
     * 
     * @param arr
     */
    public static void directSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int saveIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[saveIndex]) {
                    saveIndex = j;
                }
            }
            if (saveIndex != i) {
                int temp = arr[i];
                arr[i] = arr[saveIndex];
                arr[saveIndex] = temp;
            }
        }
    }

    /**
     * Быстрая сотрировка
     * 
     * @param arr
     */
    public static void quikSort(int[] arr) {
        if (arr == null)
            return;
        quikSort(arr, 0, arr.length - 1);
    }

    private static void quikSort(int[] arr, int start, int end) {

    }

}
