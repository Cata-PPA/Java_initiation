package oop2;

public class ProdElectr extends Product {

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

    @Override
    public void displayProduct(){
        super.displayProduct();
        System.out.println("Warranty is "+warranty);
    }

    public void increaseWarr(int n){
       warranty=n+warranty;
    }


    @Override
    public String toString(){
       return  "\nname=" +getName()+
               "\ncategory=" +getCategory()+
               "\nprice="+getPrice()+
               "\nstock="+getStock()+
               "\nbrand="+getBrand()+
               "\nimage="+getImage()+
               "\nwarranty="+getWarranty();
    }



}
