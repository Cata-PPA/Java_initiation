package spital;

import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private String city;
    private int age;
    private int height;
    private String gender;
    private Date dateOfBirth;
    private String cnp;



    //constructorul                                   constructorul
    public Person( String name,
                   String surname,
                   String city,
                   int age,
                   int height,
                   String gender,
                   Date dateOfBirth,
                   String cnp){
        this.name=name;
        this.surname=surname;
        this.city=city;
        this.age=age;
        this.height=height;
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
        this.cnp=cnp;
    }

    // getters                                       getters
    public String getName(){
        return name;
    }
    public String getSurname(){
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
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public String getCnp(){
        return cnp;
    }

    // setters                                       setters
    public void setName(String name){
        this.name=name;
    }
    public void senSurname(String surname){
        this.surname=surname;
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
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setCnp(String cnp){
        this.cnp=cnp;
    }


}
