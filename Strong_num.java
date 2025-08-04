import java.util.Scanner;

class StrongNumber {
    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }



static int checkstrong_num(int n) {
    int original = n;
    int sum = 0;

    while (n > 0) {
        int digit = n % 10;
        sum += factorial(digit);
        n /= 10;

    }

    String result = (sum == original) ? "Strong Number" : "Not A Strong number";
    System.out.println(original);
    System.out.println(result);
    return sum;
}
}

public class Strong_num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        
        StrongNumber.checkstrong_num(n);

    }
}