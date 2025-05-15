// Swap number without using 3rd variable

public class SwapNumber {
    public static void main(String[] args) {
        int a =8, b=2;
        System.out.println("Before Swap");
        System.out.println("a = "+a+" b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap");
        System.out.println("a = "+a+" b = "+b);
    }
}
