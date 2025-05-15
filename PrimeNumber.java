//check whether number is prime or not

public class PrimeNumber {
    public static void main(String[] args) {
        int number =13;
        boolean flag = true;
        if(number <=1){
            flag = false;
        }
        else{
            for(int i=2;i<=number/2;i++){
                if(number%i == 0){
                    flag =false;
                    break;
                }
            }
        }

        if(flag){
            System.out.println("number "+number+" is a prime number");
        }
        else{
            System.out.println("number "+number+" is not a prime number");
        }
    }
}
