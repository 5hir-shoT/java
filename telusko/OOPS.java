class Pen
{
    String colour;
    String type;

    public void write()
    {
        System.out.println("Writing something");
    }

    public void printColour()
    {
        System.out.println(this.colour);
    }
}

class Student
{
    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student()
    {
    System.out.println("Building Constructor");
    }

}




    public class OOPS
    {
        public static void main(String args[])
        {
            Student s1=new Student();
            s1.name="Shirsho";
            s1.age=25;

            s1.printInfo();
            
            
        }
    }