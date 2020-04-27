package oop2;

public class ProdVest extends Product {
    private char size;

    //constructorul                                   constructorul
   public ProdVest(String name,
                   String category,
                   double price,
                   int stock,
                   String brand,
                   String image,
                   char size){
       super(name, category, price, stock, brand, image);
       this.size=size;
   }



    //getters                                    getters
    public char getSize() {
        return size;
    }
    // setters                                          setters

    public void setSize(char size){
        this.size=size;
    }


}
