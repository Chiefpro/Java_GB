import java.util.Random;

public class ArrayUtils {

    
    
    private static Random random = new Random();
    

    public static int[] prepareArray(){
        return prepareArray(random.nextInt(10,15)); 
    }

     public static int[] prepareArray(int length){
        int arr[] = new int[length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(-99, 100);
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.printf("%d\t", i);
        }
    System.out.println();
    }


}
