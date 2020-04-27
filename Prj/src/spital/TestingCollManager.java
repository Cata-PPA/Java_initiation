package spital;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.util.List;

public class TestingCollManager {
    public static void main(String[] args) throws ParseException {
        CollectionManager manager=new CollectionManager();

        SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
  ////            visits of patients
            String visitOfPatient1="22/11/2017";
        Date visitDay1=sdf1.parse(visitOfPatient1);
            String visitOfPatient2="05/11/2016";
        Date visitDay2=sdf1.parse(visitOfPatient2);
            String visitOfPatient3="12/01/2018";
        Date visitDay3=sdf1.parse(visitOfPatient3);
   ////            birthday of patients/doctors

                String birthdayOfPatient1="23/05/1983";
        Date birthDay1=sdf1.parse(birthdayOfPatient1);
                String birthdayOfPatient2="15/12/1998";
        Date birthDay2=sdf1.parse(birthdayOfPatient2);
                String birthdayOfPatient3="05/05/1993";
        Date birthDay3=sdf1.parse(birthdayOfPatient3);

//// lista doctori
        Doctor d1=new Doctor("Socaciu", "Vasile", "Cluj-Napoca", 56, 180,
                "M", "ORL", 35, 153,birthDay1,"11545656"  );
        Doctor d2=new Doctor("Soc", "Vasi", "Zalau", 56, 180,
                "M", "Interne", 31, 124,birthDay2,"25656516"  );
        Doctor d3=new Doctor("Solor", "Vaslie", "Cluj-Napoca", 56, 180,
                "M", "ORL", 30, 112,birthDay3,"13566516"  );
        List<Doctor> doctorList=new ArrayList();
        doctorList.add(d1);
        doctorList.add(d2);
        doctorList.add(d3);

//// lista vizite medicale
        MedicalVisit medicalVisit1=new MedicalVisit("Raceala", "Paracetamol", visitDay1, d1);
        MedicalVisit medicalVisit2=new MedicalVisit("Gripa", "ParaSinus", visitDay2, d2);
        MedicalVisit medicalVisit3=new MedicalVisit("Durere", "Brufen", visitDay3, d3);
        List<MedicalVisit> mvisits=new ArrayList();
        mvisits.add(medicalVisit1);
        mvisits.add(medicalVisit2);
        mvisits.add(medicalVisit3);


        Pacient p1 = new Pacient("Raul", "Rola","Sibiu",21,176, "M",
                "Gripa", "Somer", birthDay1, "1930617323530", mvisits);
        Pacient p2 = new Pacient("Saul", "Rolo","Sibiu",21,186, "M",
                "Raceala", "Inginer", birthDay2, "1930617323530", mvisits);
        Pacient p3 = new Pacient("Paul", "Rolu","Sibiu",21,166, "M",
                "Durere", "Student", birthDay3, "1930617323530", mvisits);
        List<Pacient> pacientList=new ArrayList();
        pacientList.add(p1);
        pacientList.add(p2);
        pacientList.add(p3);

        List<Person> personList=new ArrayList();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(d1);
        personList.add(d2);
        personList.add(d3);


/////  testare metode metode metode

        boolean rezultat1=manager.findPersonByCnp(personList, "19617323530");
        System.out.println(rezultat1);

        List<Doctor> rezultat2=manager.extractDoctorList(personList);
        System.out.println(rezultat2);

        List<Pacient> rezultat3=manager.extractPacientLIst(personList);
        System.out.println(rezultat3);

        int rezultat4=manager.countDoctorBySpec(doctorList, "ORL");
        System.out.println(rezultat4);

        manager.modifyPacientByCnp(pacientList,"1930617323530","sofer");
        System.out.println(p1);





    }

}
