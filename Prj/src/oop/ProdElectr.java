package oop;

import java.util.Date;

public class ProdElectr extends Product{

    private int warranty;
    //constructorul                                   constructorul
   public ProdElectr(String name,
                     String category,
                     double price,
                     int stock,
                     String brand,
                     String image,
                     int warranty){
       super(name, category, price, stock, brand, image);
       this.warranty=warranty;

   }

    //getters                                    getters

    public int getWarranty() {
        return warranty;
    }

    // setters                                          setters
    public void setWarranty(int warranty){
        this.warranty=warranty;
    }





}
