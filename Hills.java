/*1. Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg.
Subclasses extend the superclass and override its location() and famousFor() method. i.call the
location() and famousFor() method by the Parent class’, i.e. Hillstations class. As it refers to the
base class object and the base class method overrides the superclass method; the base class
method is invoked at runtime. ii.call the location() and famousFor() method by the all
subclass’,and print accordingly.*/

import java.util.Scanner;

class Hillstations
{

    void locations()
    {
        System.out.println("Location:");

    }

    void faemousfor()
    {
        System.out.println("Famous for:");

    }

}

class Manali extends Hillstations
{

    void location()
    {
    System.out.println("Manali is in himachal pradesh");
    
    }
    void faemousfor()
    {
        System.out.println("The Manali is famous Hadimba temple and its Adventure");
    }


}

class Mussoorie extends Hillstations
{
    void location()
    {

    System.out.println("Mussoorie in Utrakhand");
    
    }
    void faemousfor()
    {
        System.out.println("The city is famous for the education");
    }


}

class Gulmarg extends Hillstations
{
    void locations()
    {
        System.out.println("Gulmarg in j& k");
       
    }
    void faemousfor()
    {
         System.out.println("The famous for skiies");
    }

}
public class Hills{

    public static void main(String[] args)
    {
        Hillstations g = new Hillstations();
        g.locations();
        g.faemousfor();

        Mussoorie m = new Mussoorie();
        m.location();
        m.faemousfor();

        Manali mn = new Manali();
        mn.location();
        mn.faemousfor();

        Gulmarg h = new Gulmarg();
        h.locations();
        h.faemousfor();




    }
}