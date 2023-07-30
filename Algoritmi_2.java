public class Algoritmi_2 {

    public static void main(String[] args) {
        
        int[] array = ArrayUtils.prepareArray();
        ArrayUtils.printArray(array);
        SortUtils.directSort(array);
        ArrayUtils.printArray(array);
        System.out.println();

        array = ArrayUtils.prepareArray();
        ArrayUtils.printArray(array);
        SortUtils.quikSort(array);
        ArrayUtils.printArray(array);

        int[] ddd = {1, 3, 5, 10, 12, 14 };
        ArrayUtils.printArray(ddd);
        int ind = SearchUtils.binarSearch(array, 10);
        System.out.println(ind);
        System.out.println();

        array = ArrayUtils.prepareArray();
        ArrayUtils.printArray(array);
        SortUtils.heapSoft(array);
        ArrayUtils.printArray(array);
    }
    
}
