package model;

public class TestDog {
    public static void main(String[] args){
     //   Dog dog1=new Dog();
     //   System.out.println(dog1.age);
     //   System.out.println(dog1.color);
     //   System.out.println(dog1.height);
     //   System.out.println(dog1.name);
     //   System.out.println(dog1.personName);

     //   dog1.age=2;
     //   dog1.color="red";
     //   dog1.height=56.5;
     //   dog1.name="Vlad";
     //   dog1.personName="Mircea";

     //   System.out.println(dog1.age);
     //   System.out.println(dog1.color);
     //   System.out.println(dog1.height);
     //   System.out.println(dog1.name);
     //   System.out.println(dog1.personName);


        Dog dog1=new Dog("Arco", 5, 25.2, "blue", "Marco" );



          System.out.println(dog1.getAge());
          System.out.println(dog1.getColor());
          System.out.println(dog1.getHeight());
          System.out.println(dog1.getName());
          System.out.println(dog1.getPersonName());
    }
}
