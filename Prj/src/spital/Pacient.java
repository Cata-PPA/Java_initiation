package spital;

import java.util.Date;
import java.util.List;

public class Pacient extends Person {
    private String occupation;
    private String diagnostic;
    private List<MedicalVisit> medicalVisit;

    //constructorul                                      constructorul
    public Pacient(String name,
                   String surname,
                   String city,
                   int age,
                   int height,
                   String gender,
                   String diagnostic,
                   String occupation,
                   Date dateOfBirth,
                   String cnp,
                   List<MedicalVisit>  medicalVisit) {
        super(name, surname, city, age, height, gender, dateOfBirth, cnp);
        this.diagnostic = diagnostic;
        this.occupation = occupation;
    }
        // getters                                           getters

        public String getOccupation(){
            return occupation;
        }
        public String getDiagnostic() {
            return diagnostic;
        }
        public List<MedicalVisit> getMedicalVisit(){
            return medicalVisit;
        }


        // setters                                           setters
        public void setOccupation(String occupation){
            this.occupation=occupation;
        }
        public void setDiagnostic(String diagnostic){
        this.diagnostic=diagnostic;
    }
        public void setMedicalVisit(List<MedicalVisit> medicalVisit){
            this.medicalVisit=medicalVisit;
        }

        List<MedicalVisit>visits;
    public List<MedicalVisit> getVisits(){
        return visits;
    }


    @Override
    public boolean equals(Object o){
        Person p2=(Person)o;
        return getCnp().equals(p2.getCnp());

    }

    @Override
    public int hashCode(){
        return getCnp().hashCode();

    }

}

