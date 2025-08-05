import java.util.Scanner;
class User
{
    int id;
    String User_name;

    User(int id, String User_name)
    {
        this.id= id;
        this.User_name=User_name;
    }


 }

 class Employee  extends User
 {
    
   double salary;

    Employee(int id, String User_name) {
        super(id, User_name);

        
      
    }

   

 }
  public class annual_salary {

    public static void main(String [] args)
    {
        Employee e = new Employee(1, "John");
        e.salary = 240000;

        System.out.println("Annual Salary:" +e.salary);

    }
    
}

