


// 2.Write a Java program that demonstrates method overriding by creating a superclass called
// Animal and two subclasses called Dog and Cat. ● The Animal class should have a method
// called makeSound(), which simply prints "The animal makes a sound." ● The Dog and Cat
// classes should override this method to print "TheCat/The dog meows/barks" respectively. ● The
// program should allow the user to create and display objects of each class.
// [Hint:Use multilevel inheritance]



class Animal
{
   void makesound()
   {
    System.out.println("Animals can sound");
   }
}

class Dog extends Animal
{
  void makesound()
  {
    System.out.println("The dog Barks");
  }
}

class Cat extends Animal
{
    void makesound()
  {
    System.out.println("The cat meow ");
  }

}

public class multilevel {
    public static void main(String[] args)
    {


        Animal a = new Animal();
        a.makesound();

        Dog d = new Dog();
        d.makesound();

        Cat c = new Cat();
        c.makesound();



    }
}
