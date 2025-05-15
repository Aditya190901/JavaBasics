//Reverse a String

public class ReverseString {
    public static void main(String args[]){
        System.out.println(reverse("aditya"));
    }
    private static String reverse(String string) {
        char [] reversechar =new char[string.length()];
        char[] newString = string.toCharArray();
        int l = newString.length;
        for(int i=l-1; i>=0;i--){
            reversechar[l-1-i]=newString[i];
        }
        String reverseString = new String(reversechar);

        return reverseString;
    }
}