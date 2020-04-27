public class Operators {
    public static void main(String[] args){
        System.out.println("Hello, World");
        System.out.println("ddd");
        int currentYear = 2019;
        System.out.println(currentYear);
        System.out.println("Suntem in anul " + currentYear);
        int currentDay = 6;
        System.out.println("Suntem in ziua " + currentDay);
        int a = 2;
        int b = 6;
        int sum = a + b;
        int product = a * b;
        System.out.println("Suma este " + sum);
        System.out.println("Produsul este " + product);
        int c = 4;
        int d = 3;
        int e = 5;
        int result = ((a + b)/c*a-d*e)*a;
        System.out.println("Rezultatul este " + result);
        int laturaLongitudinala = 4;
        int laturaOrizontala = 8;
        int area = laturaOrizontala * laturaLongitudinala;
        int perimeter = 2*laturaLongitudinala + 2*laturaOrizontala;
        System.out.println("Perimetrul este " + perimeter + " iar aria este " + area);
        int minutes=3456789;
        int hours = minutes / 60;
        int days = hours / 24;
        int year = days / 365;
        System.out.println(" Minute "+minutes + " Zile "+ days + " ore " + hours + " years "+ year);
        int age = 10;
        if (age>18){
            System.out.println("Este eligibil sa voteze");
        }
        else {
            System.out.println("Nu poate vota");
        }

        int number = 0;
        if (number>=0){
            System.out.println("Este pozitiv sau zero");
        }
        else {
            System.out.println("Este negativ");
        }

        int dayInWeek = 1;
        if (dayInWeek == 1){
            System.out.println("E ziua de luni");
        }
        else if (dayInWeek == 2){
            System.out.println("E ziua de marti");
        }
        else if (dayInWeek == 3){
            System.out.println("E ziua de miercuri");
        }
        else if (dayInWeek == 4){
            System.out.println("E ziua de joi");
        }
        else if (dayInWeek == 5){
            System.out.println("E ziua de vineri");
        }
        else if (dayInWeek == 6){
            System.out.println("E ziua de sambata");
        }
        else {
            System.out.println("E ziua de duminica");
        }


        int calificativ = 7;

        if (calificativ > 8){
            System.out.println("FB");
        }
        else if (calificativ > 6){
            System.out.println("B");
        }
        else if (calificativ > 5){
            System.out.println("S");
        }
        else {
            System.out.println("I");
        }


        int x = 1;
        int y = 71;
        int z = 3;
        int sumaPrimelorDoua= x + y;
        if (sumaPrimelorDoua>z){
            System.out.println("Suma este mai mare ca numarul 3");
        }
        else {
            System.out.println("Suma nu este mai mare");
        }

        int x1 = 1;
        int y1 = 2;
        int z1 = 3;

        if (x1>y1) {
            if (y1 > z1) {
                System.out.println("Numerele sunt in ordine descrescatoare");
            } else {
                System.out.println("Nu sunt ordonate");
            }
        }
        else if (x1 < y1) {
                if (y1 < z1) {
                    System.out.println("Numerele sunt in ordine crescatoare");
                }
                else {
                    System.out.println("Nu sunt ordonate");
                }
            }
            else {
                System.out.println("Nu sunt ordonate");
            }

        int calificativ2 = 4;

        if (calificativ2 == 9 || calificativ2 == 10){
            System.out.println("FB");
        }
        else if (calificativ2 == 8 || calificativ2 == 7){
            System.out.println("B");
        }
        else if (calificativ2 == 6 || calificativ2 == 5){
            System.out.println("S");
        }
        else {
            System.out.println("I");
        }

        int numarator=1;
        System.out.println(numarator);
        while (numarator<100){
            numarator=numarator+1;
            System.out.println(numarator);
        }


        int numerePare=0;
        while (numerePare < 51){
            if ((numerePare % 2)==0){
                System.out.println(numerePare);
            }
            else{}
            numerePare=numerePare + 1;
        }


        int numereImpare=100;
        while (numereImpare > 49){
            if ((numereImpare % 2)==1){
                System.out.println(numereImpare);
            }
            else{}
            numereImpare=numereImpare - 1;
        }


        System.out.println("alt exemplu");
        int i = 1;
        int alteNumere=11;
        while (i < 21){
            if ((alteNumere % 3)==0){
                System.out.println(alteNumere);
                i=i+1;
            }
            else{}
            alteNumere=alteNumere + 1;
        }


        System.out.println("alt exemplu");
        int i1 = 0;
        int numarNou=11;
        int pprodus;
        while (numarNou >= i1){
                pprodus=numarNou * i1;
                System.out.println(pprodus+" = "+numarNou+" x "+i1);
                i1=i1+1;
        }


        System.out.println("////alt exemplu");
        int i2 = 10;
        int cifra;
        int nNou=1253;
        int ssuuma=0;
        while (nNou>0){
            cifra=(nNou % 10);
            nNou=nNou/i2;
            ssuuma=ssuuma+cifra;
            System.out.println(ssuuma);
        }




        }
    }

