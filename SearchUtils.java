public class SearchUtils {

    public static int binarSearch(int[] arr, int value) {
        if (arr == null)
            return -1;
        return binarSearch(arr, value, 0, arr.length - 1);
    }

    private static int binarSearch(int[] arr, int value, int start, int end) {

        if (end < start){
            return -1;
        }
        
        int middle = (start + end) / 2;

        if (arr[middle] == value) {
            return middle;
        }

        else if (arr[middle] < value) {
            return binarSearch(arr, value, middle + 1, end);
        }

        else {
            return binarSearch(arr, value, start, middle - 1);
        }
    }

}
