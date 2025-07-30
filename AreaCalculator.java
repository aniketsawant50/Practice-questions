class Area{
    double area(double side)
    {
        return side*side;

    }

    double area(double length, double breadth)
    {
        return length*breadth;
    }

    double area(int radius)
    {
        return 2*3.14*radius;
    }



}

class AreaCalculator{
public static void main(String args[])

{
    Area a = new Area();
    System.out.println("The area of square"+ a.area(2));
    System.out.println("The area ofTriangle"+a.area(2.3,4));
    System.out.println( "The area of circle"+a.area(5));
   
}
}