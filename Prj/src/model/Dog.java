package model;

public class Dog {
   String name;
   int age;
   double height;
   String color;
   String personName;
   public Dog(String name,
              int age,
              double height,
              String color,
              String personName){
       this.name=name;
       this.age=age;
       this.height=height;
       this.color=color;
       this.personName=personName;
   }

   //getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }
    public String getColor(){
        return color;
    }
    public String getPersonName(){
        return personName;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPersonName(String personName){
        this.personName=personName;
    }

}

