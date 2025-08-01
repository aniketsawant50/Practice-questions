import java.util.Scanner;
public class age_exception {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age");
        int age = sc.nextInt();

        checkAge(age);
        System.out.println("Program continues...");
    }
}
