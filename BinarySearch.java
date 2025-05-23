public class BinarySearch {
    public static void main(String[] args) {
        int arr []= {1,7,9,24,45,89,100};
        int key = 100;
        int index =binarySearch(arr, 0, arr.length-1,key);
        System.out.println("Element "+key+" is present on "+index+" of the given array");
    }

    private static int binarySearch(int arr[],int low, int high,int key){
        int mid= (low+high)/2;

        while(low<=high){
            if(arr[mid]<key){
                low = mid +1;
            }
            else if(arr[mid]==key){
                return mid;
            }
            else{
                high = mid -1;
            }
            mid = (low + high) / 2;
        }
        return -1; //If we reach here means element is not present
    }
}
