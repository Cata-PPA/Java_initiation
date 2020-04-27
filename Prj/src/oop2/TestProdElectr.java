package oop2;

public class TestProdElectr {
    public static void main(String[] args){
        ProdElectr electr1=new ProdElectr("Tastatura","periferice",15.3,2,"Acer","pozatastatura", 2);

        System.out.println(electr1.getName());
        System.out.println(electr1.getCategory());
        System.out.println(electr1.getPrice());
        System.out.println(electr1.getStock());
        System.out.println(electr1.getBrand());
        System.out.println(electr1.getImage());
        System.out.println(electr1.getWarranty());
        electr1.displayProduct();
        System.out.println("\n\n");

        Product cabluri=new Product("Cablaj","legaturi",50, 170, "Leroy", "imagineCablu2");
        cabluri.displayProduct();
        System.out.println("\n\n");

        // caz polimorfism
        Product cabluri2=new ProdElectr("Cablaj","legaturi",0.50, 100, "Leroy", "imagineCablu",3);
        cabluri2.displayProduct();
        cabluri2.setName("cablaj2");
        // nu merge setat warranty-ul, atunci facem o convertire: declaram o variabila de tipul dorit(in partea stanga), in dreapta punem
        // conversia dorita obiectului(in paranteza) => avem acces la setteri pentru modificarea obiectului prin metodele din clasa tinta
        ProdElectr cabluri2Conv=(ProdElectr) cabluri2;
        cabluri2Conv.setWarranty(5);
        cabluri2Conv.displayProduct();
        System.out.println("\n");

        //metoda noua de crestere a garantiei
        cabluri2Conv.increaseWarr(3);
        cabluri2Conv.displayProduct();

        // string modifier
        String testText="Apa minerala necarbogazoasa (plata)_500 ml!";
        int leng=testText.length();
        System.out.println(leng);

        int charAT=testText.charAt(5);
        System.out.println(charAT);


        String rePl=testText.replace('a','L');
        System.out.println(rePl);

        String cOnCat=testText.concat(" 12546.46616146");
        System.out.println(cOnCat);

        String[] cuvinte=testText.split(" ");
        int a=cuvinte.length;
        int i=0;
        while(i<a){
            System.out.println(cuvinte[i]);
            i++;
        }

        String texturi="mai multe texturi de texte";
        boolean ver=texturi.equals(testText);
        System.out.println(ver);

        String texturi2="Apa minerala necarbogazoasa (plata)_500 ml!";
        boolean ver2=texturi2.equals(testText);
        System.out.println(ver2);

        String[] cuvinte3=testText.split("e");
        for(String as:cuvinte3){
            System.out.println(as);
        }

        System.out.println(electr1);



    }


}
