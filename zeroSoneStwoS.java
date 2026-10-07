import java.util.*;
public class zeroSoneStwoS{
    static void sortedArray(int arr[]){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main (String agrs[]){
        int [] arr = {0,1,1,0,1,2,1,2,0,0,0};
        sortedArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}t