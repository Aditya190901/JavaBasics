//Pallindrome

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        char ch [] = new char[str.length()];
        for(int i =str.length()-1;i>=0;i--){
            ch[str.length()-1-i] = str.charAt(i);
        }

        String revString = new String(ch);
        if(revString.equals(str)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not a pallindrome");
        }

    }
}
