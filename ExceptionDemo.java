import java.util.*;
public class ExceptionDemo {
    public static void main(String[] args) {
        int n=5;
        try{
            System.out.println(n/0);
        }
        catch(Exception e){
            System.err.println(e);
        }
        finally{
            System.out.println("Program Completed");
        }
    }
}
