package spital;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testing {

    public static void main(String[] args) throws ParseException {


        SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
        String birthdayOfPatient="15/05/1993";
        Date birthDay=sdf1.parse(birthdayOfPatient);

        Pacient om1 = new Pacient("Raul", "Rol","Sibiu",21,176, "F", "Raceala", "Student", birthDay, "1930617323530", null);



        om1.setName("Andrei");
        System.out.println(om1.getName());

        om1.setAge(24);
        om1.setCity("Cluj-N");
        System.out.println(om1.getCity());
        om1.setGender("Masculin");
        System.out.println(om1.getGender());

        System.out.println(om1.getDateOfBirth());
        System.out.println(om1.getCnp());


    }


}

