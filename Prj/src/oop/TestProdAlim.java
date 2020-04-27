package oop;

public class TestProdAlim {
    public static void main(String[] args){
        ProdAlim alim1=new ProdAlim("branzaafumata","lactate",25.3,12,"DeLaco","pozabranza", null);

        System.out.println(alim1.getName());
        System.out.println(alim1.getCategory());
        System.out.println(alim1.getPrice());
        System.out.println(alim1.getStock());
        System.out.println(alim1.getBrand());
        System.out.println(alim1.getImage());
        System.out.println(alim1.getExpirationDate());
    }
}
