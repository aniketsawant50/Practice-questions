import java.util.Scanner;
public class decimalcon {
    public static void dectobin(int decno)
    {
        int pow = 0;
        int binno = 0;

        while (decno > 0) {
            int rem = decno % 2;
            binno = binno + rem * (int)Math.pow(10, pow);
            pow++;
            decno = decno / 2;
        }

        System.out.println(binno);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();


        dectobin(num);
    }
}
