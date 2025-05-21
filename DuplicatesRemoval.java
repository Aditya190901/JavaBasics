import java.util.LinkedHashSet;

public class DuplicatesRemoval {
    public static void main(String[] args) {
        int [] arr = {11,35,35,55,65,65,81};
        // int j =1;
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]!=arr[i-1]){
        //         arr[j++]=arr[i];
        //     }
            
        // }
        // for(int i=0;i<j;i++){
        //      System.out.print(arr[i]+" ");
        // }

        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
       
    }
}
