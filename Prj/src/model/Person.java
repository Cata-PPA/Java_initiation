package model;

public class Person {
   private String name;
   private String city;
   private int age;
   private int height;
   private String gender;


// getters
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
    public int getAge(){
        return age;
    }
    public int getHeight(){
        return height;
    }
    public String getGender(){
        return gender;
    }
// setters
    public void setName(String name){
        this.name=name;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public void setGender(String gender){
        this.gender=gender;
    }


}


