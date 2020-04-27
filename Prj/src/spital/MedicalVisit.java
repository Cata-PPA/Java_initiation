package spital;

import java.util.Date;

public class MedicalVisit {
    private String diagnostic;
    private String treatment;
    private Date data;
    private Doctor doctor;

    public MedicalVisit(String diagnostic, String treatment, Date data, Doctor doctor){
        this.data=data;
        this.diagnostic=diagnostic;
        this.treatment=treatment;
        this.doctor=doctor;
    }
//getters
    public String getDiagnostic(){
        return diagnostic;
    }
    public String getTreatment(){
        return treatment;
    }
    public Date getData(){
        return data;
    }
    public Doctor getDoctor(){
        return doctor;
    }

//setters
    public void setDiagnostic(String diagnostic){
        this.diagnostic=diagnostic;
    }
    public void setTreatment(String treatment) {
        this.treatment=treatment;
    }
    public void setData(Date data){
        this.data=data;
    }
    public void setDoctor(Doctor doctor){
        this.doctor=doctor;
    }


}
