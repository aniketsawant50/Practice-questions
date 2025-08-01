import java.util.Scanner;
class Arithmetic{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numerator");
        int num1 = sc.nextInt();

        System.out.println("Enter the denominator");
        int num2 = sc.nextInt();

        try{

            int result = num1 /num2;

            System.out.println("The result is "+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("It's done");
        }


    }
}