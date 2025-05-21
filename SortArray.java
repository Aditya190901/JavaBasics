import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int [] arr = {1,2,7,5,3};
        //with .sort keyword
        // Arrays.sort(arr);
        // System.out.print(Arrays.toString(arr));

        //O(n^2)
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
