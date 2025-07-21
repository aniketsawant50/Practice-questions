import java.util.Scanner;
public class binarycon {
    public static void bintodev(int binno)
    {
        int pow = 0;
        int decno=0;


        while (binno >0) {
            int lastdig = binno % 10;
            decno =decno + (lastdig*(int)Math.pow(2,pow));
            pow++;

            binno/=10;

            
        }
        System.out.println(decno);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
       

        bintodev(111);
    }
}
