

class Poly{

  int add(int a,int b)
  {
    return a+b;
  }

  int add(int a, int b , int c)
  {
     return a+b+c;

  }

  int add(int a, int b, int c ,int d)
  {
    return a+b+c+d;
  }

}



    public class Overloading{

    public static void main(String args[])
    {
        Poly s = new Poly();
        System.out.println("The addition is"+s.add(2,3));
        System.out.println("The addition is"+s.add(2,3,4));
        System.out.println("The addition is"+s.add(2,3,4,5));

    }
    
}

