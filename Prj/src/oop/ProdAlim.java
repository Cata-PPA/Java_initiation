package oop;

import java.util.Date;

public class ProdAlim extends Product{

    private Date expirationDate;

    //constructorul                                   constructorul
   public ProdAlim(String name,
                   String category,
                   double price,
                   int stock,
                   String brand,
                   String image,
                   Date expirationDate){
       super(name, category, price, stock, brand, image);
       this.expirationDate=expirationDate;

   }

    //getters                                    getters

    public Date getExpirationDate(){
        return expirationDate;
    }

    // setters                                          setters

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }



}
