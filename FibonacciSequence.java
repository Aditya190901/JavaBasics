//Fibonacci Sequence Without Recursion
public class FibonacciSequence {
    public static void main(String[] args) {
        //Without recursion
        int number = 220;
        int a = 0, b =1,c;
        System.out.print(a+" ");
        System.out.print(b+ " ");
        for(int i=2;i<number;i++){
            c= a+b;
            a=b;
            b=c;
            System.out.print(c+ " ");
        }
    }
}
