package spital;

import java.util.Date;

public class Doctor extends Person {
    private String specializare;
    private int experience;
    private int id;

    //constructorul                                      constructorul
    public Doctor(String name,
                   String surname,
                   String city,
                   int age,
                   int height,
                   String gender,
                   String specializare,
                   int experience,
                   int id,
                   Date dateOfBirth,
                   String cnp) {
        super(name, surname, city, age, height, gender, dateOfBirth, cnp);
        this.specializare = specializare;
        this.experience = experience;
        this.id=id;
    }
    // getters                                           getters

    public String getSpecializare(){
        return specializare;
    }
    public int getExperience() {
        return experience;
    }
    public int getId(){
        return id;
    }


    // setters                                           setters
    public void setSpecializare(String specializare){
        this.specializare=specializare;
    }
    public void setExperience(int experience){
        this.experience=experience;
    }
    public void setId(int id){
        this.id=id;
    }




}
