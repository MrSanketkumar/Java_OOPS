class Person_Oops {
    int age;
    String name;
    String course;

    Person_Oops(int age , String name , String course){
        this.age=age;
        this.name = name;
        this.course=course;
        
    }

    public void Person_Info()
    {

        System.out.println("Hello Person class method");
    }

    public void info(Person_Oops person_Oops )
    {
        System.out.println("My Name is :"+this.name +" Age is : "+this.age+" i study in feild of : "+this.course);

    }

    public void celebrateBirthday() {
        age++;
    }
  
      

}


public class Main{
    public static void main(String[] args)
    {
        Person_Oops sanket = new Person_Oops(21,"Sanket","B.tech");
    
        sanket.Person_Info();
        sanket.celebrateBirthday();
        sanket.info(sanket);

        
    }
}
