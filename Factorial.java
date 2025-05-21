public class Factorial {
    public static void main(String[] args) {
        //without recursion
        // int n = 5;
        // int fact = 1;
        // for(int i =1;i<=n;i++){
        //     fact = fact * i;
        // }
        // System.out.println(fact);
        System.out.println(factorial(5));
    }

    private static int factorial (int n){
        if(n==1){
            return n;
        }
        else{
            return (n* factorial(n-1));
        }
    }
}
