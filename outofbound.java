import java.util.Scanner;
public class outofbound {

    public static void main(String args[])
    {
        int [] arr={1,2,3,4,5};

        // for(int i=0; i<=arr.length; i++)
        // {
        //     System.out.println("The array's are:"+arr[i]);
        // }

        try{
            System.out.println("The tength element is" +arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Its done");
        }
    }
    
}
