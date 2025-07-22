import java.util.Scanner;
public class marks {

    public static void update(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = {4,7,9,2,6};
        update(marks);

        for (int i = 0; i < marks.length; i++) {
            
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
