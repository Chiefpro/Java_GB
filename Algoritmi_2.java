public class Algoritmi_2 {

    public static void main(String[] args) {
        
        int[] array = ArrayUtils.prepareArray(10);
        ArrayUtils.printArray(array);
        SortUtils.directSort(array);
        ArrayUtils.printArray(array);
    }
    
}
