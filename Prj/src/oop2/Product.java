package oop2;

public class Product {
    private String name;
    private String category;
    private double price;
    private int stock;
    private String brand;
    private String image;


    //constructorul                                   constructorul
        public Product(String name,
                       String category,
                       double price,
                       int stock,
                       String brand,
                       String image){
            this.name=name;
            this.category=category;
            this.price=price;
            this.stock=stock;
            this.brand=brand;
            this.image=image;
        }

//getters                                    getters
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public double getPrice(){
        return price;
    }

    public int getStock(){
        return stock;
    }
    public String getBrand(){
        return brand;
    }
    public String getImage(){
        return image;
    }

// setters                                          setters
    public void setName(String name){
            this.name=name;
    }
    public void setCategory(String category){
            this.category=category;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public void setStock(int stock){
            this.stock=stock;
    }
    public void setBrand(String brand){
            this.brand=brand;
    }
    public void setImage(String image){
            this.image=image;
    }

    public void displayProduct(){
        System.out.println("Name of the product is "+name);
        System.out.println("Category of the product is "+category);
        System.out.println("Price of the product is "+price);
        System.out.println("Stock of the product is "+stock);
        System.out.println("Brand of the product is "+brand);
        System.out.println("Image of the product is "+image);


    }



}
