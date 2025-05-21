import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr [] ={6,3,9,5,2,8};
        int n = arr.length;
        System.out.println("Before Merging");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Merging");
        divide(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void divide(int arr[],int s,int e){
        if(s<e){
            int mid = (s+e)/2;
            divide(arr, s, mid);
            divide(arr, mid+1, e);
            conquer(arr,s,mid,e);
        }
    }

    public static  void conquer(int arr [],int s,int mid, int e){
        int n1= mid-s+1;
        int n2= e-mid;
        int larr [] = new int[n1] ; 
        int rarr [] = new int[n2];

        for(int i=0;i<n1;i++){
            larr[i]= arr[s+i];
        }
        for(int i=0;i<n2;i++){
            rarr[i]= arr[mid+1+i];
        }

        int i=0, j=0;
        int k=s;

        while(i<n1 && j<n2){
            if(larr[i] <= rarr[j] ){
                arr[k] = larr[i];
                i++;
            }
            else{
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }
        while (i<n1) {
            arr[k] = larr[i];
            i++;
            k++;
        }
        while (j<n2) {
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }
}
