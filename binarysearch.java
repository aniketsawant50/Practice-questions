import java.util.Scanner;

public class binarysearch {

    public static int binary(int arr[],int key)
    {
        int start = 0,end= arr.length - 1;
        
        while(start <=end)
        {
            int mid = (start + end/2);

            if(arr[mid] == key)
            {
                return mid;
            }
            else if(arr[mid]< key)
            {
                start = mid +1;
            }
            else
            {
                start = mid-1;
            }
            

        }
        return -1;

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        
        int [] arr= new int [n];
        for(int i = 0; i<n;i++)
        {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the key");
        int key = sc.nextInt();

      
        int found = binary(arr, key);
        System.out.println(found);

    }
}
