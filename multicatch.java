import java.util.Scanner;

public class multicatch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int result;
        try {

            int[] arr = {1, 2, 3, 4, 5, 0};
           
            System.out.println(arr[10]);

             result = arr[1] / 0;
            System.out.println(result);
        }
        
        catch (ArrayIndexOutOfBoundsException e) {
          
            System.out.println(e);
        }

         catch (ArithmeticException e) {
            System.out.println(e);
        } 
    }
}
