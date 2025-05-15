import java.util.ArrayList;

public class OnlyOddNumberList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(8);
        arr.add(9);
        boolean flag = true;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)%2 == 0){
                // System.out.println("Even number is there is list");
                evenList.add(arr.get(i));
                flag =false;
                // break;
            }
        }

        if(flag){
            System.out.println("Only odds are there in list");
        }
        else{
            System.out.println("Even number is there is list");
            System.out.println(evenList);
        }


    }
}
