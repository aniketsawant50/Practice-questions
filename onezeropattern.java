public class onezeropattern {
    public static void main(String args[])
    {
        int n = 5;
        for(int i=1; i<=n; i++) {
            int num = 1;
            for(int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num = 1 - num;
            }
            System.out.println();
        }
    }
    
}


// 
// 1 
// 1 0 
// 1 0 1 
// 1 0 1 0 
// 1 0 1 0 1

