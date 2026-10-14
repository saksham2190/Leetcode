import java.util.*;
public class rearrangeElementsBySign{
    static int[] elements(int [] arr){
        int pos = 0;
        int neg = 1;
        int n = arr.length;
        int ans [] = new int [n];
        

        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                ans[neg] = arr[i];
                neg += 2;
            }
            else{
                ans[pos] = arr[i];
                pos += 2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,-2,-1};
        int [] res = elements(arr);
        System.out.println(Arrays.toString(res));
    }
}