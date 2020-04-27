package oop;

public class TestProdVest {
    public static void main(String[] args){
        ProdVest vest1=new ProdVest("bluza","iarna",244.3,122,"Nike","pozabluza", 'S');

        System.out.println(vest1.getName());
        System.out.println(vest1.getCategory());
        System.out.println(vest1.getPrice());
        System.out.println(vest1.getStock());
        System.out.println(vest1.getBrand());
        System.out.println(vest1.getImage());
        System.out.println(vest1.getSize());
    }
}
