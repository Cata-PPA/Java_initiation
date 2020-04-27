package oop2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestProdAlim {
    public static void main(String[] args) throws ParseException {

        //Date currentDate=new Date();
      //  Date expirDate=new Date();

        SimpleDateFormat sdf1=new SimpleDateFormat("dd-M-yyyy");
        SimpleDateFormat sdf2=new SimpleDateFormat("MM-yyyy");
    //Mai jos se formateaza current si expir date, folosind format, ca e variabila de tip Date
     //   String newDate1= sdf1.format(currentDate);
      //  System.out.println(newDate1);
       // String newDate2 = sdf2.format(expirDate);
       // System.out.println(newDate2);
      //Mai jos folosim parse pentru a converti in variabila de tip Date din String
        String futureDate = "1-1-2022";
        String dateOfBirth = "22-02-1922";
        Date future =  sdf1.parse(futureDate);
        Date  birth = sdf1.parse(dateOfBirth);

        ProdAlim alim1=new ProdAlim("branzaafumata","lactate",25.3,12,"DeLaco","pozabranza", future);

        System.out.println(alim1.getName());
        System.out.println(alim1.getCategory());
        System.out.println(alim1.getPrice());
        System.out.println(alim1.getStock());
        System.out.println(alim1.getBrand());
        System.out.println(alim1.getImage());
        System.out.println(alim1.getExpirationDate());
        // observam cum functioneaza date
       // System.out.println(sdf1.parse(currentDate));

      //  System.out.println(expirDate);

    }
}
