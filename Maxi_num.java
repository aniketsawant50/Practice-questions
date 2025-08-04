import java.util.Scanner;

class Maxi_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1=10;
        int num2 = 30;

        int max_num = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum  between " + num1 + " and " + num2 + " is: " + max_num);
    }
}
