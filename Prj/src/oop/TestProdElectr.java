package oop;

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
    }
}
