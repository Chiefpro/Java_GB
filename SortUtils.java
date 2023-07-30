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
        int left = start, right = end;
        int middle = arr[(start + end) / 2]; // хначение опорного эллемента

        do {
            while (arr[left] < middle) {
                left++;
            }
            while (arr[right] > middle) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    int buf = arr[left];
                    arr[left] = arr[right];
                    arr[right] = buf;
                }
                left++;
                right--;
            }

        } while (left <= right);

        if (left < end) {
            quikSort(arr, left, end);
        }
        if (start < right) {
            quikSort(arr, start, right);
        }
    }

    /**
     * Пирамидальная сортировка
     * 
     * @param arr
     * @return
     */
    public static int[] heapSoft(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--)
            heapify(arr, arr.length, i);

        for (int i = arr.length - 1; i >= 0; i++) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
        return arr;

    }

    private static void heapify(int[] arr, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && arr[leftChild] > arr[largest])
            largest = leftChild;

        if (rightChild < heapSize && arr[rightChild] > arr[largest])
            largest = rightChild;

        if (largest != rootIndex) {
            int temp = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = temp;

            heapify(arr, heapSize, largest);
        }
    }

}
